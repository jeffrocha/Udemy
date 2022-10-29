/*
Seção 07 - Exercício 05
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações
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
        printf("\nDigite um nome de usuário: ");
        gets(ValUsuario);
        printf("\nDigite uma Senha diferente do nome de usuário: ");
        gets(ValSenha);
        if (!strcmp(ValUsuario, ValSenha))
        {
            printf("\n----------------------ERRO------------------------");
            printf("\n-      Usuário e senha com mesma informação      -");
            printf("\n-      Digite Usuário e senha diferentes         -");
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
