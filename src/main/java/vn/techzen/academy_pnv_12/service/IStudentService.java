package vn.techzen.academy_pnv_12.service;

import vn.techzen.academy_pnv_12.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(int id);

    Student save(Student student);
}
