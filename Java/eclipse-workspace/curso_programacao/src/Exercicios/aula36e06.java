package Exercicios;

import java.util.Scanner;

public class aula36e06 {

	public static void main(String[] args) {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos este valor se
		 * encontra:[0,25][25,50][50,75][75,100] Se o valor não estiver em nenhum destes
		 * intervalos, deverá ser impressa a mensagem: “Fora de intervalo”
		 */

		Scanner sc = new Scanner(System.in);
		int varValor;

		System.out.println("Digite qualquer valor inteiro: ");
		varValor = sc.nextInt();

		if (varValor >= 0 && varValor <= 25) {
			System.out.println("Valor está entre [0,25]");
		} else if (varValor >= 26 && varValor <= 50) {
			System.out.println("Valor está entre [25 ,50]");
		} else if (varValor >= 51 && varValor <= 75) {
			System.out.println("Valor está entre [50 , 75]");
		} else if (varValor >= 76 && varValor <= 100) {
			System.out.println("valor está entre [75, 100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
