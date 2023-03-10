package com.bolsasideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

	@GetMapping({"/index","/","/home"})
	public String index() {
		return "index";
	}
}
