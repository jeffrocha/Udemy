package Exemplos;

import java.util.Scanner;

public class aula47ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else
		{
			desconto = preco *0.05;
		}
		System.out.println(desconto);
		sc.close();
	}

}
