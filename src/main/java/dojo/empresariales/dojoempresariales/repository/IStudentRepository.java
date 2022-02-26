package dojo.empresariales.dojoempresariales.repository;

import dojo.empresariales.dojoempresariales.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {
}
