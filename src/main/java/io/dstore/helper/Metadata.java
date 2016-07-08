package io.dstore.helper;

/**
 * Created by bdolkemeier on 08.07.16.
 */
public class Metadata {
    public static io.grpc.Metadata.Key<String> dstoreEngineReturnStatus =
            io.grpc.Metadata.Key.of("dstore-engine-returnstatus", io.grpc.Metadata.ASCII_STRING_MARSHALLER);
}
