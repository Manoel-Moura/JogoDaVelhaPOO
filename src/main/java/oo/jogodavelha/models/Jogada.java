package oo.jogodavelha.models;

public class Jogada {
	
	char simbolo;
	Coordenada coordenada;

	public Jogada(char c, Coordenada coordenada) {
		setSimbolo(c);
		setCoordenada(coordenada);
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada novacoordenada) {
		if(this.coordenada == null) {
			this.coordenada = novacoordenada;
		}
	}

//	public static String jogar(int linha, int coluna) {
//
//		if (linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) {
//			System.err.println("\nNao existe essa posicao");
//			return "Nao existe essa posicao";
//		} else {
//			if ((Tabuleiro.getPosicaoTabuleiro(linha, coluna)).equals(' ')) {
//				if (Jogo.isJogada()) {
//					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador1().getSimbolo());
//					Jogo.setJogada(false);
//					Tabuleiro.getTabuleiro();
//				} else {
//					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador2().getSimbolo());
//					Jogo.setJogada(true);
//					Tabuleiro.getTabuleiro();
//				}
//				return "Jogada feita";
//			} else {
//				Tabuleiro.getTabuleiro();
//				System.err.println("\nNao pode jogar ai");
//				return "Nao pode jogar ai";
//			}
//		}
//	}
}
