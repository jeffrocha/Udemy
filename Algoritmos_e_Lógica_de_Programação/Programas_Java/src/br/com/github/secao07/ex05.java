/******************************************************************************
Faça um programa que leia um nome de usuario e a sua senha e nao aceie a
senha igual ao nome do usuario, mostre uma mensagem de erro e volte 
a pedir as informações
*******************************************************************************/

//package br.com.github.secao07;

import java.util.Scanner;

public class ex05 

{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String varNome, varSenha;
        
        System.out.println("Informe o nome: ");
        varNome=teclado.next();
        
        System.out.println("Informe a senha: ");
        varSenha=teclado.next();
        
        while(varNome.equals(varSenha)){
            System.out.println("Nome e Usuario com senhas iguais, altere uma delas.");
            System.out.println("Informe o nome: ");
            varNome=teclado.next();
        
            System.out.println("Informe a senha: ");
            varSenha=teclado.next();
        }
        teclado.close();
        
    }
}
