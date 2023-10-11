package com.oasys.studentdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeIsLessThanEighteenException;
import com.oasys.studentdetails.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	StudentService stuSer;
	@PostMapping(value="/insert")
	public String insertValues(@RequestBody List<Student> s) {
		return stuSer.insertValues(s);		
	}
	@GetMapping(value="/byId/{id}")
	public Optional<Student> findById(@PathVariable int id) {
		return stuSer.findById(id);
	}
	@PutMapping(value="/update")
	public List<Student> updateDetails(@RequestBody Student s){
		return stuSer.updateDetails(s);
	}
	@DeleteMapping(value="/delete/{rollnum}")
	public String deleteDetails(@PathVariable int rollnum) {
		return stuSer.deleteDetails(rollnum);
	}
	@PostMapping(value="/exception")
	public String ageException(@RequestBody Student s)throws AgeIsLessThanEighteenException {
		return stuSer.ageException(s);
	}
	@GetMapping(value="/rollNum/{rollnum}")
	public Student getByRollNum(@PathVariable int rollnum) {
		return stuSer.getByRollNum(rollnum);
	}
	

}
