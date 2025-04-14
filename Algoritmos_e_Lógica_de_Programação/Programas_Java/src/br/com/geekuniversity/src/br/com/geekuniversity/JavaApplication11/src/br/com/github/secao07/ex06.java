
package br.com.github.secao07;

import java.util.Scanner;

/******************************************************************************
* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer númerio
* inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
* tabuada. A saída deve ser conforme o exemplo abaixo:
* 
* tabuada de 5:
* 5 x 1 = 5
* 5 x 2 = 10
* .
* .
* .
* 5 x 10 = 50
*******************************************************************************/

//package br.com.github.secao07;

public class ex06 {
    
    public static void main(String[] args) {
        //variaveis
        int Varnum;
        Scanner teclado=new Scanner (System.in);
        
        //entrada
        System.out.print("Informe um número entre 1 a 10: ");
        Varnum = teclado.nextInt();
        
        //processamento
        while(Varnum < 1 || Varnum > 10){
        //Entrada
        System.out.println("informe um número entre 1 a 10: ");
        Varnum=teclado.nextInt();}
        for(int i = 1; i<= 10; i++){
            System.out.printf("%d x %d = %d \n", Varnum, i, (Varnum * i));}
    teclado.close();}}
  
