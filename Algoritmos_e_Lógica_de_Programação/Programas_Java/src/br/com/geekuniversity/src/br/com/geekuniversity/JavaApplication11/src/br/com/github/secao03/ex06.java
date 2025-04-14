package br.com.github.secao03;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	/*
	 * Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês
	 * Calcule e mostre o total do seu salário no referido mês.
	 */
	
		//variaveis
		int Var_HT;
		float Var_HH, Var_Salario;
		Scanner teclado=new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe o Valor da HORA HOMEM(XX,XX): ");
		Var_HH = teclado.nextFloat();
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		Var_HT = teclado.nextInt();
		
		//processamento
		Var_Salario = Var_HH * Var_HT;
		
		//saída
		System.out.println("Com "+Var_HH+" horas Trabalhadas e recebendo R$"+Var_HT+" a Hora;");
		System.out.println("O Salario do mês é: R$"+Var_Salario);
		teclado.close();
	}

}
