/*
* A secretaria de meio ambiente que controla o indice de poluição mantém 3 grupos de industrias que são altamente poluentes do meio ambiente.
* O indice de poluição aceitavel varia de 0,05 até 0,25.
* se o indice sobe para 0,3 as industrias do 1º grupo são intimadas a suspenderem suas atividades, 
* se o indice crescer para 0,4 as industrias do 1º e do 2º grupo sao indimadas a suspenderem suas atividades.
* se o indice atingir 0,5 todos os grupos devem ser notificados e paralisarem suas atividades.
* Faça um algoritmo que leia o indice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

package br.com.github.secao6;
import java.util.Scanner;
public class ex09 
{
	public static void main(String[] args) {
	    float varIndice;
	    Scanner teclado=new Scanner(System.in);
	    
	    System.out.println("Informe o indice de poluição");
	    varIndice=teclado.nextFloat();
	    
	   if(varIndice>=0.3 && varIndice< 0.4){
	       System.out.println("Suspender as atividades do primeiro grupo");
	   }else if (varIndice>=0.4 && varIndice< 0.5){
	       System.out.println("suspender as atividades do primeiro e segundo grupo");
	   }else if(varIndice>=0.5){
	       System.out.println("suspender as atividades de todos os grupos");
	   }else if(varIndice<0.3){
	       System.out.println("Manter as atividades de todos os grupos");}
	   
	       teclado.close();}
	}
