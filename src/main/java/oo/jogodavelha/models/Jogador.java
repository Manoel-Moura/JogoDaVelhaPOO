package oo.jogodavelha.models;

public class Jogador {
	private Character simbolo;
	private int vitorias=0;
	
	public Character getSimbolo() {
		return simbolo;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void representa(Character simbolo) {
		this.simbolo = simbolo;
	}

}
