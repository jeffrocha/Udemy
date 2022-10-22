/*
se��o 6- exerc�cio 9

A secretaria do meio ambiente que controla o indice de polui��o mant�m 3 grupos de industrias que s�o altamente poluentes do meio ambiente.
O indice de polui��o aceitavel varia de 0,05 at� 0,025.
- se o indice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderer suas atividades;
- se o indice crescer para 0,4 as industrias do 1� e 2� grupos s�o indimadas a suspenderem suas atividades;
- se o indice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
fa�a um algoritmo que leia o indice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.


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

    strcpy(ValLow, "indice <= 0,3: as ind�strias do 1� grupo s�o intimadas a suspenderer suas atividades.");
    strcpy(ValMid, "indice 0,4 < 0,5: as industrias do 1� e 2� grupos s�o intimadas a suspenderem suas atividades.");
    strcpy(ValHigh, "indice >=0,5: todos os grupos devem ser notificados a paralisarem suas atividades.");

    printf("\nDigite o indice de polui��o: ");
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