package com.app.web.interfaz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Propiedades;
import com.app.web.repositorio.PropiedadesRepositorio;

@Service
public class PropiedadesInterfazImpl implements PropiedadesInterfaz {

	@Autowired
	private PropiedadesRepositorio repositorio;
	
	@Override
	public List<Propiedades> listarTodasLasPropiedades() {
		return repositorio.findAll();
	}

	@Override
	public Propiedades guardarPropiedad(Propiedades propiedades) {
		return repositorio.save(propiedades);
	}

	@Override
	public Propiedades obtenerPropiedadPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Propiedades actualizarPropiedad(Propiedades propiedades) {
		return repositorio.save(propiedades);
	}

	@Override
	public void eliminarPropiedad(Long id) {
		repositorio.deleteById(id);
	}
}
