package EncuestaDeVotacion.encuesta;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.*;

public class EncuestaWindow extends MainWindow<Encuesta>{

	public EncuestaWindow() {
		super(new Encuesta());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Encuestadora");
		
		new Label(mainPanel)
			.setText("Zona de Votación");
		Selector selector1 = new Selector<Zona>(mainPanel);
			selector1
			.allowNull(false)
			.bindItemsToProperty("zonas");
			selector1.bindValueToProperty("zonaVotacion");
		
			
		new Label(mainPanel)
			.setText("Candidato");
		Selector selector2 = new Selector<Zona>(mainPanel);
			selector2
			.allowNull(false)
			.bindItemsToProperty("zonaVotacion.candidatos");
			selector2.bindValueToProperty("candidato");
		
	}
	
	public static void main(String[] args) {
		new EncuestaWindow().startApplication();
	}

}
