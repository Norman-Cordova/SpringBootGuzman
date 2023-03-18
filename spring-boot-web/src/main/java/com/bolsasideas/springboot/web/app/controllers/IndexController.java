package com.bolsasideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.bolsasideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${textoIndex}")
	private String textoIndex;
	
	@Value("${textoPerfil}")
	private String textoPerfil;
	
	@Value("${textoListar}")
	private String textoListar;

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Map<String, Object> model) {
		model.put("titulo", textoIndex);
		return "index.html";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Rivera");
		usuario.setEmail("andresCorreo@email.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres", "Carcamo", "acarcamo@email.com"),
				new Usuario("Jak", "Solis", "jsolis@email.com"),
				new Usuario("Patricia", "Longeira", "plongeira@email.com"));
		return usuarios;
	}
}
