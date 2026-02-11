/*
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido, codificado da seguinte forma:
1 — Álcool
2 — Gasolina
3 — Diesel
4 — Fim
Caso o usuário informe um código inválido (fora do intervalo de 1 a 4), 
deve ser solicitado um novo código até que seja válido. 
O programa será encerrado quando o código informado for o número 4.
Ao final, deve ser apresentada a mensagem “MUITO OBRIGADO” e a 
quantidade de clientes que abasteceram cada tipo de combustível.
Exemplo
Entrada:		Saída:
8				MUITO OBRIGADO
1				Álcool: 1
7				Gasolina: 2
2				Diesel: 0
2				
4

 */

package Exercicios;

import java.util.Scanner;

public class aula55e03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int varAlcool=0, varGasolina=0, varDiesel=0, varIndex = 0;
		while (varIndex != 4) {
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Fim");
			varIndex=sc.nextInt();
			switch (varIndex) {
			case 1:
				varAlcool++;
				break;
			case 2:
				varGasolina++;
				break;
			case 3:
				varDiesel++;
				break;
			case 4:
				System.out.println("\nMuito Obrigado");
				System.out.printf("\nÁlcool:    " + varAlcool);
				System.out.printf("\nGasolina:  " + varGasolina);
				System.out.printf("\nDiesel:    " + varDiesel);
				break;
			default:
				System.out.println("\nCódigo invalido");
			}

		}
		sc.close();
	}

}
