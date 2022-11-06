/*
seção 8 - Exercicio 6
Faça um programa que
receba um código numérico inteiro e um vetor de cinco posições de números reais.
se o código for 0, termine o programa.
se o codigo for 1, mostre o vetor na ordem direita.
se o código for 2, mostre o vetor na ordem inversa.
*/

#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <windows.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    float ValVet[5];
    int ValSet;

    while (ValSet != 0)

    {
        printf("\n\n\nCódigo 0 = Sair do sistema");
        printf("\nCódigo 1 = Entrar com vetores e Mostrar vetores em ordem direita");
        printf("\nCódigo 2 = Entrar com vetores e Mostrar vetores em ordem Inversa");
        printf("\nDigite um dos código acima: ");
        scanf("%d", &ValSet);

        switch (ValSet)
        {
        case 0:
            printf("\nSair do sistema!\n\n");
            break;

        case 1:
            for (size_t i = 1; i < 6; i++)
            {
                printf("Digite o valor do %dº Vetor: ", i);
                scanf("%f", &ValVet[i - 1]);
            }
            for (size_t i = 1; i < 6; i++)
            {
                printf("\nO valor do Vetor na posição %d é : %.2f", i, ValVet[i - 1]);
            }
            break;

        case 2:
            for (size_t i = 1; i < 6; i++)
            {
                printf("Digite o valor do %dº Vetor: ", i);
                scanf("%f", &ValVet[i - 1]);
            }
            for (size_t i = 5; i >= 1; i--)
            {
                printf("\nO valor do Vetor na posição %d é : %.2f", i, ValVet[i - 1]);
            }
            break;
        default:
            printf("\ncódigo não reconhecido continuar\n\n");
            break;
        }
    }
}