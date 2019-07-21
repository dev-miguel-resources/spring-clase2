package com.chilecompra.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chilecompra.springboot.di.app.models.service.IServicio;
//import com.chilecompra.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	//private MiServicio servicio = new MiServicio();
	
	//Con inyección, pero todavía no esta totalmente desacoplado
	
	@Autowired
	@Qualifier("miServicioSimple")
	private IServicio servicio;
	
	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	public IServicio getServicio() {
		return servicio;
	}
	
}
