/*
Seção 8 - Exercício 1

Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armazene em um vetor apenas os números pares maiores
que 0. No final deve mostrar os elementos do vetor na tela.

*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValVet[5];
    int count = 5;

    printf("Digite um valor Par inteiro \n");
    for (size_t i = 1; i < (count + 1);)
    {
        printf("\n Digite o %d Valor: ", i);
        scanf("%d", &ValVet[i - 1]);
        if ((ValVet[i - 1] % 2 == 0) && (ValVet[i - 1] > 0))
        {
            i++;
        }
        else
            printf("\n Digite um valor inteiro Par");
        {
        }
    }
    for (size_t i = 1; i < count + 1; i++)
    {
        printf("\nVetor da Variavel ValVet[%d]º é:%d", i - 1, ValVet[i - 1]);
    }
}