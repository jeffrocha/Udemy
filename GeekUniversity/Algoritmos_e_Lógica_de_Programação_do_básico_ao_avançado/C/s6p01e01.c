/*
seção 6 - Exercício 1
1 - Ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{

    setlocale(LC_ALL, "Portuguese_Brazil");
    int Varnum;
    printf("\n\nPrograma para mostrar resultado por condição\n\n");
    printf("Digite um valor da váriavel N:");
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