package com.app.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Propiedades;

@SpringBootApplication
public class SuitableHome implements CommandLineRunner{
	
	public static void main(String[] args) {
		// Unidad de persistencia
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("bdsuitablehome");
		EntityManager em = emf.createEntityManager();
		Propiedades propiedades = em.find(Propiedades.class,"Cra. 49B#174A-45");
		
		System.out.println("Dirección: "+propiedades.getDirección());
		System.out.println("Departamento: "+propiedades.getDepartamento());
		System.out.println("Ciudad: "+propiedades.getCiudad());
		System.out.println("Precio: $"+propiedades.getPrecio()+" de pesos");
		System.out.println("Tipo Inmueble: "+propiedades.getTipo());
		System.out.println("Condición: "+propiedades.getCondición());
		System.out.println("Baños: "+propiedades.getBaños());
		System.out.println("Habitaciones: "+propiedades.getHabitaciones());
		System.out.println("Metros cuadrados: "+propiedades.getMetros2());
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
