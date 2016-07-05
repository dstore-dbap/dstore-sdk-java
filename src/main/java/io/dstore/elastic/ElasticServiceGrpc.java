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
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.1)",
    comments = "Source: dstore/elastic/elasticservice.proto")
public class ElasticServiceGrpc {

  private ElasticServiceGrpc() {}

  public static final String SERVICE_NAME = "dstore.elastic.ElasticService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.item.FacetedNavigation.Request,
      io.dstore.elastic.item.FacetedNavigation.Response> METHOD_FACETED_NAVIGATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.elastic.ElasticService", "facetedNavigation"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.FacetedNavigation.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.FacetedNavigation.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.item.Suggest.Request,
      io.dstore.elastic.item.Suggest.Response> METHOD_ITEM_SUGGEST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "dstore.elastic.ElasticService", "itemSuggest"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Suggest.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Suggest.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ElasticServiceStub newStub(io.grpc.Channel channel) {
    return new ElasticServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ElasticServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ElasticServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ElasticServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ElasticServiceFutureStub(channel);
  }

  /**
   */
  public static interface ElasticService {

    /**
     */
    public void facetedNavigation(io.dstore.elastic.item.FacetedNavigation.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response> responseObserver);

    /**
     */
    public void itemSuggest(io.dstore.elastic.item.Suggest.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractElasticService implements ElasticService, io.grpc.BindableService {

    @java.lang.Override
    public void facetedNavigation(io.dstore.elastic.item.FacetedNavigation.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FACETED_NAVIGATION, responseObserver);
    }

    @java.lang.Override
    public void itemSuggest(io.dstore.elastic.item.Suggest.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ITEM_SUGGEST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ElasticServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface ElasticServiceBlockingClient {

    /**
     */
    public java.util.Iterator<io.dstore.elastic.item.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.item.FacetedNavigation.Request request);

    /**
     */
    public io.dstore.elastic.item.Suggest.Response itemSuggest(io.dstore.elastic.item.Suggest.Request request);
  }

  /**
   */
  public static interface ElasticServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.elastic.item.Suggest.Response> itemSuggest(
        io.dstore.elastic.item.Suggest.Request request);
  }

  public static class ElasticServiceStub extends io.grpc.stub.AbstractStub<ElasticServiceStub>
      implements ElasticService {
    private ElasticServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void facetedNavigation(io.dstore.elastic.item.FacetedNavigation.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FACETED_NAVIGATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void itemSuggest(io.dstore.elastic.item.Suggest.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ITEM_SUGGEST, getCallOptions()), request, responseObserver);
    }
  }

  public static class ElasticServiceBlockingStub extends io.grpc.stub.AbstractStub<ElasticServiceBlockingStub>
      implements ElasticServiceBlockingClient {
    private ElasticServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<io.dstore.elastic.item.FacetedNavigation.Response> facetedNavigation(
        io.dstore.elastic.item.FacetedNavigation.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FACETED_NAVIGATION, getCallOptions(), request);
    }

    @java.lang.Override
    public io.dstore.elastic.item.Suggest.Response itemSuggest(io.dstore.elastic.item.Suggest.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ITEM_SUGGEST, getCallOptions(), request);
    }
  }

  public static class ElasticServiceFutureStub extends io.grpc.stub.AbstractStub<ElasticServiceFutureStub>
      implements ElasticServiceFutureClient {
    private ElasticServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElasticServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElasticServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElasticServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.elastic.item.Suggest.Response> itemSuggest(
        io.dstore.elastic.item.Suggest.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ITEM_SUGGEST, getCallOptions()), request);
    }
  }

  private static final int METHODID_FACETED_NAVIGATION = 0;
  private static final int METHODID_ITEM_SUGGEST = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ElasticService serviceImpl;
    private final int methodId;

    public MethodHandlers(ElasticService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FACETED_NAVIGATION:
          serviceImpl.facetedNavigation((io.dstore.elastic.item.FacetedNavigation.Request) request,
              (io.grpc.stub.StreamObserver<io.dstore.elastic.item.FacetedNavigation.Response>) responseObserver);
          break;
        case METHODID_ITEM_SUGGEST:
          serviceImpl.itemSuggest((io.dstore.elastic.item.Suggest.Request) request,
              (io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ElasticService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_FACETED_NAVIGATION,
          asyncServerStreamingCall(
            new MethodHandlers<
              io.dstore.elastic.item.FacetedNavigation.Request,
              io.dstore.elastic.item.FacetedNavigation.Response>(
                serviceImpl, METHODID_FACETED_NAVIGATION)))
        .addMethod(
          METHOD_ITEM_SUGGEST,
          asyncUnaryCall(
            new MethodHandlers<
              io.dstore.elastic.item.Suggest.Request,
              io.dstore.elastic.item.Suggest.Response>(
                serviceImpl, METHODID_ITEM_SUGGEST)))
        .build();
  }
}
