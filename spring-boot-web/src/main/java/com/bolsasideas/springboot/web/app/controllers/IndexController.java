package com.bolsasideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.bolsasideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Map<String, Object> model) {
		model.put("titulo", "Hola Spring Framework!");
		return "index.html";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Rivera");
		usuario.setEmail("andresCorreo@email.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del Usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = Arrays.asList();
		usuarios.add(new Usuario("Andres","Carcamo","acarcamo@email.com"));
		usuarios.add(new Usuario("Jak","Solis","jsolis@email.com"));
		usuarios.add(new Usuario("Patricia","Longeira","plongeira@email.com"));
		model.addAttribute("usuarios",usuarios);
		model.addAttribute("titulo", "Listado de usuarios");
		return "listar";
	}
}
