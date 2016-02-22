package io.dstore.engine;

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
public class EngineGrpc {

  private EngineGrpc() {}

  public static final String SERVICE_NAME = "dstore.engine.Engine";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.engine.Procedure.Call,
      io.dstore.engine.Procedure.Response> METHOD_EXEC_PROCEDURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "dstore.engine.Engine", "execProcedure"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Call.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<io.dstore.engine.Procedure.Call,
      io.dstore.engine.Procedure.Response> METHOD_EXEC_BATCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "dstore.engine.Engine", "execBatch"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Call.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.dstore.engine.Procedure.Response.getDefaultInstance()));

  public static EngineStub newStub(io.grpc.Channel channel) {
    return new EngineStub(channel);
  }

  public static EngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EngineBlockingStub(channel);
  }

  public static EngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EngineFutureStub(channel);
  }

  public static interface Engine {

    public void execProcedure(io.dstore.engine.Procedure.Call request,
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver);

    public io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Call> execBatch(
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver);
  }

  public static interface EngineBlockingClient {

    public java.util.Iterator<io.dstore.engine.Procedure.Response> execProcedure(
        io.dstore.engine.Procedure.Call request);
  }

  public static interface EngineFutureClient {
  }

  public static class EngineStub extends io.grpc.stub.AbstractStub<EngineStub>
      implements Engine {
    private EngineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineStub(channel, callOptions);
    }

    @java.lang.Override
    public void execProcedure(io.dstore.engine.Procedure.Call request,
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXEC_PROCEDURE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Call> execBatch(
        io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_EXEC_BATCH, getCallOptions()), responseObserver);
    }
  }

  public static class EngineBlockingStub extends io.grpc.stub.AbstractStub<EngineBlockingStub>
      implements EngineBlockingClient {
    private EngineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<io.dstore.engine.Procedure.Response> execProcedure(
        io.dstore.engine.Procedure.Call request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXEC_PROCEDURE, getCallOptions(), request);
    }
  }

  public static class EngineFutureStub extends io.grpc.stub.AbstractStub<EngineFutureStub>
      implements EngineFutureClient {
    private EngineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXEC_PROCEDURE = 0;
  private static final int METHODID_EXEC_BATCH = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Engine serviceImpl;
    private final int methodId;

    public MethodHandlers(Engine serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXEC_PROCEDURE:
          serviceImpl.execProcedure((io.dstore.engine.Procedure.Call) request,
              (io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXEC_BATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.execBatch(
              (io.grpc.stub.StreamObserver<io.dstore.engine.Procedure.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Engine serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_EXEC_PROCEDURE,
          asyncServerStreamingCall(
            new MethodHandlers<
              io.dstore.engine.Procedure.Call,
              io.dstore.engine.Procedure.Response>(
                serviceImpl, METHODID_EXEC_PROCEDURE)))
        .addMethod(
          METHOD_EXEC_BATCH,
          asyncBidiStreamingCall(
            new MethodHandlers<
              io.dstore.engine.Procedure.Call,
              io.dstore.engine.Procedure.Response>(
                serviceImpl, METHODID_EXEC_BATCH)))
        .build();
  }
}
