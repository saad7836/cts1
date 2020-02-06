package com.newdbpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DbController {
	@RequestMapping("/hello")
	 String home2() {
		System.out.println("home");
		 return "home";
}
}