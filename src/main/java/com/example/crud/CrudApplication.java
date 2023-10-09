package com.example.crud;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	/* Creamos un metodo que nos devuelva nombres en string */
	@GetMapping(path = "/") /* Con esto ponemos disponible para consulta */
	public List<String> getNombres() {
		return List.of(
				"chis",
				"Daniela",
				"Neider");
	}

}
