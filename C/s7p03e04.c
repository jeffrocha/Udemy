/*
Seção 07 - Exercício - 04
Construa um algoritmo que leia 10 valores inteiros e positivos e;
A) Encontre o maior valor
B) Encontre o menor Valor
C) Calcule a media dos números lidos

*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValMaior, ValMenor, ValSoma, ValNum;
    ValMaior = ValMenor = ValSoma = ValNum = 0;

    for (size_t ValIndex = 1; ValIndex <= 10; ValIndex++)
    {
        printf("\nDigite o %dº valor inteiro: ", ValIndex);
        scanf("%d", &ValNum);
        if (ValIndex == 1)
        {
            ValMaior = ValMenor = ValSoma = ValNum;
        }
        else
        {
            if (ValNum >= ValMaior)
            {
                ValMaior = ValNum;
                ValSoma = ValSoma + ValNum;
            }
            else
            {
                if (ValNum <= ValMenor)
                {
                    ValMenor = ValNum;
                    ValSoma = ValSoma + ValNum;
                }
                else
                {
                    ValSoma = ValSoma + ValNum;
                }
            }
        }
    }
    ValSoma = (ValSoma / 10);
    printf("Maior número %d\n", ValMaior);
    printf("Menor número %d\n", ValMenor);
    printf("Média número %d\n", ValSoma);
}