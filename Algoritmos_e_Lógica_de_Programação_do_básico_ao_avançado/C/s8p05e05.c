/*
se��o 08 - exercicio 05

Fa�a um programa que carregue um vetor com dez n�meros inteiros.
Calcule os n�meros superiores a 50 e suas respectivas posi��es. Mostre se n�o exisitir nenhum n�mero nesta condi��o.
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Valvet[10];
    int ValCond = 0;

    printf("\nDigite 10 n�meros inteiros\n");

    for (size_t i = 1; i < 11;)
    {
        printf("\nDigite o %d� n�mero inteiro: ", i);
        scanf("%d", &Valvet[i - 1]);
        if (Valvet[i - 1] > 0)
        {
            i += 1;
        }
        else
        {
            printf("Digite um valor inteiro para o %d� Vetor (>0)", i);
        }
    }
    for (size_t i = 1; i < 11; i++)
    {
        if (Valvet[i - 1] > 50)
        {
            printf("\nValor do Vetor %d: %d", i, Valvet[i - 1]);
            ValCond = 1;
        }
    }
    if (ValCond != 1)
    {
        printf("\nNenhum valor acima de 50 nos Vetores");
    }
}