package br.com.github.secao03;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que peça dois números e imprima a soma"
		 */
		
		//Variaveis
		int num1,num2,soma;
		Scanner teclado=new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe o primeiro número: ");
		num1=teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		num2=teclado.nextInt();
		
		//processamento
		soma=num1+num2;
		
		//saída
		System.out.print("A soma do "+num1+"+"+num2+" é: "+soma);
		teclado.close();
		
	}

}
