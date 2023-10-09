package com.example.crud;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import product.Product;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
    @GetMapping(path = "/")
    public List<Product> getNombres(){
        return List.of(
            new Product(
                3454,
                "laptop",
                4000f,
                LocalDate.of(2033, 04, 04),
                2
            )
        );
    }
}
