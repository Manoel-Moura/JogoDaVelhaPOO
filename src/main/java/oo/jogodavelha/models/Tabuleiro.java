package oo.jogodavelha.models;
import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {

	public Map<Coordenada, Character> tabuleiro;
	Character matrizTabuleiro[][] = new Character[3][3];

	public int tamnahoMap() {
		return tabuleiro.size();
	}
	protected Character getMatrizTabuleiro(int x, int y) {
		return matrizTabuleiro[x][y];
	}

	
	public Map getTabuleiro() {
		return tabuleiro;
	}

	private Coordenada getPosicao() {
		return null;

	}

	public boolean checkPosition(Coordenada coordenada) {

		for (Coordenada coord : tabuleiro.keySet()) {
			if (coord.equals(coordenada)) {
				return true;
			}
		}
		return false;

	}

	public void preencheMatriz() {
		for (Coordenada chave : tabuleiro.keySet()) {
			matrizTabuleiro[chave.getX()][chave.getY()] = tabuleiro.get(chave);
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
		tabuleiro = new HashMap<Coordenada, Character>();
	}

	public void add(Jogada umaJogada) {
		tabuleiro.put(umaJogada.coordenada, umaJogada.simbolo);
	}

}