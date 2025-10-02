package Exercicios;

import java.util.Scanner;

public class aula36e03 {

    public static void main(String[] args) {
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são
         * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
         * crescente ou decrescente.
         */

        Scanner sc = new Scanner(System.in);
        int varA, varB;

        System.out.println("Digite o valor inteiro A:");
        varA = sc.nextInt();

        System.out.println("Digite o valor inteiro B:");
        varB = sc.nextInt();

        if (varA >= varB) {
            if (varA % varB == 0) {
                System.out.printf(varA + " É múltiplo de " + varB);
            } else {
                System.out.printf(varA + " Não é múltiplo de " + varB);
            }
        } else if (varB % varA == 0) {
            System.out.printf(varB + " É múltiplo de " + varA);
        } else {
            System.out.printf(varB + " Não é múltiplo de " + varA);
        }

        sc.close();
    }
}
