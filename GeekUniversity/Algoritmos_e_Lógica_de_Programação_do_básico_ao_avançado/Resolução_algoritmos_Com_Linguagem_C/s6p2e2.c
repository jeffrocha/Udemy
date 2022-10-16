/*
Seção 6 - exercício 2

elabore um algoritmo que leia um número. se positivo armazene-o em 'a', se for negativo, em 'b'. no final mostrar o resultado.

*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Varnum, VarA, VarB;
    printf("\n\n Esse programa mostrar se o número positivo ou negativo\n\n");
    printf("Digite um valor: ");
    scanf("%d", &Varnum);
    if (Varnum > 0)
    {
        VarA = Varnum;
        printf("O número %d é positivo", VarA);
    }
    else
    {

        if (Varnum < 0)
        {
            VarB = Varnum;
            printf("O número %d é negativo", VarB);
        }

        else
        {
            if (Varnum == 0)
            {
                printf("o número zero não é negativo nem positivo");
            }

            else
            {
                printf("Digite um número");
            }
        }
    }
}