package EncuestaDeVotacion.encuesta;

import java.util.List;

import org.uqbar.commons.model.AbstractAutogeneratedIdHome;

public class HomeCandidatos extends AbstractAutogeneratedIdHome<Candidato>{
	private static HomeCandidatos instance = new HomeCandidatos();

	public static HomeCandidatos homeCandidatos() {
		return instance;
	}
	
	public HomeCandidatos() {
		
	}

	public Class<Candidato> getEntityType() {
		// TODO Auto-generated method stub
		return null;
	}

	public Candidato searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Candidato> searchByExample(Candidato example) {
		// TODO Auto-generated method stub
		return null;
	}

	public Candidato createExample() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Candidato> allInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Candidato object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void effectiveCreate(Candidato object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void effectiveDelete(Candidato object) {
		// TODO Auto-generated method stub
		
	}

}
