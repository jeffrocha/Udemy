package br.com.github.secao06;

import java.util.Scanner;

public class ex07 
{

	public static void main(String[] args) 
	{
		/*
		 * Desenvolva um algoritmo que:
		 * A)Leia 4 (Quatro) números;
		 * b)Calcule o quadrado de cada um;
		 * C)Se o valor resultante do quadrado do terceiro for >=1000. Imprima-o e finalize
		 * D)Caso contrario, imprima os valores lidos e seus respectivos quadrados.
		 */
		Scanner teclado=new Scanner(System.in);
	//Variaveis;
		int Var_Num[]=new int[4];		
	//main
		for (int i=0; i<4;i++) 
		{
			System.out.print("Digite o numero " + (i+1)+": ");
			Var_Num[i]=teclado.nextInt();
		}
		
		if (Var_Num[2]*Var_Num[2] >=1000)
		{
			System.out.println("\nO Quadrado da posição 3 ultrapassou 999 então apenas a posição 3 será exibida...");
			System.out.println("\n\tQuadrado da posição 3 é :"+(Var_Num[2]*Var_Num[2]));
		}
		else
		{
			for (int i=0; i<4;i++) 
			{	
				System.out.println("O Quadrado da posição " + (i+1)+" é: "+(Var_Num[i]*Var_Num[i]));
			}
		}
		teclado.close();
	}

}
