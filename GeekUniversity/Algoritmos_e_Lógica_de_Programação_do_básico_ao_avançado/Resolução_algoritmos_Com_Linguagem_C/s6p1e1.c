/*
se��o 6 - Exerc�cio 1
1 - Ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, caso contr�rio imprimi-la com o valor zero.
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{

    setlocale(LC_ALL, "Portuguese_Brazil");
    int Varnum;
    printf("\n\nPrograma para mostrar resultado por condi��o\n\n");
    printf("Digite um valor da v�riavel N:");
    scanf("%d", &Varnum);
    if (Varnum > 100)
    {
        printf("\n\n%d\n\n", Varnum);
    }
    else
    {
        printf("\n\n0\n\n");
    }
}