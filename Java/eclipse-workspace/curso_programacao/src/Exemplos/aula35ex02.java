package Exemplos;

import java.util.Scanner;

public class aula35ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("bom dia");
		} else {
			System.out.println("boa tarde");
		}
		sc.close();
	}
}
