package br.com.github.secao06;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		/*
		 * Ler uma Variavel númerica n e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la comm o valor zero
		 */
		Scanner teclado = new Scanner(System.in);
		//Variaveis
		int Var_N;
		
		//Etranda
		System.out.print("Digite um valor: ");
		Var_N = teclado.nextInt();
		
		//processamento
		if (Var_N > 100) {
			System.out.println(Var_N);
		}else {
			Var_N=0;
			System.out.println(Var_N);
		}
		teclado.close();
	}

}
