package br.com.github.secao03;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um algoritmo que converta metros para centímetros. 1 * 100
		 */
		
		//Variaveis
		int Var_Metros,Var_Centimetros;
		Scanner teclado=new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe o valor em metros: ");
		Var_Metros = teclado.nextInt();
		
		//processamento
		Var_Centimetros = Var_Metros * 100;
		
		//Saída
		System.out.print(Var_Metros+" (Metros) fica: "+Var_Centimetros+" (Centimetros)");
		teclado.close();
	}

}
