package dojo.empresariales.dojoempresariales.service;

import dojo.empresariales.dojoempresariales.entity.StudentEntity;

import java.util.List;

public interface IStudentService {

    void createStudent(StudentEntity student);
    StudentEntity findStudentById(Integer id);
    List<StudentEntity> findAll();
}
