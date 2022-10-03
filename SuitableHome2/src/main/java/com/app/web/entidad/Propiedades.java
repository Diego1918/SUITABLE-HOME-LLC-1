package com.app.web.entidad;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propiedades")
public class Propiedades {
	
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

	public Propiedades(Long id, String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
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

	public Propiedades(String direccion, String departamento, String ciudad, Integer habitaciones, Integer banos,
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
	
	public Propiedades(Long id) {
		super();
		this.id = id;
	}

	public Propiedades() {
		super();
	}

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

	//@Override
	//public int hashCode() {
	//	return Objects.hash(banos, ciudad, condicion, departamento, direccion, habitaciones, metros2, precio, tipo);
	//}

	//@Override
	//public boolean equals(Object obj) {
	//	if (this == obj)
	//		return true;
	//	if (obj == null)
	//		return false;
	//	if (getClass() != obj.getClass())
	//		return false;
	//	Propiedades other = (Propiedades) obj;
	//	return Objects.equals(banos, other.banos) && Objects.equals(ciudad, other.ciudad)
	//			&& Objects.equals(condicion, other.condicion) && Objects.equals(departamento, other.departamento)
	//			&& Objects.equals(direccion, other.direccion) && Objects.equals(habitaciones, other.habitaciones)
	//			&& Objects.equals(metros2, other.metros2) && Objects.equals(precio, other.precio)
	//			&& Objects.equals(tipo, other.tipo);
	//}

	@Override
	public String toString() {
		return "Propiedades [id="+ id +", direccion=" + direccion + ", departamento=" + departamento + ", ciudad=" + ciudad
				+ ", habitaciones=" + habitaciones + ", banos=" + banos + ", metros2=" + metros2 + ", condicion="
				+ condicion + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	



}

	
	

	
	
