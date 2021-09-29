package com.site.lms1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {

	@RequestMapping("index")
	public String index() {
		return "/index";
	}
	@GetMapping("member/login")
	public String login() {
		return "member/login";
	}
}

