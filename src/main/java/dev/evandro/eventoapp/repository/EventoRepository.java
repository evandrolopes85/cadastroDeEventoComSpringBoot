package dev.evandro.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;
import dev.evandro.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	
}