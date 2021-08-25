package oo.jogodavelha.models;
import java.util.HashMap;
import java.util.Map;
import oo.jogodavelha.exceptions.ExcecaoPorCoordenadaInvalida;
import oo.jogodavelha.exceptions.ExcecaoPorSimboloInvalido;

public class Tabuleiro {

	public Map<Coordenada, Jogada> tabuleiro;
	Character matrizTabuleiro[][] = new Character[3][3];
	Character vez = ' ';

	public int tamanhoTabuleiro() {
		return tabuleiro.size();
	}
	
//	protected Character getMatrizTabuleiro(int x, int y) {
//		return matrizTabuleiro[x][y];
//	}

	
	public Map getTabuleiro() {
		return tabuleiro;
	}

	public boolean verificaPosicao(Jogada jo) throws ExcecaoPorSimboloInvalido, ExcecaoPorCoordenadaInvalida {
		
		for (Coordenada coo : tabuleiro.keySet()) {
			if(coo.equals(jo.getCoordenada())) {
				throw new ExcecaoPorCoordenadaInvalida();
			}
		}
		
		if(vez == jo.getSimbolo()) {
			throw new ExcecaoPorSimboloInvalido();
		}
		
		if(jo.getCoordenada().getX() < 0 || jo.getCoordenada().getX() > 2 || 
				jo.getCoordenada().getY() < 0 || jo.getCoordenada().getY() > 2) {
			throw new ExcecaoPorCoordenadaInvalida();
		}
		
		
		
		
		return true;
	}


	public void preencheMatriz() {
		for (Coordenada chave : tabuleiro.keySet()) {
			matrizTabuleiro[chave.getX()][chave.getY()] = tabuleiro.get(chave).getSimbolo();
		}
	}
	
	public void completaMatriz() {
		preencheMatriz();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizTabuleiro[i][j] == null) {
					matrizTabuleiro[i][j] = '*';
				} 

			}
		}
	}
	
	public void printMatriz() {
		preencheMatriz();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrizTabuleiro[i][j] == null) {
					System.out.print("  | ");
				} else {
					System.out.print(matrizTabuleiro[i][j] + " | ");

				}

			}
			System.out.println(" ");
		}
	}

	public Tabuleiro() {
		tabuleiro = new HashMap<Coordenada, Jogada>();
	}

	public void add(Jogada umaJogada) throws ExcecaoPorCoordenadaInvalida, ExcecaoPorSimboloInvalido{
		try {
			verificaPosicao(umaJogada);
			tabuleiro.put(umaJogada.coordenada, umaJogada);
			vez = umaJogada.getSimbolo();
		} catch (ExcecaoPorCoordenadaInvalida e) {
			// TODO: handle exception
			throw new ExcecaoPorCoordenadaInvalida();
		} catch (ExcecaoPorSimboloInvalido e){
			throw new ExcecaoPorSimboloInvalido();
		}
		
		
	}

}