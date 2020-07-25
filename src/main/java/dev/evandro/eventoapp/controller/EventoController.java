package dev.evandro.eventoapp.controller;

import dev.evandro.eventoapp.repository.EventoRepository;
import dev.evandro.eventoapp.model.Evento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository er;

	//@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.GET)
	@GetMapping(path = "/cadastrarEvento")
	public String form(){
		return "evento/formEvento";	
	}


	//@RequestMapping(value = "/cadastrarEvento", method=RequestMethod.POST)
	@PostMapping(path = "/cadastrarEvento")
	public String form(Evento evento){
		er.save( evento );
		return "redirect:/cadastrarEvento";	
	}
}