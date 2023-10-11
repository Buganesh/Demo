package com.oasys.studentdetails.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.repository.StudentRepository;
@Repository
public class StudentDao {
	@Autowired
	StudentRepository stuRepo;
	public String insertValues(List<Student> s) {
		
		stuRepo.saveAll(s);
		return "Success";
	}
	public Optional<Student> findById(int id) {
		return stuRepo.findById(id);
	}
	public List<Student> updateDetails(Student s) {
		
		stuRepo.save(s);
		return stuRepo.findAll();
	}
	public String deleteDetails(int rollnum) {
		stuRepo.deleteById(rollnum);
		return "SuccessFully Deleted";
	}
	public String ageException(Student s) {
		stuRepo.save(s);
		return "Added";
	}
	public Student getByRollNum(int rollnum) {
		
		return stuRepo.getByRollNum(rollnum);
	}

}
