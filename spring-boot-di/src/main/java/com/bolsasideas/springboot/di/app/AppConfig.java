package com.bolsasideas.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsasideas.springboot.di.app.models.services.IServicio;
import com.bolsasideas.springboot.di.app.models.services.MiServicio;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicio();
	}
	
}
