package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.app.web.interfaz.PropiedadesInterfaz;

@Controller
public class PropiedadesControlador {

	@Autowired
	private PropiedadesInterfaz interfaz;
	
	
	@GetMapping("/index.html")
	public String index() {
		
		return "index.html";
	}
	

	@GetMapping("/mapaArmenia.html")
	public String mapaArmenia() {
		
		return "mapaArmenia.html";
	}
	
	@GetMapping("/mapaBogota.html")
	public String mapaBogota() {
		
		return "mapaBogota.html";
	}
	
	@GetMapping("/mapaGiron.html")
	public String mapaGiron (Model model)
		{model.addAttribute("AllPropiedades",interfaz.listarTodasLasPropiedades());
		return "mapaGiron.html";
	}
		
	@GetMapping("/mapaManizales.html")
	public String mapaManizales() {
		
		return "mapaManizales.html";
	}
	
	@GetMapping("/mapaCartagena.html")
	public String mapaCartagena() {
		
		return "mapaCartagena.html";
	}
	
	@GetMapping("/Nopagina.html")
	public String Nopagina() {
		
		return "Nopagina.html";
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
	
	@GetMapping("/contactanos.html")
	public String contactanos() {
		
		return "contactanos.html";
	}
	
	@GetMapping("/sobreNosotros.html")
	public String sobreNosotros() {
		
		return "sobreNosotros.html";
	}
}
