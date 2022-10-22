/*
Seção 07 - Exercício 06

Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

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

    int ValNum, ValMult, ValCalc;
    ValNum = ValMult = 0;

    printf("\nDigite o número da tabuada deseja exibir: ");
    scanf("%d", &ValNum);

    printf("\nDigite o número que deseja que a tabuada vá: ");
    scanf("%d", &ValMult);

    for (size_t ValRep = 1; ValRep <= 10; ValRep++)
    {
        printf("%d x %d = %d\n", ValNum, ValRep, (ValNum * ValRep));
    }
}