/*
seção 6 - Exercicio 7

Desenvolva um algoritmo que:
1) Leia 4 quatro números;
2) Calcule o Quadrado de cada um;
3) Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
4) Caso contrário, imprima os valores lidos e seus respectivos quadrados.

Entradas
    N1,N2,N3,N4
processamento
    N1,N2,N3,N4 ** 2
saída
    se n3>=1000
        escreva n3
    senão
        escreva N1~N4

*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <math.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Valnum[4];
    float Valnumq[4];
    int Valcont;

    printf("\n\nEsse é um sistema para tirar raiz quadrada de 4 números e exibir a partir de condição");
    for (Valcont = 0; Valcont < 4; Valcont++)
    {
        printf("\nDigite o %dº Número: ", (Valcont + 1));
        scanf("%d", &Valnum[Valcont]);
        Valnumq[Valcont] = sqrt(Valnum[Valcont]);
    }

    if (Valnum[2] >= 1000)
    {
        printf("\n A Raiz do tercero número(%.2f) é >=1000\n\n ", Valnumq[2]);
    }
    else
    {
        printf("\n%.2f\n", Valnumq[0]);
        printf("\n%.2f\n", Valnumq[1]);
        printf("\n%.2f\n", Valnumq[2]);
        printf("\n%.2f\n\n", Valnumq[3]);
    }
}
