package br.com.github.secao03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo para "Calcular o estoque médio de uma peça sendo que? 
		 * estoque_medio = (quantidade_minima + quantidade_maxima)/2
		 */
		//variaveis
		int  quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe a quantidade minima: ");
		quantidade_minima=teclado.nextInt();
		
		System.out.print("Informe a quantidade maxima: ");
		quantidade_maxima=teclado.nextInt();
		
		//processamento
		estoque_medio=(quantidade_minima + quantidade_maxima)/2;
		
		//saída
		System.out.print("O estoque médio é: "+estoque_medio);
		teclado.close();
		
	}

}
