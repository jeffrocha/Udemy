/*
seção 6 - Exercicio 10
Elabore um algoritmo que dada a idade de um nadador classigique-o
em uma das seguitnes categorias;
infantil -a = 5 a 7 anos
infantil -b = 8 a 11 anos
juvenil -a = 12 a 13 anos
juvenil -b = 14 a 17 anos
adulto = Igual ou maior que 18 anos
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
int FunCat()
{
    fflush(stdin);
    int Valcatf;
    printf("\nDigite a idade do aluno\n");
    scanf("%d", &Valcatf);
    if (Valcatf >= 5 && Valcatf <= 7)
    {
        Valcatf = 0;
        return (Valcatf);
    }
    if (Valcatf >= 8 && Valcatf <= 11)
    {
        Valcatf = 1;
        return (Valcatf);
    }
    if (Valcatf >= 12 && Valcatf <= 13)
    {
        Valcatf = 2;
        return (Valcatf);
    }
    else if (Valcatf >= 14 && Valcatf <= 17)
    {
        Valcatf = 3;
        return (Valcatf);
    }
    if (Valcatf >= 18 && Valcatf < 100)
    {
        Valcatf = 4;
        return (Valcatf);
    }
    if (Valcatf < 5 || Valcatf > 100)
    {
        printf("\nDigite uma idade valida\n");
    }
    fflush(stdin);
    return (9);
}

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Valcat[5];
    int Validade;
    int Valloop;
    int Valcatf;
    Valcat[0] = 0;
    Valcat[1] = 0;
    Valcat[2] = 0;
    Valcat[3] = 0;
    Valcat[4] = 0;

    printf("\nEsse sistema mostra a quantidade de nadadores separado pela idade\n");
    do
    {
        printf("\n Deseja Realizar um cadastro?");
        printf("\n Digite 1:Para Sim ou  2:Para Não");
        printf("\n Opção: ");
        scanf("%d", &Valloop);
        if (Valloop == 1)
        {
            Valcatf = FunCat();
            if (Valcatf == 9)
            {
                fflush(stdin);
            }
            else
            {
                Valcat[Valcatf] = (Valcat[Valcatf] + 1);
                fflush(stdin);
            }
        }
        else
        {
            printf("\n Infantil -a = 5 a 7 anos............|| %d Alunos", Valcat[0]);
            printf("\n infantil -b = 8 a 11 anos...........|| %d Alunos", Valcat[1]);
            printf("\n juvenil -a = 12 a 13 anos...........|| %d Alunos", Valcat[2]);
            printf("\n juvenil -b = 14 a 17 anos...........|| %d Alunos", Valcat[3]);
            printf("\n adulto = Igual ou maior que 18 anos.|| %d Alunos", Valcat[4]);
        }
    } while (Valloop == 1);
}