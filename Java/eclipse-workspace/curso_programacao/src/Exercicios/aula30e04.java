package Exercicios;

import java.util.Scanner;

public class aula30e04 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas,o valor que recebe por hora e calcule o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Scanner sc = new Scanner(System.in);

		int idFuncionario;
		int horasTrabalhadas;
		Double salarioHora = 0.00;
		Double salarioTotal = 0.00;

		idFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salarioHora = sc.nextDouble();

		salarioTotal = salarioHora * horasTrabalhadas;

		System.out.println("NUMBER = " + idFuncionario);
		System.out.printf("salary = U$ %.2f", salarioTotal);
		sc.close();

	}
}
