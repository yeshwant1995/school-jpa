package com.yeshwant.school.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yeshwant.school.entity.Student;

@SpringBootTest
public class StudentTests {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	void saveStudent() {
		
		Student student = new Student();
		student.setGivenName("jhon");
		student.setMiddleName("obama");
		student.setSurname("wick");
		student.setDateOfBirth(new Calendar.Builder().setDate(1995, 11, 5).build());
		student.setGender('M');
		student.setEnrolmentDate(new Calendar.Builder().setDate(2023, 2, 27).build());
		
		Student savedStudent = studentRepository.save(student);
		
		assertThat(savedStudent.getId()).isGreaterThan(0);
		
	}

}
