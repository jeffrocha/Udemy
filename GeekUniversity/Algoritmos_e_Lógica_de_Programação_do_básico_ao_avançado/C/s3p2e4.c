/*
Seção 3 exercício 4
faça um algoritmo que peça dois números e imprima a soma.

Entrada
    numero 1
    numero 2
processamento
    somar numero1 + numero 2
saída
    mostrar resultado da soma
*/

#include <stdio.h>
#include <locale.h>

int main(void)

{
    int Num1, Num2;
    setlocale(LC_ALL, "Portuguese_Brazil");
    printf("Informe o primeiro número: ");
    scanf("%d", &Num1);
    printf("\nInforme o segundo número: ");
    scanf("%d", &Num2);
    printf("\n A soma dos dois números é %d", Num1 + Num2);
}
