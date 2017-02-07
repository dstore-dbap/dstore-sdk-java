package io.dstore.helper;

import io.grpc.ManagedChannel;
import io.grpc.internal.ManagedChannelImpl;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

/**
 * Created by bdolkemeier on 17.01.17.
 */
public class ChannelHelper {

    public static ManagedChannel getSslChannel(String host, int port) throws SSLException {
        return getSslChannel(host, port, null);
    }

    public static ManagedChannel getSslChannel(String host, int port, String caFile) throws SSLException {

        NettyChannelBuilder channelBuilder;

        // Do we have a match on an ip address? May be extendend to support ipv6 in future
        if (host.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$"))
            channelBuilder = NettyChannelBuilder.forAddress(host,port);
        else
            // DNS load-balancing is described here: https://github.com/grpc/grpc/blob/master/doc/load-balancing.md
            channelBuilder = NettyChannelBuilder.forTarget("dns:///" + host + ":" + port);

        setSsl(channelBuilder,caFile);

        return channelBuilder.build();
    }

    private static NettyChannelBuilder setSsl (NettyChannelBuilder channelBuilder, String caFile) throws SSLException {

        channelBuilder.negotiationType(NegotiationType.TLS);

        if (caFile != null)
            channelBuilder.sslContext(GrpcSslContexts.forClient().trustManager(ClassLoader.class.getResourceAsStream(caFile)).build());
        else
            channelBuilder.sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build());

        return channelBuilder;
    }
}
