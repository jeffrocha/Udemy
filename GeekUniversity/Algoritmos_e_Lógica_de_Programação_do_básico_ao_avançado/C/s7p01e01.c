/*
Seção 07 - exercício 01

Faça um algoritmo que determine o maior entre N números.
A condição de para é a entrada de um valor 0(zero), ou seja, o algoritmo deve ficar calculando o maior até que a entrada seja igual a
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
        printf("Digite um número: ");
        scanf("%d", &Index);
        if (Index >= ValMaior)
        {
            ValMaior = Index;
        }
    } while (Index != 0);
    printf("O maior número é %d", ValMaior);
}