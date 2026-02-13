package com.learning.SB_JDBC.repository;

import com.learning.SB_JDBC.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Saved");
    }

    public List<Student> findAll() {
        List<Student> students =  new ArrayList<>();
//        System.out.println("Done");
        return students;

    }
}
