/*
Se��o 07 - Exerc�cio 06

Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1  = 5
5 x 2  = 10
...
5 x 10 = 50

*/

#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValNum, ValMult, ValRep, ValCalc;
    ValNum = ValMult = ValRep = ValCalc = 0;
    printf("\nDigite o n�mero da tabuada deseja exibir: ");
    scanf("%d", &ValNum);
    printf("\nDigite o n�mero que deseja que a tabuada v�: ");
    scanf("%d", &ValMult);
    do
    {
        ValCalc = ValNum * ValRep;
        printf("%d x %d = %d\n", ValNum, ValRep, ValCalc);
        ValRep = ValRep + 1;
    } while (ValRep < (ValMult + 1));
}