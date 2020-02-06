package com.mydb2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydb2.model.User;
import com.mydb2.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
    String home() {
    	
    	return "home";
    }
	
	@RequestMapping("/listUsers")
	String getUsers(Model model) {
		List<User> list = userService.getAllUsers();
		model.addAttribute("list", list);
		
		return "listusers";
	}
}
