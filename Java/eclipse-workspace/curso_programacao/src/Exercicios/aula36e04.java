package Exercicios;

import java.util.Scanner;

public class aula36e04 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
		 * duração mínima de 1 hora e máxima de 24 horas."
		 */
		
		Scanner sc=new Scanner (System.in);
		
		int horaInicial,horaFinal,horaDif;
		
		System.out.println("Digite a hora inicial: ");
		horaInicial= sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		horaFinal=sc.nextInt();
		
		if (horaInicial>horaFinal) {
			horaDif=(((horaInicial-horaFinal)-24)*-1);
			System.out.print("A duração foi "+ horaDif);
		}else {
			horaDif=horaFinal-horaInicial;
			System.out.printf("A duração foi "+ horaDif);
		}
		sc.close();
	}
}
