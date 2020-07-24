package dev.evandro.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

	@RequestMapping(path = "/cadastrarEvento")
	public String form(){
		return "evento/formEvento";	
	}
}