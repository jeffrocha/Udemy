/*
se��o 8 - Exercicio 6
Fa�a um programa que
receba um c�digo num�rico inteiro e um vetor de cinco posi��es de n�meros reais.
se o c�digo for 0, termine o programa.
se o codigo for 1, mostre o vetor na ordem direita.
se o c�digo for 2, mostre o vetor na ordem inversa.
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
        printf("\n\n\nC�digo 0 = Sair do sistema");
        printf("\nC�digo 1 = Entrar com vetores e Mostrar vetores em ordem direita");
        printf("\nC�digo 2 = Entrar com vetores e Mostrar vetores em ordem Inversa");
        printf("\nDigite um dos c�digo acima: ");
        scanf("%d", &ValSet);

        switch (ValSet)
        {
        case 0:
            printf("\nSair do sistema!\n\n");
            break;

        case 1:
            for (size_t i = 1; i < 6; i++)
            {
                printf("Digite o valor do %d� Vetor: ", i);
                scanf("%f", &ValVet[i - 1]);
            }
            for (size_t i = 1; i < 6; i++)
            {
                printf("\nO valor do Vetor na posi��o %d � : %.2f", i, ValVet[i - 1]);
            }
            break;

        case 2:
            for (size_t i = 1; i < 6; i++)
            {
                printf("Digite o valor do %d� Vetor: ", i);
                scanf("%f", &ValVet[i - 1]);
            }
            for (size_t i = 5; i >= 1; i--)
            {
                printf("\nO valor do Vetor na posi��o %d � : %.2f", i, ValVet[i - 1]);
            }
            break;
        default:
            printf("\nc�digo n�o reconhecido continuar\n\n");
            break;
        }
    }
}