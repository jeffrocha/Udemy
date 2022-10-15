/*
Seção 3 - Exercício 5
Faça um algoritmo que converta metros para centímetros
*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    // entrada
    setlocale(LC_ALL, "Portuguese_Brazil");
    int VarMet, VarCent;
    printf("\n\nEsse sistema converde metros para centimetros\n");
    printf("Informe o valor em metros: ");
    scanf("%d", &VarMet);
    VarCent = VarMet * 100;
    printf("O Valor %d", VarMet);
    printf(" Metros é equivalente a %d", VarCent);
    printf(" Centímetros\n\n");
}
