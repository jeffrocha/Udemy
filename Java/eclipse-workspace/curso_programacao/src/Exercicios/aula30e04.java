package Exercicios;

import java.util.Scanner;

public class aula30e04 {

	public static void main(String[] args) {
				/*
		 * Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas,o valor que recebe por 
		 * hora e calcule o salário desse funcionário. A seguir, 
		 * mostre o número e o salário do funcionário, com duas 
		 * casas decimais.
		 */
		Scanner sc = new Scanner(System.in);
		
		//Entrada: Número do funcionario, Horas Trabalhadas, Salario Hora
		int idFuncionario;
		int horasTrabalhadas;
		Double salarioHora=0.00;
		Double salarioTotal=0.00;

		System.out.print("Digite o id do funcionario:"); 
		idFuncionario = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas:");
		horasTrabalhadas= sc.nextInt();
		System.out.print("Digite o salario hora do funcionario com duas casa decimais (0.00): R$");
		salarioHora=sc.nextDouble();
		
		//Processamento: Multiplique as horas trabalhadas pelo salario
		salarioTotal=salarioHora*horasTrabalhadas;
		
		//Saida: Mostre o número do funcionario e o salario com duas casas decimais.
        System.out.println("ID do Funcionario é: " + idFuncionario);
        System.out.println("Horas Trabalhdas pelo funcionario: " + horasTrabalhadas);
        System.out.println("Salario hora do trabalhador: " + salarioHora);
        System.out.println("Salario total do funcionario:R$" + salarioTotal);
        sc.close();

	}
}
