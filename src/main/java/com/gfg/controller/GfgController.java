package com.gfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GfgController {

	
	@GetMapping("/gfg")
	public String helloGfg() {
		return "hello-gfg";
	}
	
	@GetMapping("/gfg/welcome")
	@ResponseBody
	public String welcomeGfg() {
		return "Welcome to GeeksforGeeks";
	}
}
