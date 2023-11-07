package com.leeuw.client;


import com.leeuw.grpc.stubs.StudentOuterClass;
import com.leeuw.grpc.stubs.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;


@Component
public class GrpcStudentClient {
    private final StudentServiceGrpc.StudentServiceBlockingStub studentServiceStub;
    private final StudentServiceGrpc.StudentServiceStub asyncStudentServiceStub;

    public GrpcStudentClient() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        this.studentServiceStub = StudentServiceGrpc.newBlockingStub(channel);
        this.asyncStudentServiceStub = StudentServiceGrpc.newStub(channel);
    }

    public StudentOuterClass.ListStudentsResponse listStudents() {
        return studentServiceStub.listStudents(StudentOuterClass.Empty.newBuilder().build());
    }

    public StudentOuterClass.Student getStudentById(long id) {
        StudentOuterClass.GetStudentRequest request = StudentOuterClass.GetStudentRequest.newBuilder().setId(id).build();
        return studentServiceStub.getStudent(request);
    }

    public void listStudentsStream() {
        asyncStudentServiceStub.listStudentsStream(StudentOuterClass.Empty.newBuilder().build(), new StreamObserver<StudentOuterClass.Student>() {
            @Override
            public void onNext(StudentOuterClass.Student student) {
                // Process each received student data
                System.out.println("Received Student: " + student);
            }

            @Override
            public void onError(Throwable t) {
                // Handle errors
                System.err.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Handle stream completion
                System.out.println("Stream completed");
            }
        });
    }

    public StudentOuterClass.Student createStudent(String firstName, String lastName, long age) {
        StudentOuterClass.CreateStudentRequest request = StudentOuterClass.CreateStudentRequest.newBuilder()
                .setFirstNname(firstName)
                .setLastName(lastName)
                .setAge(age)
                .build();

        return studentServiceStub.createStudent(request);
    }

    public StudentOuterClass.Student updateStudent(StudentOuterClass.Student student) {
        return studentServiceStub.updateStudent(student);
    }

    public StudentOuterClass.DeleteStudentResponse deleteStudent(long id) {
        StudentOuterClass.DeleteStudentRequest request = StudentOuterClass.DeleteStudentRequest.newBuilder().setId(id).build();
        return studentServiceStub.deleteStudent(request);
    }
}

