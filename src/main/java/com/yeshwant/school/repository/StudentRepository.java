package com.yeshwant.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yeshwant.school.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
