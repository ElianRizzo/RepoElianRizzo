package EncuestaDeVotacion.encuesta;


import java.util.List;

import org.uqbar.commons.model.Entity;
import org.uqbar.commons.utils.Observable;

@Observable
public class Encuesta extends Entity{
	Zona zonaVotacion;
	Candidato candidato;
	
	public Zona getZonaVotacion() {
		return zonaVotacion;
	}

	public void setZonaVotacion(Zona zonaVotacion) {
		this.zonaVotacion = zonaVotacion;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public List<Zona> getZonas(){
		return HomeZonas.homeZonas().allInstances();
	}
	
	public void votar(){
		this.candidato.sumarVoto();
	}
}
