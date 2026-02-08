/*
Escreva um programa para ler as coordenadas (X,Y) de uma 
quantidade indeterminada de pontos no sistema cartesiano. 
Para cada ponto escrever o quadrante a que ele pertence. 
O algoritmo será encerrado quando pelo menos uma de duas 
coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

package Exercicios;

import java.util.Scanner;

public class aula55e02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int varX,varY;
		varX=varY=1;
		while (varX != 0 && varY != 0){
		System.out.printf("Digite o valor de X: ");varX=sc.nextInt();
		System.out.printf("Digite o valor de y: ");varY=sc.nextInt();
		if (varX > 0 && varY > 0) { System.out.println("Primeiro");}
		if (varX < 0 && varY > 0) { System.out.println("Segundo");}
		if (varX < 0 && varY < 0) { System.out.println("Terceiro");}
		if (varX > 0 && varY < 0) { System.out.println("Quarto");}				
		}
		System.out.println("Finalizado");
		sc.close();
	}
}
