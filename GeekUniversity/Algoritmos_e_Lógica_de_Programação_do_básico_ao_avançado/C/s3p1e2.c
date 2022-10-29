/*
Fa�a um algoritmo para 'calcular o estoque m�dio de uma pe�a sendo que:

estoque_medio = (quantidade_minima + quantidade_maxima) /1

"Calcular o estoque m�dio"
entrada
    receber quantidade_minima
    receber quantidade_maxima
processar
    somar quantidade_minima e quantidade_maxima
    dividir o resultado da soma por 2
sa�da
    Mostrar o resultado da divis�o
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    // Entrada
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Qtd_min, Qtd_max;
    float Vardiv;

    printf("Informe a quantidade M�nima: ");
    scanf("%d", &Qtd_min);
    printf("Informe a quantidade M�xima: ");
    scanf("%d", &Qtd_max);
    // processamento
    Vardiv = (Qtd_min + Qtd_max) / 2;
    // sa�da
    printf("O estoque m�dio �: %.2f", Vardiv); // %.2F o n�merador � quantidade de casa ap�s a virgula
}
