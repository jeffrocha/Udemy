package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula30e06 {

	public static void main(String[] args) {
		/* 
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:  
		 * a) a área do triângulo retângulo que tem A por base e C por altura.  A=(b.h)/2
		 * b) a área do círculo de raio C. (pi = 3.14159)  A=pi*r²
		 * c) a área do trapézio que tem A e B por bases e C por altura. A=((B+b)*h)/2  
		 * d) a área do quadrado que tem lado B.  A=b²
		 * e) a área do retângulo que tem lados A e B. A=b*h*/
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		double varA=0.00,varB=0.00,varC=0.00,varArea;
		varA=sc.nextDouble();
		varB=sc.nextDouble();
		varC=sc.nextDouble();
		
		varArea=(varA*varC)/2;
		System.out.printf("TRIANGULO=%.3f%n",varArea);
		
		varArea=3.14159*(Math.pow(varC, 2));
		System.out.printf("CIRCULO=%.3f%n",varArea);
		
		varArea=((varA+varB)*varC)/2;
		System.out.printf("TRAPEZIO=%.3f%n",varArea);
		
		varArea=Math.pow(varB, 2);
		System.out.printf("QUADRADO=%.3f%n",varArea);
		
		varArea=varA*varB;
		System.out.printf("RETANGULO=%.3f%n",varArea);
		sc.close();
	}
}
