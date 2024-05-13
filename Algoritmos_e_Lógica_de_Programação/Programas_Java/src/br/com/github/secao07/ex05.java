/******************************************************************************
Construa um algoritmo que leia 10 valores inteiros e positivos e:
a)Encontre o maior valores;
b)Encontre o menor valor;
c)Calcule a média dos números lidos
*******************************************************************************/

package br.com.github.secao07;

import java.util.Scanner;

public class ex04 

{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int varIndice,varMaior=0, varMenor=0, varMedia=0;
        for (int i=1 ; i<=10 ; i++){
            System.out.printf("Digite o %dº valor: ", i);
            varIndice=teclado.nextInt();
            if (varIndice > varMaior){
                varMaior=varIndice;}
                
           if(i==1){
               varMenor=varIndice;
           }else if(varIndice<varMenor){
               varMenor=varIndice;
           }
                
            varMedia += varIndice;
        }
            varMedia = varMedia/10;
            System.out.println(varMaior);
            System.out.println(varMenor);
            System.out.println(varMedia);
            teclado.close();
        } 
    }
