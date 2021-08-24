package oo.jogodavelha.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Jogo {

//	private Scanner ler = new Scanner(System.in);

	public Tabuleiro tabuleiro = new Tabuleiro();

	public Map getBoard() {
		return tabuleiro.getTabuleiro();
	}

	public int tamanho() {
		return tabuleiro.tamanhoTabuleiro();
	}

	public boolean check(Jogada umaJogada) {
		boolean test = tabuleiro.checkPosition(umaJogada.coordenada);

		if (test)
			return false;
		return true;
	}

	public boolean hasWinner() {

		int jaJogado = tabuleiro.tamanhoTabuleiro();
		Map<Coordenada, Jogada> vai = tabuleiro.getTabuleiro();
		Character simb;

		// if(jaJogado >=5) {
		simb = 'X';
		if (this.condicoes(simb, vai))
			return true;

		simb = 'O';
		if (this.condicoes(simb, vai))
			return true;
		// }

		if (jaJogado == 9) {
			System.out.println("Deu velha");
			return true;
		}

		return false;

//		tabuleiro.completaMatriz();
//		if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(0, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(0, 2).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(0, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(0, 2).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(1, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(1, 2).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(1, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(1, 2).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(2, 0).equals('X') && tabuleiro.getMatrizTabuleiro(2, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(2, 0).equals('O') && tabuleiro.getMatrizTabuleiro(2, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 0).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 0).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 1).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 1).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 1).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 1).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('X') && tabuleiro.getMatrizTabuleiro(1, 2).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('O') && tabuleiro.getMatrizTabuleiro(1, 2).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 0).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 2).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('X') && tabuleiro.getMatrizTabuleiro(1, 1).equals('X')
//				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('X')) {
//			System.out.println("\nJogador X ganhou!");
//			return true;
//		} else if (tabuleiro.getMatrizTabuleiro(0, 2).equals('O') && tabuleiro.getMatrizTabuleiro(1, 1).equals('O')
//				&& tabuleiro.getMatrizTabuleiro(2, 0).equals('O')) {
//			System.out.println("\nJogador O ganhou!");
//			return true;
//		}
//		else if (tabuleiro.tamanhoTabuleiro()  == 9) {
//			System.out.println("\nDeu velha");
//			return true;
//		}
//		return false;
	}

	private boolean condicoes(Character simb, Map<Coordenada, Jogada> vai) {
		int venceu = 0;

		for (int i = 0; i < 3; i++) { // linha
			for (int j = 0; j < 3; j++) { // coluna
				for (Coordenada coo : vai.keySet()) {
					if (coo.getX() == i && coo.getY() == j) {
						if (vai.get(coo).getSimbolo() == simb) {
							venceu++;
							continue;
						}
					} 
				}
				
				
			}
			if(venceu<3) {
				venceu = 0;
			}
			if (venceu == 3) {
				System.out.println("Jogador " + simb + " ganhou !!");
				return true;
			}
		}
		
		for (int i = 0; i < 3; i++) { // linha
			for (int j = 0; j < 3; j++) { // coluna
				for (Coordenada coo : vai.keySet()) {
					if (coo.getX() == j && coo.getY() == i) {
						if (vai.get(coo).getSimbolo() == simb) {
							venceu++;
							continue;
						}
					} 
				}
				
				
			}
			if(venceu<3) {
				venceu = 0;
			}
			if (venceu == 3) {
				System.out.println("Jogador " + simb + " ganhou !!");
				return true;
			}
		}

		for (int j = 0; j < 3; j++) { // coluna
			for (Coordenada coo : vai.keySet()) {
				if (coo.getX() == j && coo.getY() == j) {
					if (vai.get(coo).getSimbolo() == simb) {
						venceu++;
						continue;
					}
				} 
			}
			
		}
		if (venceu == 3) {
			return true;
		}else {
			venceu = 0;
		}

		for (int j = 0; j < 3; j++) { // coluna
			for (Coordenada coo : vai.keySet()) {
				if (coo.getX() == j && coo.getY() == 2 - j) {

					if (vai.get(coo).getSimbolo() == simb) {
						venceu++;
						continue;
					}
				}
			}
			
		}
		if (venceu == 3) {
			return true;
		}else {
			venceu = 0;
		}
		
		return false;
	}

	public Jogo() {

	}

	public void init() {

	}

	public void printTabuleiro() {
		tabuleiro.printMatriz();
	}

	public void add(Jogada jogada) {
		boolean test = this.check(jogada);

		if (test) {
			this.tabuleiro.add(jogada);
		}

	}
}