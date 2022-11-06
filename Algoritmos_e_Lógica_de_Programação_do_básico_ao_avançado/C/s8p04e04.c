/*
seção 9 - exercicio 04
escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida, mostre a soma de todos os elementos.
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Valvet[20];
    int ValSoma = 0;

    printf("\nDigite 20 elementos inteiros\n");

    for (size_t i = 1; i < 21;)
    {
        printf("Digite o %dº Vetor inteiro: ", i);
        scanf("%d", &Valvet[i - 1]);
        if (Valvet[i - 1] > 0)
        {
            ValSoma = ValSoma + Valvet[i - 1];
            i += 1;
        }
    }
    printf("\nA soma de todos os vetores é: %d", ValSoma);
}