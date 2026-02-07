/*	Escreva um programa que repita a leitura de uma senha até que ela seja válida.
	Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
	Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
	Considere que a senha correta é o valor 2002.
*/


package Exercicios;

import java.util.Scanner;

public class aula55e01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int varSenha=123;
		int varSenhaEntrada;
		System.out.printf("Digite a senha: ");
		varSenhaEntrada= sc.nextInt();
		while(varSenha != varSenhaEntrada) {
			System.out.println("*** Senha incorreta! ***");
			System.out.printf("Digite a senha: ");
			varSenhaEntrada = sc.nextInt();
		}
			System.out.printf("Senha %d Correta", varSenha);
			sc.close();
	}
}


