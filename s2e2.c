/*
Se��o 2 - ex 2

Fa�a um algoritmo para somar dois n�meros e multiplicar o resultado pelo primeiro n�mero.
*/

#include<stdio.h>
#include <locale.h>
// std = standard (padr�o)
// io = input/output (Entrada/Sa�da)
//locale.h = biblioteca de regi�o

int main()// int � o valor que ira retornar da fun��o main no caso ir� retornar um inteiro
{
//Configura��o de acentua��o padr�o brazil  
 setlocale(LC_ALL, "Portuguese_Brazil");
//Variaveis tipo inteiro
int num1, num2, soma, multiplicacao;

//entradas
printf("Informe o primeiro n�mero: ");
scanf("%d", &num1);

printf("Informe o segundo n�mero: ");
scanf("%d", &num2);

//processamento 
soma= num1 + num2;
multiplicacao= soma * num1;

//saida
printf("o resultado � %d", multiplicacao);
}
