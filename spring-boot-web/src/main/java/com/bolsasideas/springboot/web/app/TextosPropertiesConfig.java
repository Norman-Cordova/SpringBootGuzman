package com.bolsasideas.springboot.web.app;

import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
	@PropertySource("classpath:mensajes.properties")
})
public class TextosPropertiesConfig {

	
	
}
