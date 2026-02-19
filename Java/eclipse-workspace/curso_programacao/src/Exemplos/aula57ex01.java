package Exemplos;

import java.util.Scanner;

public class aula57ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números:");
        int N = sc.nextInt();

        int soma = 0;

        System.out.println("Digite os números:");

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }

}