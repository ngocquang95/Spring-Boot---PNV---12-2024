package vn.techzen.academy_pnv_12.repository.impl;

import org.springframework.stereotype.Repository;
import vn.techzen.academy_pnv_12.model.Student;
import vn.techzen.academy_pnv_12.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Nguyen Van Duc", 9.6),
                    new Student(2, "Hoang Nhat Tan", 9.5)
            )
    );

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public Student save(Student student) {
        student.setId((int) (Math.random() * 1000000));
        students.add(student);
        return student;
    }
}
