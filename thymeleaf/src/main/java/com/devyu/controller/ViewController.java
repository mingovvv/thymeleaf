package com.devyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/test")
	public String test() {
		return "content1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "content2";
	}
}
