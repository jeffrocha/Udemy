/*
Se��o 07 - Exerc�cio 05
Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio,
mostrando uma mensagem de erro e voltando a pedir as informa��es
*/
#include <stdio.h>
#include <string.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "Portuguese_Brazil");
    char ValUsuario[100], ValSenha[100];
    int ValRep;

    do
    {
        memset(&ValUsuario, 0, sizeof(ValUsuario));
        memset(&ValSenha, 0, sizeof(ValSenha));
        printf("\nDigite um nome de usu�rio: ");
        gets(ValUsuario);
        printf("\nDigite uma Senha diferente do nome de usu�rio: ");
        gets(ValSenha);
        if (!strcmp(ValUsuario, ValSenha))
        {
            printf("\n----------------------ERRO------------------------");
            printf("\n-      Usu�rio e senha com mesma informa��o      -");
            printf("\n-      Digite Usu�rio e senha diferentes         -");
            printf("\n--------------------------------------------------\n\n");
            ValRep = 1;
        }
        else
        {
            printf("\n\n\n Usuario: %s Senha: %s Registrado na base\n\n", ValUsuario, ValSenha);
            ValRep = 0;
        }
    } while (ValRep == 1);
    printf("\n-->Sistema finalizado, Obrigado!<--\n\n\n");
}
