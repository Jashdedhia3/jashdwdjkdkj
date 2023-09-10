package com.greatlearning.studentman.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentman.entity.Student;

public interface Studentrepositary extends JpaRepository<Student, Integer> {

}
