/*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das 
seguites catergorias
Infantil-A 5 a 7 anos;
Infantil-B 8 a 11 anos;
Juvenil-A 12 a 13 anos;
Juvenil-B 14 a 17 anos;
Adulto = Maiores de 18 anos;
*/

package br.com.github.secao06;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	int varIdade;
            try (Scanner teclado = new Scanner(System.in)) {
                System.out.println("Digite a idade do nadador: ");
                varIdade=teclado.nextInt();
                
                if(varIdade>= 5 && varIdade <= 7){
                    System.out.println("Infantil A");
                }else if (varIdade >= 8 && varIdade <= 11){
                    System.out.println("Infantil-B");
                }else if (varIdade >= 12 && varIdade <= 13 ){
                    System.out.println("Juvenil-A");
                }else if (varIdade >= 14 && varIdade <= 17 ){
                    System.out.println("Juvenil-B");
                }else if (varIdade >=18 ){
                    System.out.println("Adulto");}
            }
	}
}
