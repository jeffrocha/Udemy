/*
Se��o 6 - Exerc�cio 8
Fa�a um algoritmo que leia um n�mero inteiro e mostre uma mensagem
indicando se este n�mero � par ou impar, se � positivo ou negativo.
*/

#include <stdio.h>
#include <string.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese,Brazil");
    int Num1;
    char NumIP[6];
    char NumPN[9];

    printf("Digite um valor: ");
    scanf("%d", &Num1);

    if (Num1 > 0)
    {
        strcpy(NumPN, "Positivo");
    }
    else
    {
        strcpy(NumPN, "Negativo");
    }
    if (Num1 % 2 == 0)
    {
        strcpy(NumIP, "Par");
    }
    else
    {
        strcpy(NumIP, "Impar");
    }
    printf("O n�mero � %s %s", NumIP, NumPN);

    return (0);
}