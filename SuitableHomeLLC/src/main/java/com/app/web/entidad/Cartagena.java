package com.app.web.entidad;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartagena")
public class Cartagena {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "direccion", nullable = false, length = 120)
	private String direccion;
	
	@Column(name = "departamento", nullable = false, length = 120)
	private String departamento;
	
	@Column(name = "ciudad", nullable = false, length = 120)
	private String ciudad;
	
	private Integer habitaciones;
	
	private Integer banos;
	
	private Integer metros2;
	
	private String condicion;
	
	private String precio;
	
	private String tipo;
	
	//Constructor

	public Cartagena(Long id, String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
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
	
	public Cartagena(String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
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

	
	public Cartagena(Long id) {
		super();
		this.id = id;
	}

	public Cartagena() {
		super();
	}

	//Getter and Setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Cartagena [id=" + id + ", direccion=" + direccion + ", departamento=" + departamento + ", ciudad="
				+ ciudad + ", habitaciones=" + habitaciones + ", banos=" + banos + ", metros2=" + metros2
				+ ", condicion=" + condicion + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	


}