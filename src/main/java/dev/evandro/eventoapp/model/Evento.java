package dev.evandro.eventoapp.model;

public class Evento {
	private String nome;
	private String local;
	private String data;
	private String horario;

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