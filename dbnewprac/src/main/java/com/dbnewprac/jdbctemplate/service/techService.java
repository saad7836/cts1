package com.dbnewprac.jdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbnewprac.jdbctemplate.dao.teacherdao;
import com.dbnewprac.jdbctemplate.model.Teacher;

@Service
public class techService {
	@Autowired
	teacherdao tdao;
	
    public List<Teacher> getAllTeacher(){
    	return tdao.getAllTeacher();
    }
	
	

}
