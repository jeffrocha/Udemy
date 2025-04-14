package br.com.github.secao6;

import java.util.Scanner;

public class ex08 
{
	public static void main(String[] args) 
	{
		/*
		 * Faça um algoritmo que 
		 * leia um número inteiro e 
		 * mostre uma mensagem indicando se este número é
		 * par ou impar ; positivo ou negativo.
		 */
		Scanner teclado=new Scanner(System.in);
		//variaveis
		int Var_Num1;
		
		//main
		System.out.println("Digite um número: ");
		Var_Num1=teclado.nextInt();
		
		if (Var_Num1<0) {
			System.out.print("Número é Negativo");
			if (Var_Num1%2==0) 
			{
				System.out.println(" e Par ");
			}
			else{System.out.println(" e Impar");}
		}
		else if (Var_Num1>0) {
			System.out.print("Número é Positivo");
			if (Var_Num1%2==0) 
			{
				System.out.println(" e Par ");
			}
			else
			{
				System.out.println(" e Impar");
			}
		}
		else if (Var_Num1==0) {
			System.out.println("Zero é considerado um número par. Isso ocorre porque um número\npar é definido como aquele que pode ser exatamente dividido por 2, e 0\nse encaixa nessa definição, já que 0 dividido por 2 é igual a 0.\n\nEm relação à sua polaridade, zero é considerado não positivo e não negativo. \nÉ o único número que não é categorizado como positivo nem negativo.");
		}
		else {
			System.out.println("Informação digitada não é um número");
		}
	
	teclado.close();
	}

}
