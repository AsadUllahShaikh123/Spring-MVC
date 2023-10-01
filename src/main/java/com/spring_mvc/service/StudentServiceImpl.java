package com.spring_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring_mvc.dao.StudentDao;
import com.spring_mvc.model.Student;

@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao dao;
	@Override
	public int registerStudent(Student student) {
		return dao.saveStudent(student);
		
	}

}
