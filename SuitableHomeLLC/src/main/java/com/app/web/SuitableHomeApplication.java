package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.app.web.repositorio.PropiedadesRepositorio;
import com.app.web.repositorioarmenia.ArmeniaRepositorio;
import com.app.web.repositoriobogota.BogotaRepositorio;
import com.app.web.repositoriocartagena.CartagenaRepositorio;
import com.app.web.repositoriogiron.GironRepositorio;
import com.app.web.repositoriomanizales.ManizalesRepositorio;

@SpringBootApplication
public class SuitableHomeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SuitableHomeApplication.class, args);
	}

	@Autowired
	private PropiedadesRepositorio repositorio;
	@Autowired
	private ArmeniaRepositorio repositorioarmenia;
	@Autowired
	private BogotaRepositorio repositoriobogota;
	@Autowired
	private CartagenaRepositorio repositoriocartagena;
	@Autowired
	private GironRepositorio repositoriogiron;
	@Autowired
	private ManizalesRepositorio repositoriomanizales;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
