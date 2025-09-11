package Exercicios;

import java.util.Locale;

public class aula30e02 {

	public static void main(String[] args) {
		/*Fórmula da área: area=Pi*raio²
		 Pi=3.14159*/
		double varA;
		double varArea;
		
		// Entrada: 2.0 Saída:A=12.5664
		Locale.setDefault(Locale.US);
		varA=2.00;
		varArea=0;
		varArea=3.14159*(Math.pow(varA, 2));
		System.out.printf("A=%.4f%n",varArea);
		
		// Entrada: 100.64 Saída:A=31819.3103
		varArea=0;
		varA=100.64;
		varArea=3.14159*(Math.pow(varA, 2));
		System.out.printf("A=%.4f%n",varArea);
		
		// Entrada: 150.00 Saída:A=70685.7750
		varArea=0;
		varA=150.00;
		varArea=3.14159*(Math.pow(varA, 2));
		System.out.printf("A=%.4f%n",varArea);
	}
}
