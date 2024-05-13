/******************************************************************************
Faça um algoritmo que determine o maior entre N números. A condição
de partida é a entrada de um valor 0, ou seja, o algoritmo deve ficar calculando
o maior até que a entrada seja igual a zero.
*******************************************************************************/

package br.com.github.secao07;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int varN, varMaior=0;
        
        System.out.println("informe um número: ");
        varN=teclado.nextInt();
        
        while (varN != 0) {
            if(varN>varMaior){
            varMaior=varN;}
        System.out.println("informe um número: ");
        varN=teclado.nextInt();
        }
        System.out.printf("O maior número é %d", varMaior);
        teclado.close();
	}
	}
