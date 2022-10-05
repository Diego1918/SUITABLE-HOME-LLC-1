package com.app.web.entidad;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "armenia")
public class Armenia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "direccion", nullable = false, length = 120)
	private String direccion;
	
	@Column(name = "departamento", nullable = false, length = 120)
	private String departamento;
	
	@Column(name = "ciudad", nullable = false, length = 120)
	private String ciudad;
	
	@Column(name = "habitaciones", nullable = false, length = 120)
	private Integer habitaciones;
	
	@Column(name = "banos", nullable = false, length = 120)
	private Integer banos;
	
	@Column(name = "metros2", nullable = false, length = 120)
	private Integer metros2;
	
	@Column(name = "condicion", nullable = false, length = 120)
	private String condicion;
	
	@Column(name = "precio", nullable = false, length = 120)
	private String precio;
	
	@Column(name = "tipo", nullable = false, length = 120)
	private String tipo;
	
	//Constructores

	public Armenia(long id, String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
			Integer metros2, String condicion, String precio, String tipo) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.metros2 = metros2;
		this.condicion = condicion;
		this.precio = precio;
		this.tipo = tipo;
	}

	public Armenia(String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
			Integer metros2, String condicion, String precio, String tipo) {
		super();
		this.direccion = direccion;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.metros2 = metros2;
		this.condicion = condicion;
		this.precio = precio;
		this.tipo = tipo;
	}

	public Armenia(long id) {
		super();
		this.id = id;
	}

	public Armenia() {
		super();
	}
	

	//Get and setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public Integer getBanos() {
		return banos;
	}

	public void setBanos(Integer banos) {
		this.banos = banos;
	}

	public Integer getMetros2() {
		return metros2;
	}

	public void setMetros2(Integer metros2) {
		this.metros2 = metros2;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
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
	
	//String

	@Override
	public String toString() {
		return "Armenia [id=" + id + ", direccion=" + direccion + ", departamento=" + departamento + ", ciudad="
				+ ciudad + ", habitaciones=" + habitaciones + ", banos=" + banos + ", metros2=" + metros2
				+ ", condicion=" + condicion + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	
	

	
	
}