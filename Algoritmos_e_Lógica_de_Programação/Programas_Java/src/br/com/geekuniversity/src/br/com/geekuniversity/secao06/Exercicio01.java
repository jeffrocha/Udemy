package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		//processamento
		if(n > 100) {
			System.out.println(n);
		}else{
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}
}
