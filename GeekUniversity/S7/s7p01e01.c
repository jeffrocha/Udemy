/*
Se��o 07 - exerc�cio 01

Fa�a um algoritmo que determine o maior entre N n�meros.
A condi��o de para � a entrada de um valor 0(zero), ou seja, o algoritmo deve ficar calculando o maior at� que a entrada seja igual a
0 zero.

*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValMaior, Index;
    Index = 0;
    ValMaior = 0;
    do
    {
        printf("Digite um n�mero: ");
        scanf("%d", &Index);
        if (Index >= ValMaior)
        {
            ValMaior = Index;
        }
    } while (Index != 0);
    printf("O maior n�mero � %d", ValMaior);
}