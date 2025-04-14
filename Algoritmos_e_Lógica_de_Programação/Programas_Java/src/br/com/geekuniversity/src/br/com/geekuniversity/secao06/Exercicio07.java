package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Variáveis
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o número 1: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o número 2: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o número 3: ");
		num3 = teclado.nextInt();
		System.out.println("Informe o número 4: ");
		num4 = teclado.nextInt();
		
		//Processamento
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
		
		if(q3 >= 1000) {
			//saída
			System.out.println(q3);
		}else {
			//saídas
			System.out.printf("Num1: %d Quadrado: %d\n", num1, q1);
			System.out.printf("Num2: %d Quadrado: %d\n", num2, q2);
			System.out.printf("Num3: %d Quadrado: %d\n", num3, q3);
			System.out.printf("Num4: %d Quadrado: %d\n", num4, q4);
		}
		teclado.close();

	}

}
