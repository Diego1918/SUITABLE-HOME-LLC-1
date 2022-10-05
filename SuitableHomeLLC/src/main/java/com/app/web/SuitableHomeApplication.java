package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Armenia;
import com.app.web.entidad.Bogota;
import com.app.web.entidad.Cartagena;
import com.app.web.entidad.Giron;
import com.app.web.entidad.Manizales;
import com.app.web.entidad.Propiedades;
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
		/*Propiedades propiedad1 = new Propiedades(100,"Ave. Santander #34-03 La Boquilla", "Bolivar", "Cartagena", 5, 2, 1032, "Para renta", "$ 2.000'000.000", "Penthouse");
		repositorio.save(propiedad1);
		
		Propiedades propiedad2 = new Propiedades(101, "Carrera 10C#27-09 Barrio getsemani", "Bolivar", "Cartagena", 3, 1, 350, "Para renta", "$ 800'000.000", "Hostel");
		repositorio.save(propiedad2);
		
		Propiedades propiedad3 = new Propiedades(102, "Cra. 10e #57f-45, Mall Plaza", "Caldas", "Manizales", 3, 2, 108, "Para Renta", "$ 480'000.000", "Apartamento");
		repositorio.save(propiedad3);
		
		Propiedades propiedad4 = new Propiedades(103, "Carrera 22 #51 e-09. La Leonora", "Caldas", "Manizales", 1, 1, 64, "Para Renta", "$ 220'000.000", "Apartamento");
		repositorio.save(propiedad4);
		
		Propiedades propiedad5 = new Propiedades(104, "Carrera 51#145A-68", "Cundinamarca", "Bogotá D.C.", 4, 3, 102, "En venta", "$ 400'000.000", "Casa");
		repositorio.save(propiedad5);
		
		Propiedades propiedad6 = new Propiedades(105, "Carrera 20A#173A-03 apto305", "Cundinamarca", "Bogotá D.C.", 3, 2, 64, "Para renta", "$ 250'000.000", "Apartamento");
		repositorio.save(propiedad6);
		
		Propiedades propiedad7 = new Propiedades(106, "Carrera 23#187-09 Apartamento 202", "Cundinamarca", "Bogotá D.C.", 3, 3, 102, "En venta", "$ 266'151.000", "Apartamento");
		repositorio.save(propiedad7);
		
		Propiedades propiedad8 = new Propiedades(107, "Carrera 49B#174A-45", "Cundinamarca", "Bogotá D.C.", 3, 3, 104, "Para renta", "$ 450'000.000", "Casa");
		repositorio.save(propiedad8);
		
		Propiedades propiedad9 = new Propiedades(108, "B/ Villa Alejandra Mz 2#7", "Quindio", "Armenia", 3, 1, 85, "Fuera del mercado", "$ 110'000.000", "Casa");
		repositorio.save(propiedad9);
		
		Propiedades propiedad10 = new Propiedades(109, "B/ Villa Alejandra 2 Etapa Mz 14#10", "Quindio", "Armenia", 3, 1, 72, "Fuera del mercado", "$ 90'000.000", "Casa");
		repositorio.save(propiedad10);
		
		Propiedades propiedad11 = new Propiedades(110, "B/ La Esmeralda Mz 10#5", "Quindío ", "Armenia", 4, 2, 120, "Fuera del mercado", "$ 140'000.000", "Casa");
		repositorio.save(propiedad11);
		
		Propiedades propiedad12 = new Propiedades(111, "Carrera 27#28-18 Las nieves", "Santander", "Giron", 4, 2, 461, "En venta", "$ 500'000.000", "Casa");
		repositorio.save(propiedad12);
		
		Propiedades propiedad13 = new Propiedades(112, "Carrera 29A#28A-30 La campiña", "Santander", "Giron", 3, 2, 154, "Fuera del mercado", "$ 240'000.000", "Casa");
		repositorio.save(propiedad13);
		
		Cartagena cartagena1 = new Cartagena(100,"Ave. Santander #34-03 La Boquilla", "Bolivar", "Cartagena", 5, 2, 1032, "Para renta", "$ 2.000'000.000", "Penthouse");
		repositoriocartagena.save(cartagena1);
		
		Cartagena cartagena2 = new Cartagena(101, "Carrera 10C#27-09 Barrio getsemani", "Bolivar", "Cartagena", 3, 1, 350, "Para renta", "$ 800'000.000", "Hostel");
		repositoriocartagena.save(cartagena2);
		
		Manizales manizales1 = new Manizales(102, "Cra. 10e #57f-45, Mall Plaza", "Caldas", "Manizales", 3, 2, 108, "Para Renta", "$ 480'000.000", "Apartamento");
		repositoriomanizales.save(manizales1);
		
		Manizales propiedad17 = new Manizales(103, "Carrera 22 #51 e-09. La Leonora", "Caldas", "Manizales", 1, 1, 64, "Para Renta", "$ 220'000.000", "Apartamento");
		repositoriomanizales.save(propiedad17);
		
		Bogota propiedad18 = new Bogota(104, "Carrera 51#145A-68", "Cundinamarca", "Bogotá D.C.", 4, 3, 102, "En venta", "$ 400'000.000", "Casa");
		repositoriobogota.save(propiedad18);
		
		Bogota propiedad19 = new Bogota(105, "Carrera 20A#173A-03 apto305", "Cundinamarca", "Bogotá D.C.", 3, 2, 64, "Para renta", "$ 250'000.000", "Apartamento");
		repositoriobogota.save(propiedad19);
		
		Bogota propiedad20 = new Bogota(106, "Carrera 23#187-09 Apartamento 202", "Cundinamarca", "Bogotá D.C.", 3, 3, 102, "En venta", "$ 266'151.000", "Apartamento");
		repositoriobogota.save(propiedad20);
		
		Bogota propiedad21 = new Bogota(107, "Carrera 49B#174A-45", "Cundinamarca", "Bogotá D.C.", 3, 3, 104, "Para renta", "$ 450'000.000", "Casa");
		repositoriobogota.save(propiedad21);
		
		Armenia propiedad22 = new Armenia(108, "B/ Villa Alejandra Mz 2#7", "Quindio", "Armenia", 3, 1, 85, "Fuera del mercado", "$ 110'000.000", "Casa");
		repositorioarmenia.save(propiedad22);
		
		Armenia propiedad23 = new Armenia(109, "B/ Villa Alejandra 2 Etapa Mz 14#10", "Quindio", "Armenia", 3, 1, 72, "Fuera del mercado", "$ 90'000.000", "Casa");
		repositorioarmenia.save(propiedad23);
		
		Armenia propiedad24 = new Armenia(110, "B/ La Esmeralda Mz 10#5", "Quindío ", "Armenia", 4, 2, 120, "Fuera del mercado", "$ 140'000.000", "Casa");
		repositorioarmenia.save(propiedad24);
		
		Giron propiedad25 = new Giron(111, "Carrera 27#28-18 Las nieves", "Santander", "Giron", 4, 2, 461, "En venta", "$ 500'000.000", "Casa");
		repositoriogiron.save(propiedad25);
		
		Giron propiedad26 = new Giron(112, "Carrera 29A#28A-30 La campiña", "Santander", "Giron", 3, 2, 154, "Fuera del mercado", "$ 240'000.000", "Casa");
		repositoriogiron.save(propiedad26);*/
	}

}
