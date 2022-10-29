/*
Seção 2 - ex 2

Fazer um algoritmo para somar dois números e multiplicar o resultado pelo primeiro número.
*/

#include <stdio.h>
#include <locale.h>
// std = standard (padrão)
// io = input/output (Entrada/Saída)
// locale.h = biblioteca de região

int main() // int é o valor que ira retornar da função main no caso irá retornar um inteiro
{
    // configuração de acentuação padrão brazil >>>alterar na bara inferior direita UTF-8 para ISO 8859-1<<<<<
    setlocale(LC_ALL, "Portuguese_Brazil");
    // Variaveis tipo inteiro
    int num1, num2, soma, multiplicacao;

    // entradas
    printf("Informe o primeiro número: ");
    scanf("%d", &num1);

    printf("Informe o segundo número: ");
    scanf("%d", &num2);

    // processamento
    soma = num1 + num2;
    multiplicacao = soma * num1;

    // saida
    printf("o resultado é %d", multiplicacao);
}
