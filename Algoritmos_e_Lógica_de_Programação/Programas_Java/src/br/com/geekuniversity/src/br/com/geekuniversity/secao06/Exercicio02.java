package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variáveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero > 0) {
			a = numero;
			//Saída
			System.out.println(a);
		}else {
			b = numero;
			//Saída
			System.out.println(b);
		}
		teclado.close();
	}

}
