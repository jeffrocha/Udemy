/*
 * Leia um valor inteiro X (1 <= X <= 1000). 
 * Em seguida mostre os ímpares de 1 até X, 
 * um valor por linha, inclusive o X, se for o caso.
 */

package Exercicios;

import java.util.Scanner;

public class aula61e01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor de X");
		int varX=sc.nextInt();
		for (int i=1; i<(varX+1); i++) {
			if (i %2!=0) {
			System.out.println(i);	
			}
			
		}
		sc.close();
	}

}

