/*
Seção 8 - Exercício 3
Faça um programa que carregue um vetor com dez números inteiros. Mostre o vetor na ordem inversa a que foi digitado.
*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValVet[10];

    printf("\nDigite 10 vetores e em seguida o sistema ira exibir na ordem inversa\n");
    for (size_t i = 1; i < 11; i++)
    {
        printf("Digite o %dº Vetor: ", i);
        scanf("%d", &ValVet[i - 1]);
    }

    for (size_t i = 10; i > 0; i--)
    {
        printf("\n %dº Vetor: %d ", i, ValVet[i - 1]);
    }
}