/*
Se��o 6 - exerc�cio 2

elabore um algoritmo que leia um n�mero. se positivo armazene-o em 'a', se for negativo, em 'b'. no final mostrar o resultado.

*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Varnum, VarA, VarB;
    printf("\n\n Esse programa mostrar se o n�mero positivo ou negativo\n\n");
    printf("Digite um valor: ");
    scanf("%d", &Varnum);
    if (Varnum > 0)
    {
        VarA = Varnum;
        printf("O n�mero %d � positivo", VarA);
    }
    else
    {

        if (Varnum < 0)
        {
            VarB = Varnum;
            printf("O n�mero %d � negativo", VarB);
        }

        else
        {
            if (Varnum == 0)
            {
                printf("o n�mero zero n�o � negativo nem positivo");
            }

            else
            {
                printf("Digite um n�mero");
            }
        }
    }
}