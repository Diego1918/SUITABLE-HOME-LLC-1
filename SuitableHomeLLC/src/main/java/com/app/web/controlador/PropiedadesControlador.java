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
	
//@GetMapping("/departamentos")
	//public String listarTodasLasPropiedades(Model modelo) {
		//modelo.addAttribute("propiedades", interfaz.listarTodasLasPropiedades());
		//return "departamento";
	//}
	
	@GetMapping("/mapaArmenia")
	public String mapaArmenia(Model model) 
	{model.addAttribute("armenia", interfaz.listarTodosArmenia());
	return "mapaArmenia";}
	
	@GetMapping("/mapaArmenia/inmuebleArmenia/{id}")
	public String consultarInmuebleArmenia(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("armenia", interfaz.obtenerArmeniaPorId(id));
		return "inmuebleArmenia";
	}
	
	@PostMapping("/mapaArmenia/{id}")
	public String inmuebleConsultadoArmenia() {
		return "redirect:/mapaArmenia";
	}
	
	@GetMapping("/mapaBogota")
	public String mapaBogota(Model model) 
	{model.addAttribute("bogota", interfaz.listarTodosBogota());	
	return "mapaBogota";}
	
	@GetMapping("/mapaBogota/inmuebleBogota/{id}")
	public String consultarInmuebleBogota(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("bogota", interfaz.obtenerBogotaPorId(id));
		return "inmuebleBogota";
	}
	
	@PostMapping("/mapaBogota/{id}")
	public String inmuebleConsultadoBogota() {
		return "redirect:/mapaBogota";
	}
	
	@GetMapping("/mapaGiron")
	public String mapaGiron (Model model)
	{model.addAttribute("giron",interfaz.listarTodosGiron());
	return "mapaGiron";}
	
	@GetMapping("/mapaGiron/inmuebleGiron/{id}")
	public String consultarInmuebleGiron(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("giron", interfaz.obtenerGironPorId(id));
		return "inmuebleGiron";
	}
	
	@PostMapping("/mapaGiron/{id}")
	public String inmuebleConsultadoGiron() {
		return "redirect:/mapaGiron";
	}
		
	@GetMapping("/mapaManizales")
	public String mapaManizales(Model model)
	{model.addAttribute("manizales", interfaz.listarTodosManizales());
	return "mapaManizales";}
	
	@GetMapping("/mapaManizales/inmuebleManizales/{id}")
	public String consultarInmuebleManizales(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("manizales", interfaz.obtenerManizalesPorId(id));
		return "inmuebleManizales";
	}
	
	@PostMapping("/mapaManizales/{id}")
	public String inmuebleConsultadoManizales() {
		return "redirect:/mapaManizales";
	}
	
	@GetMapping("/mapaCartagena")
	public String mapaCartagena(Model model) 
	{model.addAttribute("cartagena", interfaz.listarTodosCartagena());	
	return "mapaCartagena";}
	
	@GetMapping("/mapaCartagena/inmuebleCartagena/{id}")
	public String consultarInmuebleCartagena(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cartagena", interfaz.obtenerCartagenaPorId(id));
		return "inmuebleCartagena";
	}
	
	@PostMapping("/mapaCartagena/{id}")
	public String inmuebleConsultadoCartagena() {
		return "redirect:/mapaCartagena";
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
	
	@GetMapping("/error")
	public String error() {
		
		return "error";
	}
}
