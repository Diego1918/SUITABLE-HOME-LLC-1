package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.app.web.interfaz.PropiedadesInterfaz;

@Controller
public class PropiedadesControlador {

	@Autowired
	private PropiedadesInterfaz interfaz;
	
	
	@GetMapping("/inicio")
	public String index() {
		
		return "index";
	}
	

	@GetMapping("/mapaArmenia")
	public String mapaArmenia() {
		
		return "mapaArmenia";
	}
	
	@GetMapping("/mapaBogota")
	public String mapaBogota() {
		
		return "mapaBogota";
	}
	
	@GetMapping("/mapaGiron")
	public String mapaGiron (Model model)
		{model.addAttribute("AllPropiedades",interfaz.listarTodasLasPropiedades());
		return "mapaGiron";
	}
		
	@GetMapping("/mapaManizales")
	public String mapaManizales() {
		
		return "mapaManizales";
	}
	
	@GetMapping("/mapaCartagena")
	public String mapaCartagena() {
		
		return "mapaCartagena";
	}
	
	@GetMapping("/Nopagina")
	public String Nopagina() {
		
		return "Nopagina";
	}
	
	@GetMapping("/departamentos")
	public String listarTodasLasPropiedades(Model modelo) {
		modelo.addAttribute("propiedades", interfaz.listarTodasLasPropiedades());
		return "departamento";
	}
	
	@GetMapping("/departamentos/inmueble/{id}")
	public String consultarInmueble(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("propiedades", interfaz.obtenerPropiedadPorId(id));
		return "inmueble";
	}
	
	@PostMapping("/departamentos/{id}")
	public String inmuebleConsultado() {
		return "redirect:/departamentos";
	}
	
	@GetMapping("/contactanos")
	public String contactanos() {
		
		return "contactanos";
	}
	
	@GetMapping("/sobreNosotros")
	public String sobreNosotros() {
		
		return "sobreNosotros";
	}
}
