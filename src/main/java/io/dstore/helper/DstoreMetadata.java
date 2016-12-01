package io.dstore.helper;

/**
 * Created by bdolkemeier on 08.07.16.
 */
public class DstoreMetadata {

    public static final io.grpc.Metadata.Key<String> ENGINE_RETURN_STATUS_KEY =
            io.grpc.Metadata.Key.of("dstore-engine-returnstatus", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> USERNAME_KEY =
            io.grpc.Metadata.Key.of("dstore-username", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> PASSWORD_KEY =
            io.grpc.Metadata.Key.of("dstore-password", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

    public static final io.grpc.Metadata.Key<String> ACCESS_TOKEN_KEY =
            io.grpc.Metadata.Key.of("dstore-accesskey", io.grpc.Metadata.ASCII_STRING_MARSHALLER);

}
