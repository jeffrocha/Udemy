package br.com.github.secao6;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia um número. se positivo armazene-o em 'a'
		 * se for negativo, em 'b'. no final mostrar o resultado
		 */
		Scanner teclado = new Scanner(System.in);
		
		//Variaveis
		int Var_N, Var_A, Var_B;
		
		//entrada
		System.out.print("Digite um valo para dizer se é positivo ou negativo: ");
		Var_N = teclado.nextInt();
		if (Var_N == 0 ) {
			System.out.print("Valor é Zero");
		}else if (Var_N > 0) {
			Var_A = Var_N;
			System.out.print("Valor "+Var_A+" é positivo");
		}else if (Var_N < 0) {
			Var_B=Var_N;
			System.out.print("Valor "+Var_B+" é negativo");
		}else {
			System.out.println("Informação digita invalida");
		}
		teclado.close();
	}

}
