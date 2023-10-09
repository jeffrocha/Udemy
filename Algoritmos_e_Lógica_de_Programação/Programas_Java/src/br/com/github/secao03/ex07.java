package br.com.github.secao03;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa construa um algoritmo que calcule o peso ideal, usando a segunte formula:
		 * (72.7*altura)-58
		 */
		Scanner teclado=new Scanner(System.in);
		
		//Variaveis
		float Var_Altura,Var_Peso;
		
		//entrada
		System.out.print("Informe sua altura (X,XX): ");
		Var_Altura = teclado.nextFloat();
		
		//processamento
		Var_Peso = (float) ((72.7 * Var_Altura)-58);
		
		//saída
		System.out.printf("O peso ideal é: %.2f KG", (Var_Peso));
		/*
		* Utiliza-se printf para imprimir float e %.2f para definir a 
		* quantidade de casa depois da virgula 
		*/
		
		teclado.close();
	}

}
