package com.app.web.entidad;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

//objetos de la tabla
//Springboot no trabaja por cascada, El busca lo que se solicita.
@Entity
@Table(name= "propiedades")
public class Propiedades {
	@Id
	private String dirección;
	private String departamento;
	private String ciudad;
	private Integer habitaciones;
	private Integer baños;
	private Float metros2;
	private String condición;
	private String precio;
	private String tipo;
	
	//Getters and setters 
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Integer habitaciones) {
		this.habitaciones = habitaciones;
	}
	public Integer getBaños() {
		return baños;
	}
	public void setBaños(Integer baños) {
		this.baños = baños;
	}
	public Float getMetros2() {
		return metros2;
	}
	public void setMetros2(Float metros2) {
		this.metros2 = metros2;
	}
	public String getCondición() {
		return condición;
	}
	public void setCondición(String condición) {
		this.condición = condición;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Constructor

	public Propiedades(String dirección, String departamento, String ciudad, Integer habitaciones, Integer baños,
			Float metros2, String condición, String precio, String tipo) {
		super();
		this.dirección = dirección;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.habitaciones = habitaciones;
		this.baños = baños;
		this.metros2 = metros2;
		this.condición = condición;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public Propiedades(String dirección) {
		super();
		this.dirección = dirección;
	}
	
	public Propiedades() {
		super();
	}
	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dirección == null) ? 0 : dirección.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedades other = (Propiedades) obj;
		if (dirección == null) {
			if (other.dirección != null)
				return false;
		} else if (!dirección.equals(other.dirección))
			return false;
		return true;
	}
	
	//GenerateString permite mostrar los datos
	@Override
	public String toString() {
		return "Propiedades [dirección=" + dirección + ", departamento=" + departamento + ", ciudad=" + ciudad
				+ ", habitaciones=" + habitaciones + ", baños=" + baños + ", metros2=" + metros2 + ", condición="
				+ condición + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
}