/*
Se��o 3 - exerc�cio 7

Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte formula: (72.7 * altura ) - 58

*/
#include <stdio.h>
#include <locale.h>

int main(void)

{
    float Varpeso, Varalt;

    setlocale(LC_ALL, "Portuguese,Brazil");
    printf("\n\nEsse programa calcula o peso idela a partir da altura\n\n");
    printf("Digite a altura que desaja c�lcula(x,xx): ");
    scanf("%f", &Varalt);
    Varpeso = ((72.7 * Varalt) - 58);
    printf("\nO peso ideal para a altura �: %.2f Kg", Varpeso);
}
