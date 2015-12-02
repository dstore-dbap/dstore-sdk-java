package io.dstore.elastic;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ElasticGrpc {

  private ElasticGrpc() {}

  public static final String SERVICE_NAME = "dstore.elastic.Elastic";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.FacetedNavigation.Parameters,
      io.dstore.elastic.FacetedNavigation.Response> METHOD_FACETED_NAVIGATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.elastic.Elastic", "facetedNavigation"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.FacetedNavigation.Parameters.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.FacetedNavigation.Response.getDefaultInstance()));

  public static ElasticStub newStub(io.grpc.Channel channel) {
    return new ElasticStub(channel);
  }

  public static ElasticBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ElasticBlockingStub(channel);
  }

  public static ElasticFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ElasticFutureStub(channel);
  }

  public static interface Elastic {

    public void facetedNavigation(io.dstore.elastic.FacetedNavigation.Parameters request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.FacetedNavigation.Response> responseObserver);
  }

  public static interface ElasticBlockingClient {

    public java.util.Iterator<io.dstore.elastic.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.FacetedNavigation.Parameters request);
  }

  public static interface ElasticFutureClient {
  }

  public static class ElasticStub extends io.grpc.stub.AbstractStub<ElasticStub>
      implements Elastic {
    private ElasticStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticStub(channel, callOptions);
    }

    @java.lang.Override
    public void facetedNavigation(io.dstore.elastic.FacetedNavigation.Parameters request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.FacetedNavigation.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FACETED_NAVIGATION, getCallOptions()), request, responseObserver);
    }
  }

  public static class ElasticBlockingStub extends io.grpc.stub.AbstractStub<ElasticBlockingStub>
      implements ElasticBlockingClient {
    private ElasticBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<io.dstore.elastic.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.FacetedNavigation.Parameters request) {
      return blockingServerStreamingCall(
          getChannel().newCall(METHOD_FACETED_NAVIGATION, getCallOptions()), request);
    }
  }

  public static class ElasticFutureStub extends io.grpc.stub.AbstractStub<ElasticFutureStub>
      implements ElasticFutureClient {
    private ElasticFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticFutureStub(channel, callOptions);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Elastic serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_FACETED_NAVIGATION,
        asyncServerStreamingCall(
          new io.grpc.stub.ServerCalls.ServerStreamingMethod<
              io.dstore.elastic.FacetedNavigation.Parameters,
              io.dstore.elastic.FacetedNavigation.Response>() {
            @java.lang.Override
            public void invoke(
                io.dstore.elastic.FacetedNavigation.Parameters request,
                io.grpc.stub.StreamObserver<io.dstore.elastic.FacetedNavigation.Response> responseObserver) {
              serviceImpl.facetedNavigation(request, responseObserver);
            }
          })).build();
  }
}
