/******************************************************************************
Faça um algoritmo que gere e escreva os números impares dos
números entre 100 e 200
*******************************************************************************/

package br.com.github.secao07;

import java.util.Scanner;

public class ex03 
{
    public static void main(String[] args) {
    for (int i=100; i<=200 ;i++){
        if (i %2 != 0){
            System.out.println(i);
        }
    } 
    }
}
