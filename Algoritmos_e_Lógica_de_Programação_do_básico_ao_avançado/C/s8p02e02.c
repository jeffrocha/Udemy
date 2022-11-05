/*
Seção 8 - Exercicio 2
Eescreva um alogoritmo que leia dois vetores de 10 posições e faça a soma dos elementos de mesmo indice,
colocando o resultado em um terceiro vetor, Mostre o vetor resultante
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValVet1[10];
    int ValVet2[10];
    int ValVet3[10];
    printf("Digite os 10 valores do Vetor1 e Vetor2 \n");

    for (size_t i = 1; i < 11; i++)
    {
        printf("\nDigite o valor do %dº Vetor1: ", i);
        scanf("%d", &ValVet1[i - 1]);
    }

    for (size_t i = 1; i < 11; i++)
    {
        printf("\nDigite o valor do %dº Vetor2: ", i);
        scanf("%d", &ValVet2[i - 1]);
        ValVet3[i - 1] = ValVet1[i - 1] + ValVet2[i - 1];
    }

    for (size_t i = 1; i < 11; i++)
    {
        printf("\nA Soma do valores do %dº Vetor: %d ", i, ValVet3[i - 1]);
    }
}