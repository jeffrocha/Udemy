/******************************************************************************
Faça um algoritmo que conte de 1 a 100 e a cada multiplo de 10 uma mensagem 
"Multiplo de 10" apareceça  
*******************************************************************************/
package br.com.github.secao07;


public class ex02
{

public static void main(String[] args) 
  {
    for (int i=1; i<= 100; i++)
    {
        if (i%10==0){
            System.out.print(i);
            System.out.print(" = Multiplo de 10 \n");
        }else{
            System.out.println(i);}
    }
	}
}
