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
		while (varX == 0 && varY == 0){
		System.out.println("Digite o valor de X");varX=sc.nextInt();
		System.out.println("Digite o valor de y");varY=sc.nextInt();
		}
		sc.close();
	}
}
