package oo.jogodavelha.models;
import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {

	private Map<Coordenada, Jogada> tabuleiro = new HashMap<Coordenada, Jogada>();

	public Map getTabuleiro() {
		return tabuleiro;
	}
	
	private Coordenada getPosicao() {
		return null;

	}

	public boolean checkPosition(Coordenada coordenada) {
		
		for (Coordenada coord : tabuleiro.keySet()) {
			if(coord.equals(coordenada)) {
				return true;
			}
		}
		return false;
		
	}
	
	public void add(Jogada umaJogada){
		tabuleiro.put(umaJogada.coordenada, umaJogada);
	}

	

}
