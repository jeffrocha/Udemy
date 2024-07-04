package br.com.github.secao6;

import java.util.Scanner;

public class ex06 
{

	public static void main(String[] args) 
	{
		/*
		 * Elabore um algoritmo que leia as variaveis 'c' e 'n', respectivamente 
		 * código e número de horas trabalhadas de um operario. 
		 * calcule o salario sabendo-se que ele ganha  RS 10.00 por hora. 
		 * Quando o número de horas exceder a 50 calcule o excesso de pagamento e
		 *  armazenando-o na variavel 'e', caso contrario zerar a variavel.
		 * A hora excedente de trabalho vale R$ 20,00. no Final do processamento 
		 * imprimir o salário total e o salário excedente.
		 */
		Scanner teclado=new Scanner(System.in);	
		//Variaveis
		String Var_C;
		float Var_N=0,Var_E=0;
		
		//main
		System.out.print("Digite o código do funcionario: ");
		Var_C=teclado.next();
		System.out.print("Digite as horas trabalhadas: ");
		Var_N=teclado.nextFloat();
		
		if (Var_N > 50) {
			System.out.printf("\n\nO Funcionário código:%s fez %.2f horas \n", Var_C, Var_N);
			System.out.printf("Excedendo em %.2f horas\n", (Var_N-50));
			Var_E =(float) (Var_N-50);
			System.out.printf("Salário total:R$ %.2f \n",((Var_N-(Var_N-50))*10));
			System.out.printf("Salário excedente:R$ %.2f \n",(Var_E*20));
		}
			else {
			System.out.printf("\n\nO Funcionário código:%s fez %.2f horas \n", Var_C, Var_N);
			System.out.printf("Excedendo em 0 horas\n");
			System.out.printf("Salário total:R$ %.2f \n",(Var_N*10));
			System.out.printf("Salário excedente:R$ 0,00 \n");
			Var_E=0;
			}
		teclado.close();
	}

}
