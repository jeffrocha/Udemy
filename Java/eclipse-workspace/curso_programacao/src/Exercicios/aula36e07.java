package Exercicios;

import java.util.Scanner;

public class aula36e07 {

	public static void main(String[] args) {
		/*
		 * 	Leia 2 valores com uma casa decimal (x e y), que devem representar
		 *  as coordenadas de um ponto em um plano.A seguir, determine qual o 
		 *  quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
		 *  cartesianos ou na origem (x = y = 0).
		 *   Regras para a saída: Se o ponto estiver na origem, escreva:"Origem" 
		 *   Se o ponto estiver sobre um dos eixos, escreva:"Eixo X" ou "Eixo Y", conforme for o caso.
		 *   Caso contrário, indique o quadrante:
		 *   Primeiro quadrante → Q1
		 *   Segundo quadrante → Q2
		 *   Terceiro quadrante → Q3
		 *   Quarto quadrante → Q4
		 */
		Scanner sc=new Scanner(System.in);
		double x,y;
		
		System.out.println("Digite X:");
		x=sc.nextDouble();
		System.out.println("Digite Y:");
		y=sc.nextDouble();
		
		if (x==0){System.out.println("Eixo x");}
		if (y==0){System.out.println("Eixo y");}
		if (x>0 && y>0){System.out.println("Q2");}
		if (x>0 && y<0){System.out.println("Q4");}
		if (x<0 && y>0){System.out.println("Q1");}
		if (x<0 && y<0){System.out.println("Q3");}
		sc.close();
	}
	}
				
					
				
					
