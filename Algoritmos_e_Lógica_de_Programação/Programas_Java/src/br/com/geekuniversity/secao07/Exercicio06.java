package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {	
		//variavel
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número entre 1 e 10: ");
		numero = teclado.nextInt();
		
		//Processamento
		while(numero < 1 || numero > 10) {
			//Entrada
			System.out.println("Informe um número entre 1 e 10: ");
			numero = teclado.nextInt();
		}
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}
		teclado.close();
	}
}
