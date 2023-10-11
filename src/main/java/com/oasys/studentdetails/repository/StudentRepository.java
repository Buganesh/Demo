package com.oasys.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
@Query(value="select* from student where roll_number=?",nativeQuery = true)
public Student getByRollNum(int rollnum);
}
