/*
Se��o 3 exerc�cio 4
fa�a um algoritmo que pe�a dois n�meros e imprima a soma.

Entrada
    numero 1
    numero 2
processamento
    somar numero1 + numero 2
sa�da
    mostrar resultado da soma
*/

#include <stdio.h>
#include <locale.h>

int main(void)

{
    int Num1, Num2;
    setlocale(LC_ALL, "Portuguese_Brazil");
    printf("Informe o primeiro n�mero: ");
    scanf("%d", &Num1);
    printf("\nInforme o segundo n�mero: ");
    scanf("%d", &Num2);
    printf("\n A soma dos dois n�meros � %d", Num1 + Num2);
}
