/*
Faça um algoritmo para 'calcular o estoque médio de uma peça sendo que:

estoque_medio = (quantidade_minima + quantidade_maxima) /1

"Calcular o estoque médio"
entrada
    receber quantidade_minima
    receber quantidade_maxima
processar
    somar quantidade_minima e quantidade_maxima
    dividir o resultado da soma por 2
saí­da
    Mostrar o resultado da divisão
*/
#include <stdio.h>
#include <locale.h>

int main(void)
{
    // Entrada
    setlocale(LC_ALL, "Portuguese_Brazil");
    int Qtd_min, Qtd_max;
    float Vardiv;

    printf("Informe a quantidade Mínima: ");
    scanf("%d", &Qtd_min);
    printf("Informe a quantidade Máxima: ");
    scanf("%d", &Qtd_max);
    // processamento
    Vardiv = (Qtd_min + Qtd_max) / 2;
    // saí­da
    printf("O estoque médio é: %.2f", Vardiv); // %.2F o númerador é quantidade de casa após a virgula
}
