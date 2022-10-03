package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.app.web.repositorio.PropiedadesRepositorio;

@SpringBootApplication
public class SuitableHomeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SuitableHomeApplication.class, args);
	}

	@Autowired
	private PropiedadesRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
