/*
Se��o 07 - Exerc�cio 07

Sua organiza��o acaba de contratar um estagi�rio para trabalhar no suporte de inform�tica,
 com a inten��o de fazer um levantamento nas sucatas encontradas nesta �rea.
A primeira tarefa dele � testar todos os cerca de 200 mouses que se encontram l�,
testando e anotando o estado de cada um deles, para verificar o que se pode aproveitar deles.
Foi requisitado que voc� desenvolva um programa para registrar este levantamento.
O programa dever� receber um n�mero indeterminado de entradas, cada uma contendo:
um n�mero de identifica��o do mouse o tipo de defeito:
-Necessita de esfera;
-Necessita de limpeza;
-Necessita de troca do cabo ou conector;
-Quebrado ou inutilizado;

Uma identifica��o igual a zero encerra o programa. Ao final
o programa deve emitir o seguinte relat�rio:

Quantidade de mouses: 100

Situa��o                                   Qtd      Porcentual
1-Necessita de esfera                       40          40%
2-Necessita de limpeza                      30          30%
3-Necessita de troca do cabo ou conector    15          15%
4-Quebrado ou inutilizado                   15          15%

*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    int ValFalha[4];
    float ValPorc[4];
    int ValRep;
    int ValEsc;
    int ValQtd;
    int ValTotal;
    ValFalha[0] = ValFalha[1] = ValFalha[2] = ValFalha[3] = 0;
    ValPorc[0] = ValPorc[1] = ValPorc[2] = ValPorc[3] = 0;
    ValRep = ValEsc = ValQtd = ValTotal = 0;

    printf("Sistema para Cadastrar falhas dos mouses");
    do
    {
        printf("\n1-Necessita de esfera");
        printf("\n2-Necessita de limpeza");
        printf("\n3-Necessita de troca do cabo ou conector");
        printf("\n4-Quebrado ou inutilizado");
        printf("\n0-Sair do sistema");
        printf("\nLista de falhas, Digite um dos c�digos acima para cadstro: ");
        scanf("%d", &ValEsc);

        switch (ValEsc)
        {
        case 1:
            printf("\nDigite a quantidade de mouses para essa falha: ");
            scanf("%d", &ValQtd);
            ValFalha[0] = ValFalha[0] + ValQtd;
            break;
        case 2:
            printf("\nDigite a quantidade de mouses para essa falha: ");
            scanf("%d", &ValQtd);
            ValFalha[1] = ValFalha[1] + ValQtd;
            break;
        case 3:
            printf("\nDigite a quantidade de mouses para essa falha: ");
            scanf("%d", &ValQtd);
            ValFalha[2] = ValFalha[2] + ValQtd;
            break;
        case 4:
            printf("\nDigite a quantidade de mouses para essa falha: ");
            scanf("%d", &ValQtd);
            ValFalha[3] = ValFalha[3] + ValQtd;
            break;
        case 0:
            ValRep = 1;
            break;
        default:
            printf("\nERRO:C�digo incorreto, digite novamente\n");
            break;
        }

    } while (ValRep != 1);
    ValTotal = ValFalha[0] + ValFalha[1] + ValFalha[2] + ValFalha[3];
    printf("Total de Mouses defeituosos cadastrado:%d", ValTotal);
    printf("\nSitua��o                                   Qtd/Porcentual");
    printf("\n1-Necessita de esfera                       %d", ValFalha[0]);
    printf("(%.2f %%)", (ValPorc[0] = ((ValFalha[0] * 100) / ValTotal)));
    printf("\n2-Necessita de limpeza                      %d", ValFalha[1]);
    printf("(%.2f %%)", (ValPorc[1] = ((ValFalha[1] * 100) / ValTotal)));
    printf("\n3-Necessita de troca do cabo ou conector    %d", ValFalha[2]);
    printf("(%.2f %%)", (ValPorc[2] = ((ValFalha[2] * 100) / ValTotal)));
    printf("\n4-Quebrado ou inutilizado                   %d", ValFalha[3]);
    printf("(%.2f %%)\n", (ValPorc[3] = ((ValFalha[3] * 100) / ValTotal)));
}