package com.learning.SB_JDBC;

import com.learning.SB_JDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SbJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SbJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setId(1);
		s.setName("Priyanshu");
		s.setMarks(25);
		StudentService sservice = context.getBean(StudentService.class);
		sservice.addStudent(s);
		List<Student> studentList = sservice.getStudents();
	}
}
