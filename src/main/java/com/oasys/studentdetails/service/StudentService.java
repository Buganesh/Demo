package com.oasys.studentdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.studentdetails.dao.StudentDao;
import com.oasys.studentdetails.entity.Student;
import com.oasys.studentdetails.exception.AgeIsLessThanEighteenException;
@Service
public class StudentService {
	@Autowired
	StudentDao stuDao;
	public String insertValues(List<Student> s) {
		
		return stuDao.insertValues(s);
	}
	public Optional<Student> findById(int id) {
		return stuDao.findById(id);
	}
	public List<Student> updateDetails(Student s) {
		return stuDao.updateDetails(s);
	}
	public String deleteDetails(int rollnum) {
		return stuDao.deleteDetails(rollnum);
	}
	public String ageException(Student s)throws AgeIsLessThanEighteenException {
		if(s.getAge()<18) {
			throw new AgeIsLessThanEighteenException("Age is less than 18");
		}
		else {
			return stuDao.ageException(s);
		}
		
	}
	public Student getByRollNum(int rollnum) {
		
		return stuDao.getByRollNum(rollnum);
	}

}
