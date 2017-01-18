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
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: dstore/elastic/elasticservice.proto")
public class ElasticGrpc {

  private ElasticGrpc() {}

  public static final String SERVICE_NAME = "dstore.elastic.Elastic";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.item.Get.Request,
      io.dstore.elastic.item.Get.Response> METHOD_ITEM_GET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.elastic.Elastic", "itemGet"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Get.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Get.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.dstore.elastic.item.Suggest.Request,
      io.dstore.elastic.item.Suggest.Response> METHOD_ITEM_SUGGEST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "dstore.elastic.Elastic", "itemSuggest"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Suggest.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.elastic.item.Suggest.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ElasticStub newStub(io.grpc.Channel channel) {
    return new ElasticStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ElasticBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ElasticBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ElasticFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ElasticFutureStub(channel);
  }

  /**
   */
  public static abstract class ElasticImplBase implements io.grpc.BindableService {

    /**
     */
    public void itemGet(io.dstore.elastic.item.Get.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Get.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ITEM_GET, responseObserver);
    }

    /**
     */
    public void itemSuggest(io.dstore.elastic.item.Suggest.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ITEM_SUGGEST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ITEM_GET,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.dstore.elastic.item.Get.Request,
                io.dstore.elastic.item.Get.Response>(
                  this, METHODID_ITEM_GET)))
          .addMethod(
            METHOD_ITEM_SUGGEST,
            asyncUnaryCall(
              new MethodHandlers<
                io.dstore.elastic.item.Suggest.Request,
                io.dstore.elastic.item.Suggest.Response>(
                  this, METHODID_ITEM_SUGGEST)))
          .build();
    }
  }

  /**
   */
  public static final class ElasticStub extends io.grpc.stub.AbstractStub<ElasticStub> {
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

    /**
     */
    public void itemGet(io.dstore.elastic.item.Get.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Get.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_ITEM_GET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void itemSuggest(io.dstore.elastic.item.Suggest.Request request,
        io.grpc.stub.StreamObserver<io.dstore.elastic.item.Suggest.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ITEM_SUGGEST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ElasticBlockingStub extends io.grpc.stub.AbstractStub<ElasticBlockingStub> {
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

    /**
     */
    public java.util.Iterator<io.dstore.elastic.item.Get.Response> itemGet(
        io.dstore.elastic.item.Get.Request request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_ITEM_GET, getCallOptions(), request);
    }

    /**
     */
    public io.dstore.elastic.item.Suggest.Response itemSuggest(io.dstore.elastic.item.Suggest.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ITEM_SUGGEST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ElasticFutureStub extends io.grpc.stub.AbstractStub<ElasticFutureStub> {
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.dstore.elastic.item.Suggest.Response> itemSuggest(
        io.dstore.elastic.item.Suggest.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ITEM_SUGGEST, getCallOptions()), request);
    }
  }

  private static final int METHODID_ITEM_GET = 0;
  private static final int METHODID_ITEM_SUGGEST = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ElasticImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ElasticImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ITEM_GET:
          serviceImpl.itemGet((io.dstore.elastic.item.Get.Request) request,
              (io.grpc.stub.StreamObserver<io.dstore.elastic.item.Get.Response>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ITEM_GET,
        METHOD_ITEM_SUGGEST);
  }

}