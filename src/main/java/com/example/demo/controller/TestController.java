package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //一般的控制器
//@RestController  //可以作为两个注解来用 @Controller + @ResponseBody
public class TestController {

	public TestController() {
		System.out.println(">>>>>>>>>>>>");
	}
	
	
//	http://localhost/test/test
	
	@RequestMapping("/")
	public String test() {
		
		return "#" ;
	}
	
}
