package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o primeiro vetor: ");
			vetor1[i] = teclado.nextInt();
			System.out.println("Informe o valor para o segundo vetor: ");
			vetor2[i] = teclado.nextInt();
			soma[i] = vetor1[i] + vetor2[i];
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(soma[i]);
		}
		teclado.close();
	}

}
