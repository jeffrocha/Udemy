/*Problema exemplo
	Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito a 100 minutos de telefone.
	Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00.
	Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
	Exemplos de entrada e saída:
	Entrada			Saida
	22  			Valor a pagar: R$ 50,00
	103				Valor a pagar: R$ 56,00
*/


package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class aula38ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int minutos = sc.nextInt();
		
		double conta=50.0;
		
		if (minutos > 100) {
			//conta=conta+(minutos-100)*2.0;
			conta += (minutos-100)*2.0;
		
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n",conta);
		
		sc.close();
	}

}
