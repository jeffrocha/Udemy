package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class aula52ex01 {

	public static void main(String[] args) {
		// Entrar com números e ao digitar zero, mostrar soma de todos digitados	
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		int qtdTotal=0 ,varEntrada=1;
		
		System.out.println("Digite um valor inteiro ou zero para totalizar");
			varEntrada = sc.nextInt();
			while (varEntrada != 0) {
			qtdTotal += varEntrada;
			varEntrada=0;
			System.out.println("Digite um valor inteiro ou zero para totalizar");
			varEntrada = sc.nextInt();
		}
			System.out.printf("Valor total é %d",qtdTotal);
		sc.close();
	}

}
