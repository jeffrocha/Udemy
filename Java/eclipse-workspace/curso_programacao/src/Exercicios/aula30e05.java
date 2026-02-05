package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class aula30e05 {
	public static void main(String[] args) {
		/*Fazer um programa para ler o código da peça 1, o número de peças 1, o valor unitario de cada peça 1,
		o código da peça 2, o número de peças 2, o valor unitario de cada peça 2. Calcule e mostre o valor a ser pago.*/
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);	
		int qtdPeca1,qtdPeca2;
		double valorPeca1,valorPeca2,valorTotal;
        System.out.print("Número de peças 1:");
        qtdPeca1=sc.nextInt();
        System.out.print("Número de peças 2:");
        qtdPeca2=sc.nextInt();
        System.out.print("Digite o valor da peça 1 (0.00):R$");
        valorPeca1=sc.nextDouble();
        System.out.print("Digite o valor da peça 2 (0.00):R$");
        valorPeca2=sc.nextDouble();	
		valorTotal=(valorPeca1*qtdPeca1)+(valorPeca2*qtdPeca2);	
		System.out.printf("Valor total:R$%.2f",valorTotal);
		sc.close();}}
