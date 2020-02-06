package com.dbnewprac.jdbctemplate.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbnewprac.jdbctemplate.model.Teacher;
import com.dbnewprac.jdbctemplate.service.techService;

@Controller
public class HomeController {
	
	@Autowired
	techService tvice;
	
   @RequestMapping("/home")
   String home() {
	   return "home";
   }
   
   @RequestMapping("/listStudents")
   String getStudents(Model model) {
	   List<Teacher> list = tvice.getAllTeacher();
	   System.out.println(list);
	   model.addAttribute("liststud", list);
	   return "listStudents";
   }
   
}