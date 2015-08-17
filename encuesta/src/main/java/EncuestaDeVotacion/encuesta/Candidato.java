package EncuestaDeVotacion.encuesta;

import org.uqbar.commons.model.Entity;
import org.uqbar.commons.utils.Observable;

@Observable
public class Candidato extends Entity{
	int votos = 0;
	String nombre, partido;
	
	public Candidato(String nombre, String partido){
		this.nombre = nombre;
		this.partido = partido;
	}
	public void sumarVoto(){
		votos++;
	}
	@Override
	public String toString(){
		return nombre + "(" + partido + ") - " + votos + " votos";
	}
}
