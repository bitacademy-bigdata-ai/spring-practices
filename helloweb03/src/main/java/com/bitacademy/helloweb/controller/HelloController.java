package com.bitacademy.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	public void a() {
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public String hello(String name) {
		System.out.println("name:" + name + ", no:" + no);
		return "/WEB-INF/views/hello.jsp";
	}

	
}
