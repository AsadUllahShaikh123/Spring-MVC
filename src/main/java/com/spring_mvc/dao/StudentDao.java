package com.spring_mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring_mvc.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public int saveStudent(Student student) {
		
		String sql = "insert into student(name,email,address) values(?,?,?) ";
		int saved = jdbc.update(sql,student.getName(),student.getEmail(),student.getAddress());
		
		return saved;
	}
}
