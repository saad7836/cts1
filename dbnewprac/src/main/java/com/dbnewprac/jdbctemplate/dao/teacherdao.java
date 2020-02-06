package com.dbnewprac.jdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dbnewprac.jdbctemplate.model.Teacher;

@Repository("teach")
public class teacherdao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public List<Teacher>  getAllTeacher() {   	
	   	
    	List<Teacher> teachers = template.query(
			    "select * from teacher",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Teacher tchr = new Teacher();
			        	tchr.setEmp_id((rs.getInt("emp_id")));
			        	tchr.setName(rs.getString("name"));
			        	tchr.setAge(((rs.getInt("age"))));
			            return tchr;
			        }
			    });
         return teachers;
    }    

}
