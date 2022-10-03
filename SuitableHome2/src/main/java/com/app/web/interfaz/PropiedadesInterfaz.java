package com.app.web.interfaz;

import java.util.List;

import com.app.web.entidad.Propiedades;


public interface PropiedadesInterfaz {
	
	public List<Propiedades> listarTodasLasPropiedades();
	
	public Propiedades guardarPropiedad(Propiedades propiedades);
	
	public Propiedades obtenerPropiedadPorId(Long id);
	
	public Propiedades actualizarPropiedad(Propiedades propiedades);
	
	public void eliminarPropiedad(Long id);
}
