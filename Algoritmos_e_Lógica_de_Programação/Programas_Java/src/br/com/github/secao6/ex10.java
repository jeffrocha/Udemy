package br.com.github.secao6;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	int varIdade;
	Scanner teclado=new Scanner(System.in);
		
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
