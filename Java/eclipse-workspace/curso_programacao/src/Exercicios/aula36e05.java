package Exercicios;

import java.util.Scanner;

public class aula36e05 {

	public static void main(String[] args) {
		 /* Com base na tabela abaixo, escreva um programa que leia o 
		    código de um item e a quantidade deste item. A seguir, 
		    calcule e mostre o valor da conta a pagar.
			Tabela de itens:
			CÓDIGO | ESPECIFICAÇÃO     | PREÇO
			-----------------------------------
			1      | Cachorro Quente   | R$ 4.00
			2      | X-Salada          | R$ 4.50
			3      | X-Bacon           | R$ 5.00
			4      | Torrada simples   | R$ 2.00
			5      | Refrigerante      | R$ 1.50
		 */
		Scanner sc=new Scanner (System.in);
		int varCodigo,varQuantidade;
		double varTotal;
		
		System.out.println("Digite o código do item: ");
		varCodigo=sc.nextInt();
		
		System.out.println("Digite a quantidade do item: ");
		varQuantidade=sc.nextInt();
		
		switch(varCodigo) {
			case 1:
				varTotal=varQuantidade*4;
				System.out.printf("Valor total é:R$%.2f",varTotal);
				break;
			case 2:
				varTotal=varQuantidade*4.5;
				System.out.printf("Valor total é:R$%.2f",varTotal);
				break;
			case 3:
				varTotal=varQuantidade*5;
				System.out.printf("Valor total é:R$%.2f",varTotal);
				break;
			case 4:
				varTotal=varQuantidade*2;
				System.out.printf("Valor total é:R$%.2f",varTotal);
				break;
			case 5:
				varTotal=varQuantidade*1.5;
				System.out.printf("Valor total é:R$%.2f",varTotal);
				break;
			default:
				System.out.println("Código invalido");
		}
		sc.close();
	}

}
