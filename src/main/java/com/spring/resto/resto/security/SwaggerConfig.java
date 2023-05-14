package com.spring.resto.resto.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {
	
	
	//CONFIGURACION DE SWAGGER EN LA SEGURIDAD
	@Bean
	public OpenAPI customSecurityOpenAPI() {
		
		Contact contacto1 = new Contact().name("Correo del contacto: Bautista Basilio").email("batubasilio@hotmail.com");
		Contact contacto2 = new Contact().name("Correo del contacto: Franco Borsella").email("fborsella1@gmail.com");
		Contact contacto3 = new Contact().name("Correo del contacto: Tomas Novelino").email("mailto:toto_lp01@hotmail.com");
		
	    return new OpenAPI()
	            .components(new Components().addSecuritySchemes("bearer-jwt",
	                    new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("Bearer").bearerFormat("JWT")))
	            .addSecurityItem(new SecurityRequirement().addList("bearer-jwt"))
	            .info(new Info()
                .title("Pizzería API")
                .version("1.0.0")
                .description("API para mi aplicación")
                );
	}
	
	

}
