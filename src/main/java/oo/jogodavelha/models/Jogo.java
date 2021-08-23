package oo.jogodavelha.models;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Jogo {
	
	private Scanner ler = new Scanner(System.in);
	
	public Tabuleiro tabuleiro = new Tabuleiro();
	
	

	public Map getBoard() {
		return tabuleiro.getTabuleiro();
	}

	public boolean check(Jogada umaJogada) {
		boolean test = tabuleiro.checkPosition(umaJogada.coordenada);
		
		if(test)
			return false;
		return true;
	}

	public BooleanSupplier hasWinner() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public Jogo(){
		
	}
	
	public void init() {
				
	}


	public void add(Jogada jogada) {
		boolean test = this.check(jogada);
		
		if(test) {
			this.tabuleiro.add(jogada);
		}
	}
}
