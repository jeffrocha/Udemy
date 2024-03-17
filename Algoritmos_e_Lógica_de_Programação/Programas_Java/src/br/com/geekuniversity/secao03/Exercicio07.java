package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float)(altura * 72.7) - 58; //cast
		
		//Saída
		System.out.printf("Seu peso ideal seria %.2f", peso_ideal);
		
		teclado.close();
	}

}
