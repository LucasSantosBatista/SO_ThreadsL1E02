/**
 * 
 */
package controller;

/**
 * @author Lucas Batista 16 de mar. de 2024
 */
public class SomaMatriz extends Thread {

	private int[] matrizLinha;

	public SomaMatriz(int[] linha) {
		this.matrizLinha = linha;
	}

	@Override
	public void run() {
		int soma = 0;
		for (int valor : matrizLinha) {
			soma += valor;
		}
		System.out.println("#" + getId() + " | Soma = " + soma);
	}
}