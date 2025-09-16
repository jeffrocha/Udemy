package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula30e05 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler o código da peça 1, o número de peças 1, o valor unitario de cada peça 1,
		o código da peça 2, o número de peças 2, o valor unitario de cada peça 2. Calcule e mostre o valor a ser pago.
		*/
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigoPeca1,codigoPeca2,qtdPeca1,qtdPeca2;
		double valorPeca1,valorPeca2,valorTotal;
		
		
		//Entrada
		System.out.print("Digite o código da peça 1:");
        codigoPeca1=sc.nextInt();
        System.out.print("Digite o código da peça 2:");
        codigoPeca2=sc.nextInt();
        System.out.print("Número de peças 1:");
        qtdPeca1=sc.nextInt();
        System.out.print("Número de peças 2:");
        qtdPeca2=sc.nextInt();
        System.out.print("Digite o valor da peça 1 (0.00):R$");
        valorPeca1=sc.nextDouble();
        System.out.print("Digite o valor da peça 2 (0.00):R$");
        valorPeca2=sc.nextDouble();
		
		
		//processamento
		valorTotal=(valorPeca1*qtdPeca1)+(valorPeca2*qtdPeca2);
		
		//saída
		System.out.println("O código da peça 1 é " + codigoPeca1);
		System.out.println("O código da peça 2 é " + codigoPeca2);
		System.out.println("A quantidade da peça 1 é " + qtdPeca1);
		System.out.println("A quantidade da peça 2 é " + qtdPeca2);
		System.out.println("O valor da Peça 1 é: R$" + valorPeca1);
		System.out.println("O valor da Peça 2 é: R$" + valorPeca2);
		System.out.println();
		System.out.println("Valor total:R$" + valorTotal);
		sc.close();
	}
		
  }
