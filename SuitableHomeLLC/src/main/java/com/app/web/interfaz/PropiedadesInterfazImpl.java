package com.app.web.interfaz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Propiedades;
import com.app.web.entidad.Armenia;
import com.app.web.entidad.Bogota;
import com.app.web.entidad.Cartagena;
import com.app.web.entidad.Giron;
import com.app.web.entidad.Manizales;
import com.app.web.repositorio.PropiedadesRepositorio;
import com.app.web.repositorioarmenia.ArmeniaRepositorio;
import com.app.web.repositoriobogota.BogotaRepositorio;
import com.app.web.repositoriocartagena.CartagenaRepositorio;
import com.app.web.repositoriogiron.GironRepositorio;
import com.app.web.repositoriomanizales.ManizalesRepositorio;

@Service
public class PropiedadesInterfazImpl implements PropiedadesInterfaz {

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
	public List<Propiedades> listarTodasLasPropiedades() {
		return repositorio.findAll();
	}
	
	@Override
	public List<Armenia> listarTodosArmenia() {
		return repositorioarmenia.findAll();} 
	@Override
	public List<Bogota> listarTodosBogota() {
		return repositoriobogota.findAll();} 
	@Override
	public List<Cartagena> listarTodosCartagena() {
		return repositoriocartagena.findAll();} 
	@Override
	public List<Giron> listarTodosGiron() {
		return repositoriogiron.findAll();} 
	@Override
	public List<Manizales> listarTodosManizales() {
		return repositoriomanizales.findAll();} 
	
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

	@Override
	public Armenia obtenerArmeniaPorId(Long id) {
		return repositorioarmenia.findById(id).get();
	}

	@Override
	public Bogota obtenerBogotaPorId(Long id) {
		return repositoriobogota.findById(id).get();
	}

	@Override
	public Giron obtenerGironPorId(Long id) {
		return repositoriogiron.findById(id).get();
	}

	@Override
	public Manizales obtenerManizalesPorId(Long id) {
		return repositoriomanizales.findById(id).get();
	}

	@Override
	public Cartagena obtenerCartagenaPorId(Long id) {
		return repositoriocartagena.findById(id).get();
	}

	
}
