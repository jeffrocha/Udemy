package br.com.github.secao02; //pacote onde o arquivo se encontra

import java.util.Scanner;

public class Ex02 { //classe java, ela faz parte de uma estrutura da orientação a objeto

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*>Faça um algoritmo para somar dois números e multiplicar o resultado pelo primeiro número<*/
		
		//variaveis
		int Var_Num1, Var_Num2, Var_Soma, Var_Mult;
            //Entradas
            try (Scanner teclado = new Scanner(System.in)) {
                //Entradas
                System.out.println("Informe o Primeiro Número: ");//Escrever e pular linha
                // System.out.print("Informe..");//Escrever e não pular linha
                Var_Num1 = teclado.nextInt(); // Receber o dado via teclado e o tipo de dado next"Int" ou se fosse tipo float next"Float"
                System.out.println("Informe o Segundo Número: ");
                Var_Num2 = teclado.nextInt();
                //processamento
                Var_Soma = Var_Num1 + Var_Num2;
                Var_Mult= Var_Soma * Var_Num1;
                //Saída
                System.out.println("O Resultado da Multiplicação é "+ Var_Mult);
                //Fechar a conceção com o teclado que foi aberto na linha 15
            } //Escrever e pular linha
		
	}

}