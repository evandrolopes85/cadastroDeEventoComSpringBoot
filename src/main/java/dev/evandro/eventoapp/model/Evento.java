package dev.evandro.eventoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements java.io.Serializable{

	private static final long serialVesionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long codigo;

	private String nome;
	private String local;
	private String data;
	private String horario;

	public Long getCodigo(){
		return this.codigo;
	}

	public String getNome(){
		return this.nome;
	}

	public String getLocal(){
		return this.local;
	}

	public String getData(){
		return this.data;
	}

	public String getHorario(){
		return this.horario;
	}

	public void setCodigo(){
		this.codigo = codigo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setLocal(String local){
		this.local = local;
	}

	public void setData(String data){
		this.data = data;
	}

	public void setHorario(String horario){
		this.horario = horario;
	}
}