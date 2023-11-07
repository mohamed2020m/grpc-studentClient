package com.leeuw.controllers;


import com.leeuw.client.GrpcStudentClient;
import com.leeuw.grpc.stubs.StudentOuterClass.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class GrpcStudentControlle {

    private final GrpcStudentClient grpcStudentClient;

    @Autowired
    public GrpcStudentControlle(GrpcStudentClient grpcStudentClient) {
        this.grpcStudentClient = grpcStudentClient;
    }

    @GetMapping
    public ListStudentsResponse listStudents() {
        return grpcStudentClient.listStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return grpcStudentClient.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody CreateStudentRequest request) {
        String firstName = request.getFirstNname();
        String lastName = request.getLastName();
        long age = request.getAge();
        return grpcStudentClient.createStudent(firstName, lastName, age);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student = student.toBuilder().setId(id).build();
        return grpcStudentClient.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public DeleteStudentResponse deleteStudent(@PathVariable Long id) {
        return grpcStudentClient.deleteStudent(id);
    }
}


