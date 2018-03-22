package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //一般的控制器
//@RestController  //可以作为两个注解来用 @Controller + @ResponseBody
public class LoginController {

	public LoginController() {
		System.out.println("<--LoginController is running-->");
	}
	
	
//	http://localhost/Saler
	@RequestMapping("/")
	public String main() {
		
		return "/Saler/login" ;
	}	
	@RequestMapping("/login")
	public String login() {
		
		return "/Saler/login" ;
	}
	@RequestMapping("/register")
	public String register() {
		
		return "/Saler/register" ;
	}
}
