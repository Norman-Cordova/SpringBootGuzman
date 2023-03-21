package com.bolsasideas.springboot.di.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsasideas.springboot.di.app.models.services.IServicio;
import com.bolsasideas.springboot.di.app.models.services.MiServicio;

@Controller
public class IndexController {
	
	private Logger Logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio ;
	
	@GetMapping({"/index","/",""})
	public String index(Model model) {
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}

	
	
}
