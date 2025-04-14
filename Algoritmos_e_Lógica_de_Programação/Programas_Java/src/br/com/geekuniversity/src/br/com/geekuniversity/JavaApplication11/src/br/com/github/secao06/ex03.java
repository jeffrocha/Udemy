package br.com.github.secao06;

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		/*
		 * Ler um número e verificar se ele é par ou impar. Quando for par armazenar
		 *  esse valor em 'p' e quando for impar armazena-lo em 'i'
		 *  exibir 'p' e i' no final do processamento.
		 */
	
	Scanner teclado=new Scanner(System.in);
	
	//variaveis
	int Var_Num, Var_P=0, Var_I=0;

	System.out.print("Digite um valor para encaminhar ele para impar ou par: ");
	Var_Num = teclado.nextInt();
	if (Var_Num%2==0) {
		Var_P=Var_Num;
		System.out.println("O valor é Par");
	}else {
		Var_I=Var_Num;
		System.out.println("O valor é Impar");
	}
		System.out.println("Variavel Par P:"+Var_P);
		System.out.println("Variavel Impar I:"+Var_I);
		teclado.close();
	}
}
