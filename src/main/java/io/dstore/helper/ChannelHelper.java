package io.dstore.helper;

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

    public static ManagedChannelImpl getSslChannel(String host, int port) throws SSLException {
        return getSslChannel(host, port, null);
    }

    public static ManagedChannelImpl getSslChannel(String host, int port, String caFile) throws SSLException {

        NettyChannelBuilder channelBuilder = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.TLS);

        if (caFile != null)
            channelBuilder.sslContext(GrpcSslContexts.forClient().trustManager(ClassLoader.class.getResourceAsStream(caFile)).build());
        else
            channelBuilder.sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build());

        return channelBuilder.build();
    }

}
