/*
Seção 07 - Exercicio 03

Elabore um programa que gera e escreve os números ímpares dos números entre 100 e 200.
*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    for (size_t ValIndex = 100; ValIndex <= 200; ValIndex++)
    {
        if (ValIndex % 2 != 0 && ValIndex != 0)
        {
            printf("Impar: %d\n", ValIndex);
        }
    }
}