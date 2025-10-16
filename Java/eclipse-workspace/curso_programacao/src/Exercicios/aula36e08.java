		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
		 * em pagar seus impostos, pois sabem que nele não existem políticos corruptos e
		 * os recursos arrecadados são utilizados em benefício da população, sem
		 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.Leia um
		 * valor com duas casas decimais, equivalente ao salário de uma pessoa de
		 * Lisarb.Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo. Faixa de Renda (R$)
		 * 
		 * Alíquota de IR (%)
		 * de 0.00 até 2000.00 Isento
		 * de 2000.01 até 3000.00 8%
		 * de 3000.01 até 4500.00 18%
		 * acima de 4500.00 28%
		 * 
		 * Lembre que, se o salário for R$ 3020.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 20.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais
		 */

package Exercicios;

import java.util.Scanner;

public class aula36e08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double varSalario=0;
		double varImposto=0;
		
		System.out.println("Digite o salario R%:");
		varSalario=sc.nextDouble();
				
		//2001-3000 = 8%
		if (varSalario>2000 && varSalario <=3000) {
			varImposto=varImposto+((varSalario-2000)*0.08);
			}

		//3001-4500=18%
		if (varSalario>3000 && varSalario <=4500) {
			varImposto=varImposto+((3000-2000)*0.08);
			varImposto=varImposto+((varSalario-3000)*0.18);}
		
		//>4500=28%
		if (varSalario>4500) {
			varImposto=varImposto+((3000-2000)*0.08);
			varImposto=varImposto+((4500-3000)*0.18);
			varImposto=varImposto+((varSalario-4500)*0.28);}
		
		System.out.printf("Salario é de R$:%.2f%n",varSalario);
		System.out.printf("Imposto é de R$:%.2f",varImposto);
		sc.close();
	}

}
