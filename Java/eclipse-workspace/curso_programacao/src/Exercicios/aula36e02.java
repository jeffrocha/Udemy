package Exercicios;

import java.util.Scanner;

public class aula36e02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor inteiro e retornar se ele é impar ou par
		
		Scanner sc=new Scanner(System.in);
		int varNumber;
		
		System.out.println("Digite um valor inteiro: ");
		varNumber=sc.nextInt();
		
		if (varNumber % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
