package Exercicios;

import java.util.Scanner;

public class aula36e01 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número
		 * é negativo ou não negativo.
		 */
		Scanner sc=new Scanner(System.in);
		int varNumber;
		
		System.out.println("Digite um valor inteiro:");
		varNumber=sc.nextInt();
		
		if (varNumber > 0) {
			System.out.println("Número positivo");
		} else if(varNumber < 0){
			System.out.println("Numero negativo");	
		}else {
			System.out.println("Número neutro");
		}
		sc.close();
	}
}
