/*
seção 3 - exercício 6

Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.

Entrada
    Salario por hora
    Número d horas trabalhada no mês
processamento
    multiplicar salario*horas
saída
    mostrar sário mensal

*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    int Varhora;
    float VarSal;
    setlocale(LC_ALL, "Portuguese_Brazil");
    printf("\n\n Esse sistema mostra o salário mensal do funcionário\n\n");
    printf("Informe o sálario/hora do funcionário(XXXX,XX): ");
    scanf("%f", &VarSal);
    printf("\nInforme a quantidade de horas trabalhadas: ");
    scanf("%d", &Varhora);
    printf("O salário a receber é R$%.2f\n\n", Varhora * VarSal);
}
