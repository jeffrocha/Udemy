package br.com.github.secao6;

import java.util.Scanner;


public class ex05 {

	public static void main(String[] args) {
		/*
		 * crie um sistema de pesca onde se o peso do peixe for maior que 50kg deve pagar multa de R$4,00 por
		 * kg excedente.
		 * no final mostrar o peso do peixe, o peso excedente e a multa a pagar. 
		 */
		Scanner teclado=new Scanner(System.in);
		
		//Variaveis
		float Var_Peso=0,Var_Excedente=0,Var_Multa=0;
		
		//main
		System.out.print("Digite a quantidade de peixe pescado em KG (XX,X): ");
		Var_Peso=teclado.nextFloat();
		if (Var_Peso>50) {
			Var_Excedente=Var_Peso-50;
			Var_Multa=(float)Var_Excedente*4;
			System.out.println("Peso Limite excedido");
			System.out.printf("Pesagem: %.2f KG %n",(Var_Peso));
			System.out.printf("Excedente: %.2f KG %n",(Var_Excedente));
			System.out.printf("Multa: R$ %.2f %n",(Var_Multa));
		}else {
			System.out.printf("Pesagem: %.2f KG %n",(Var_Peso));
			System.out.printf("Excedente: %.2f KG %n",(Var_Excedente));
			System.out.printf("Multa: R$ %.2f %n",(Var_Multa));
			teclado.close();
		}

	}

}
