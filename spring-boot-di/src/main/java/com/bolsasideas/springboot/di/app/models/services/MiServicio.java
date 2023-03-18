package com.bolsasideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioPrincipal")
//@Primary
public class MiServicio implements IServicio{
	
	@Override
	public String operacion() {
		return "ejecutando algun proceso importante Simple";
	}
	
	
	
}
