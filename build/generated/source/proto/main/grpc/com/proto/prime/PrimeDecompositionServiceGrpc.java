package com.proto.prime;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: prime/prime.proto")
public final class PrimeDecompositionServiceGrpc {

  private PrimeDecompositionServiceGrpc() {}

  public static final String SERVICE_NAME = "prime.PrimeDecompositionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.prime.PrimeNumberRequest,
      com.proto.prime.DecompositionResponse> getDecomposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decompose",
      requestType = com.proto.prime.PrimeNumberRequest.class,
      responseType = com.proto.prime.DecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.prime.PrimeNumberRequest,
      com.proto.prime.DecompositionResponse> getDecomposeMethod() {
    io.grpc.MethodDescriptor<com.proto.prime.PrimeNumberRequest, com.proto.prime.DecompositionResponse> getDecomposeMethod;
    if ((getDecomposeMethod = PrimeDecompositionServiceGrpc.getDecomposeMethod) == null) {
      synchronized (PrimeDecompositionServiceGrpc.class) {
        if ((getDecomposeMethod = PrimeDecompositionServiceGrpc.getDecomposeMethod) == null) {
          PrimeDecompositionServiceGrpc.getDecomposeMethod = getDecomposeMethod = 
              io.grpc.MethodDescriptor.<com.proto.prime.PrimeNumberRequest, com.proto.prime.DecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "prime.PrimeDecompositionService", "Decompose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.PrimeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.prime.DecompositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrimeDecompositionServiceMethodDescriptorSupplier("Decompose"))
                  .build();
          }
        }
     }
     return getDecomposeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeDecompositionServiceStub newStub(io.grpc.Channel channel) {
    return new PrimeDecompositionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeDecompositionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrimeDecompositionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeDecompositionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrimeDecompositionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PrimeDecompositionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void decompose(com.proto.prime.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.DecompositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecomposeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecomposeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.prime.PrimeNumberRequest,
                com.proto.prime.DecompositionResponse>(
                  this, METHODID_DECOMPOSE)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceStub extends io.grpc.stub.AbstractStub<PrimeDecompositionServiceStub> {
    private PrimeDecompositionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeDecompositionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceStub(channel, callOptions);
    }

    /**
     */
    public void decompose(com.proto.prime.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.prime.DecompositionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDecomposeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceBlockingStub extends io.grpc.stub.AbstractStub<PrimeDecompositionServiceBlockingStub> {
    private PrimeDecompositionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeDecompositionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.prime.DecompositionResponse> decompose(
        com.proto.prime.PrimeNumberRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDecomposeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeDecompositionServiceFutureStub extends io.grpc.stub.AbstractStub<PrimeDecompositionServiceFutureStub> {
    private PrimeDecompositionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeDecompositionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompositionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeDecompositionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DECOMPOSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeDecompositionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeDecompositionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECOMPOSE:
          serviceImpl.decompose((com.proto.prime.PrimeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.prime.DecompositionResponse>) responseObserver);
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

  private static abstract class PrimeDecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeDecompositionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.prime.Prime.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeDecompositionService");
    }
  }

  private static final class PrimeDecompositionServiceFileDescriptorSupplier
      extends PrimeDecompositionServiceBaseDescriptorSupplier {
    PrimeDecompositionServiceFileDescriptorSupplier() {}
  }

  private static final class PrimeDecompositionServiceMethodDescriptorSupplier
      extends PrimeDecompositionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeDecompositionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PrimeDecompositionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeDecompositionServiceFileDescriptorSupplier())
              .addMethod(getDecomposeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
