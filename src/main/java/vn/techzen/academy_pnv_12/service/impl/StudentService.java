package vn.techzen.academy_pnv_12.service.impl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import vn.techzen.academy_pnv_12.entity.Student;
import vn.techzen.academy_pnv_12.repository.IStudentRepository;
import vn.techzen.academy_pnv_12.service.IStudentService;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentService implements IStudentService {
    IStudentRepository studentRepository;

    @Override
    public List<Student> findAll(String name, Double fromScore, Double toScore) {
        return studentRepository.findByAttrNative(name, fromScore, toScore);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
