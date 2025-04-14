package br.com.github.secao06;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
		 * um algoritmo que calcule o peso ideal, utilizando as seguintes formulas:
		 * Para homens: (72.7 * altura) - 58
		 * para mulheres: (62.1 * altura) - 44.7
		 */
		Scanner teclado=new Scanner(System.in);

		//variaveis
		char Var_Sexo;
		float Var_Altura, Var_Peso;

		//main
		System.out.print("Digite a altura:");
		Var_Altura=teclado.nextFloat();
		System.out.print("Digite o Gênero [M ou F]:");
		Var_Sexo=teclado.next().charAt(0); //pegar só um primeiro caracter

		
		if (Var_Sexo == 'm' || Var_Sexo == 'M') {
			Var_Peso=(float)72.7 * Var_Altura - 58;
			System.out.printf("Peso ideal é %.2f",(Var_Peso));
		}else if (Var_Sexo == 'F' || Var_Sexo == 'f') {
			Var_Peso=(float) ((float)62.1 * Var_Altura - 44.7);
			System.out.printf("Peso ideal é %.2f",(Var_Peso));
		}else {
			System.out.println("Gênero não reconhecido");
		}
		teclado.close();
	}

}
