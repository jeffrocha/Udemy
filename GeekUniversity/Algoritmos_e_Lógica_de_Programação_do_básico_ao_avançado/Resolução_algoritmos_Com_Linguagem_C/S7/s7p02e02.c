/*
Seção 07 -- Exercício 02

Faça um algoritmo que conte de 1 a 100 e a cada multiplo de 10 Emita uma mensagem "multiplo de 10".


para i=1, enquanto 1 <=100, processar
    escrever i
    se (i % 10 == 0) então
    escrever "multiplo de 10: " + i

*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    for (size_t ValIndex = 0; ValIndex <= 100; ValIndex++)
    {
        if (ValIndex % 10 == 0 && ValIndex != 0)
        {
            printf("Multiplo de 10: %d \n", ValIndex);
        }
        else
        {
            printf("%d\n", ValIndex);
        }
    }
}