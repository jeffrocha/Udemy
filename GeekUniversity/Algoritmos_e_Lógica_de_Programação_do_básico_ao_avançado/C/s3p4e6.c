/*
se��o 3 - exerc�cio 6

Fa�a um algoritmo que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
Calcule e mostre o total do seu sal�rio no referido m�s.

Entrada
    Salario por hora
    N�mero d horas trabalhada no m�s
processamento
    multiplicar salario*horas
sa�da
    mostrar s�rio mensal

*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    int Varhora;
    float VarSal;
    setlocale(LC_ALL, "Portuguese_Brazil");
    printf("\n\n Esse sistema mostra o sal�rio mensal do funcion�rio\n\n");
    printf("Informe o s�lario/hora do funcion�rio(XXXX,XX): ");
    scanf("%f", &VarSal);
    printf("\nInforme a quantidade de horas trabalhadas: ");
    scanf("%d", &Varhora);
    printf("O sal�rio a receber � R$%.2f\n\n", Varhora * VarSal);
}
