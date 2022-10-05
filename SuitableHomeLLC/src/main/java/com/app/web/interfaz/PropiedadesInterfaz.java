package com.app.web.interfaz;

import java.util.List;

import com.app.web.entidad.Propiedades;
import com.app.web.entidad.Armenia;
import com.app.web.entidad.Bogota;
import com.app.web.entidad.Cartagena;
import com.app.web.entidad.Giron;
import com.app.web.entidad.Manizales;


public interface PropiedadesInterfaz {
	
	public List<Propiedades> listarTodasLasPropiedades();
	
	public Propiedades guardarPropiedad(Propiedades propiedades);
	
	public Propiedades obtenerPropiedadPorId(Long id);
	
	public Propiedades actualizarPropiedad(Propiedades propiedades);
	
	public void eliminarPropiedad(Long id);
	
	public List<Armenia> listarTodosArmenia();
	public List<Bogota> listarTodosBogota();
	public List<Cartagena> listarTodosCartagena();
	public List<Giron> listarTodosGiron();
	public List<Manizales> listarTodosManizales();

	public Armenia obtenerArmeniaPorId(Long id);

	public Bogota obtenerBogotaPorId(Long id);

	public Giron obtenerGironPorId(Long id);

	public Manizales obtenerManizalesPorId(Long id);

	public Cartagena obtenerCartagenaPorId(Long id);
		
}
