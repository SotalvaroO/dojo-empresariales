package dojo.empresariales.dojoempresariales.service;

import dojo.empresariales.dojoempresariales.entity.StudentEntity;
import dojo.empresariales.dojoempresariales.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository _studentRepository;

    @Override
    public void createStudent(StudentEntity student) {
        _studentRepository.save(student);
    }

    @Override
    public StudentEntity findStudentById(Integer id) {
        StudentEntity student = _studentRepository.findById(id).orElse(null);
        return student;
    }

    @Override
    public List<StudentEntity> findAll() {
        return _studentRepository.findAll();
    }
}
