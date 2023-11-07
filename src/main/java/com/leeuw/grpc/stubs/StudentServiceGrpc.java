package com.leeuw.grpc.stubs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty,
      com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> getListStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStudents",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.Empty.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty,
      com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> getListStudentsMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty, com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> getListStudentsMethod;
    if ((getListStudentsMethod = StudentServiceGrpc.getListStudentsMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getListStudentsMethod = StudentServiceGrpc.getListStudentsMethod) == null) {
          StudentServiceGrpc.getListStudentsMethod = getListStudentsMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.Empty, com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "ListStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("ListStudents"))
                  .build();
          }
        }
     }
     return getListStudentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getGetStudentMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.Student> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
          StudentServiceGrpc.getGetStudentMethod = getGetStudentMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudent"))
                  .build();
          }
        }
     }
     return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getListStudentsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStudentsStream",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.Empty.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getListStudentsStreamMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Empty, com.leeuw.grpc.stubs.StudentOuterClass.Student> getListStudentsStreamMethod;
    if ((getListStudentsStreamMethod = StudentServiceGrpc.getListStudentsStreamMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getListStudentsStreamMethod = StudentServiceGrpc.getListStudentsStreamMethod) == null) {
          StudentServiceGrpc.getListStudentsStreamMethod = getListStudentsStreamMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.Empty, com.leeuw.grpc.stubs.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "ListStudentsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("ListStudentsStream"))
                  .build();
          }
        }
     }
     return getListStudentsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStudent",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.Student> getCreateStudentMethod;
    if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
          StudentServiceGrpc.getCreateStudentMethod = getCreateStudentMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "CreateStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("CreateStudent"))
                  .build();
          }
        }
     }
     return getCreateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Student,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getUpdateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStudent",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.Student.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Student,
      com.leeuw.grpc.stubs.StudentOuterClass.Student> getUpdateStudentMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.Student, com.leeuw.grpc.stubs.StudentOuterClass.Student> getUpdateStudentMethod;
    if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
          StudentServiceGrpc.getUpdateStudentMethod = getUpdateStudentMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.Student, com.leeuw.grpc.stubs.StudentOuterClass.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "UpdateStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Student.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("UpdateStudent"))
                  .build();
          }
        }
     }
     return getUpdateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStudent",
      requestType = com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest.class,
      responseType = com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest,
      com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
          StudentServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod = 
              io.grpc.MethodDescriptor.<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest, com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "DeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("DeleteStudent"))
                  .build();
          }
        }
     }
     return getDeleteStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listStudents(com.leeuw.grpc.stubs.StudentOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListStudentsMethod(), responseObserver);
    }

    /**
     */
    public void getStudent(com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    public void listStudentsStream(com.leeuw.grpc.stubs.StudentOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getListStudentsStreamMethod(), responseObserver);
    }

    /**
     */
    public void createStudent(com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    /**
     */
    public void updateStudent(com.leeuw.grpc.stubs.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListStudentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.Empty,
                com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse>(
                  this, METHODID_LIST_STUDENTS)))
          .addMethod(
            getGetStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest,
                com.leeuw.grpc.stubs.StudentOuterClass.Student>(
                  this, METHODID_GET_STUDENT)))
          .addMethod(
            getListStudentsStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.Empty,
                com.leeuw.grpc.stubs.StudentOuterClass.Student>(
                  this, METHODID_LIST_STUDENTS_STREAM)))
          .addMethod(
            getCreateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest,
                com.leeuw.grpc.stubs.StudentOuterClass.Student>(
                  this, METHODID_CREATE_STUDENT)))
          .addMethod(
            getUpdateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.Student,
                com.leeuw.grpc.stubs.StudentOuterClass.Student>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest,
                com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse>(
                  this, METHODID_DELETE_STUDENT)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void listStudents(com.leeuw.grpc.stubs.StudentOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListStudentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudent(com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listStudentsStream(com.leeuw.grpc.stubs.StudentOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListStudentsStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStudent(com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStudent(com.leeuw.grpc.stubs.StudentOuterClass.Student request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest request,
        io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse listStudents(com.leeuw.grpc.stubs.StudentOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListStudentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leeuw.grpc.stubs.StudentOuterClass.Student getStudent(com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.leeuw.grpc.stubs.StudentOuterClass.Student> listStudentsStream(
        com.leeuw.grpc.stubs.StudentOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListStudentsStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leeuw.grpc.stubs.StudentOuterClass.Student createStudent(com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leeuw.grpc.stubs.StudentOuterClass.Student updateStudent(com.leeuw.grpc.stubs.StudentOuterClass.Student request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse deleteStudent(com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse> listStudents(
        com.leeuw.grpc.stubs.StudentOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListStudentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leeuw.grpc.stubs.StudentOuterClass.Student> getStudent(
        com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leeuw.grpc.stubs.StudentOuterClass.Student> createStudent(
        com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leeuw.grpc.stubs.StudentOuterClass.Student> updateStudent(
        com.leeuw.grpc.stubs.StudentOuterClass.Student request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse> deleteStudent(
        com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STUDENTS = 0;
  private static final int METHODID_GET_STUDENT = 1;
  private static final int METHODID_LIST_STUDENTS_STREAM = 2;
  private static final int METHODID_CREATE_STUDENT = 3;
  private static final int METHODID_UPDATE_STUDENT = 4;
  private static final int METHODID_DELETE_STUDENT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_STUDENTS:
          serviceImpl.listStudents((com.leeuw.grpc.stubs.StudentOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.ListStudentsResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((com.leeuw.grpc.stubs.StudentOuterClass.GetStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_LIST_STUDENTS_STREAM:
          serviceImpl.listStudentsStream((com.leeuw.grpc.stubs.StudentOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((com.leeuw.grpc.stubs.StudentOuterClass.CreateStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((com.leeuw.grpc.stubs.StudentOuterClass.Student) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.Student>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.leeuw.grpc.stubs.StudentOuterClass.DeleteStudentResponse>) responseObserver);
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

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.leeuw.grpc.stubs.StudentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getListStudentsMethod())
              .addMethod(getGetStudentMethod())
              .addMethod(getListStudentsStreamMethod())
              .addMethod(getCreateStudentMethod())
              .addMethod(getUpdateStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
