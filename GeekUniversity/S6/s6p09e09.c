/*
seção 6- exercício 9

A secretaria do meio ambiente que controla o indice de poluição mantém 3 grupos de industrias que são altamente poluentes do meio ambiente.
O indice de poluição aceitavel varia de 0,05 até 0,025.
- se o indice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderer suas atividades;
- se o indice crescer para 0,4 as industrias do 1º e 2º grupos são indimadas a suspenderem suas atividades;
- se o indice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
faça um algoritmo que leia o indice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.


*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    float ValInd;
    char ValLow[85];
    char ValMid[91];
    char ValHigh[80];

    strcpy(ValLow, "indice <= 0,3: as indústrias do 1º grupo são intimadas a suspenderer suas atividades.");
    strcpy(ValMid, "indice 0,4 < 0,5: as industrias do 1º e 2º grupos são intimadas a suspenderem suas atividades.");
    strcpy(ValHigh, "indice >=0,5: todos os grupos devem ser notificados a paralisarem suas atividades.");

    printf("\nDigite o indice de poluição: ");
    scanf("%f", &ValInd);

    if (ValInd <= 0.3)
    {
        printf("\n%s\n\n", ValLow);
    }
    if ((ValInd >= 0.4) && (ValInd < 0.5))
    {
        printf("\n%s\n\n", ValMid);
    }
    if (ValInd >= 0.5)
    {
        printf("\n%s\n\n", ValHigh);
    }
}