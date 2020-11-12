/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.ieti.cadanwheels;

import java.util.Collections;

import co.edu.eci.ieti.cadanwheels.controllers.ViajesController;
import co.edu.eci.ieti.cadanwheels.entities.TipoViaje;
import co.edu.eci.ieti.cadanwheels.entities.Viaje;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Jairo Gomez
 */
@SpringBootApplication
public class CadanWheelsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RouletteApplication.class, args);
        //mongodb+srv://ieti:<ieti123>@cluster0.j78lp.mongodb.net/cadanwheels?retryWrites=true&w=majority
        SpringApplication app = new SpringApplication(CadanWheelsApplication.class);
        app.setDefaultProperties(Collections.singletonMap("spring.data.mongodb.uri", "mongodb+srv://ieti:ieti123@cluster0.j78lp.mongodb.net/cadanwheels?retryWrites=true&w=majority"));
        app.run(args);

    }

    @Bean 
    public WebMvcConfigurer corsConfigurer() { 
        return new WebMvcConfigurer() { 
            @Override 
            public void addCorsMappings(CorsRegistry registry) { 
                registry.addMapping("/").allowedOrigins("http://localhost:3000");
            }
        };
    }
}
