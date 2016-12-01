package io.dstore.helper;

/**
 * Created by bdolkemeier on 08.07.16.
 */
public class DstoreMetadata {

    public static final io.grpc.Metadata.Key<String> engineReturnStatus =
            io.grpc.Metadata.Key.of("dstore-engine-returnstatus", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> username =
            io.grpc.Metadata.Key.of("dstore-username", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> password =
            io.grpc.Metadata.Key.of("dstore-password", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> accessToken =
            io.grpc.Metadata.Key.of("dstore-accesskey", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

}
