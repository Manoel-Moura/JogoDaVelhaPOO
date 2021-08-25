package oo.jogodavelha;

import java.util.Map.Entry;
import java.util.Scanner;

import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;
import oo.jogodavelha.models.Coordenada;
import oo.jogodavelha.models.Jogada;
import oo.jogodavelha.models.Jogo;
import oo.jogodavelha.models.Tabuleiro;

public class Main {

	public static void main(String[] args) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido {

			
			Jogo g = new Jogo();
			
			g.add(new Jogada('X',new Coordenada(0,0)));
			g.add(new Jogada('X',new Coordenada(0,1)));
//			g.add(new Jogada('X',new Coordenada(0,2)));
			
//			g.add(new Jogada('X',new Coordenada(1,0)));
//			g.add(new Jogada('X',new Coordenada(1,1)));
//			g.add(new Jogada('X',new Coordenada(1,2)));
//			
//			g.add(new Jogada('X',new Coordenada(2,0)));
//			g.add(new Jogada('X',new Coordenada(2,1)));
//			g.add(new Jogada('X',new Coordenada(2,2)));
	////======================================================
//			g.add(new Jogada('X',new Coordenada(0,0)));
//			g.add(new Jogada('X',new Coordenada(1,0)));
//			g.add(new Jogada('X',new Coordenada(2,0)));
			
//			g.add(new Jogada('X',new Coordenada(0,1)));
//			g.add(new Jogada('X',new Coordenada(1,1)));
//			g.add(new Jogada('X',new Coordenada(2,1)));
//			
//			g.add(new Jogada('X',new Coordenada(0,2)));
//			g.add(new Jogada('X',new Coordenada(1,2)));
//			g.add(new Jogada('X',new Coordenada(2,2)));
	////======================================================
//			g.add(new Jogada('X',new Coordenada(0,0)));
//			g.add(new Jogada('X',new Coordenada(1,1)));
//			g.add(new Jogada('X',new Coordenada(2,2)));
					
//			g.add(new Jogada('X',new Coordenada(0,2)));
//			g.add(new Jogada('X',new Coordenada(1,1)));
//			g.add(new Jogada('X',new Coordenada(2,0)));		

	//==========================================================
//			g.add(new Jogada('X',new Coordenada(0,0)));
//			g.add(new Jogada('O',new Coordenada(0,1)));
//			g.add(new Jogada('O',new Coordenada(1,0)));
//			g.add(new Jogada('O',new Coordenada(2,2)));
//			g.add(new Jogada('O',new Coordenada(0,2)));
//			g.add(new Jogada('X',new Coordenada(1,1)));
//			g.add(new Jogada('X',new Coordenada(1,2)));
//			g.add(new Jogada('X',new Coordenada(2,0)));
//			g.add(new Jogada('X',new Coordenada(2,1)));
			
			g.printTabuleiro();
			
			System.out.println(g.hasWinner()+" Tam: "+g.tamanho());
			
			
			
			
			
			
	}

}
