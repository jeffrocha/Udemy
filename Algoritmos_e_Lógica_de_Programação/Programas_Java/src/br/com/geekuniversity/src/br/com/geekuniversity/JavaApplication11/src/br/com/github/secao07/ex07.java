/*
Sua organização acaba de contratar um estagiário para trabalhar no suporte de informática,
com a intenção de fazer um levantamento nas sucatas encontradas nesta área.
A primeira tarefa dele é testar todos os cercas de 200 mouses que se encontram lá, testando e 
anotando o estado de cada um deles, para verificar o que se pode aproveitar deles.
Foi requisitado que você desenvolva um programa para registrar este levantamento.
O programa deverá receber um número indeterminado de entradas, cada um contendo:
um numero de identificação do mouse e o tipo de defeito:
- necessita de esfera;
- necessidda de limpeza;
- necessita troca do cabo ou conector;
- quebrado ou inutilizado.

uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatorio:

Quantidade de mouses: 100

situação                                    quantidade      porcentual
1- necessita de esfera                          40              40%
2- necessita de limpeza                         30              30%
3- necessita de troca do cabo ou conector       15              15%
4- quebrado ou inutilizado                      15              15%
*/

package br.com.github.secao07;

import java.util.Scanner;
import static javax.management.Query.and;

public class ex07 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        // Variáveis
        int var_Contador_total = 0, var_Contador_sit_1 = 0, var_Contador_sit_2 = 0,
            var_Contador_sit_3 = 0, var_Contador_sit_4 = 0, var_Identificacao,
            var_Defeito;
        Scanner teclado = new Scanner(System.in);
        
        // Entrada inicial
        System.out.println("Informe a identificação (1 para entrar, 0 para sair)");
        var_Identificacao = teclado.nextInt();
        
        while (var_Identificacao != 0) {
            System.out.println("1- necessita de esfera");
            System.out.println("2- necessita de limpeza");
            System.out.println("3- necessita de troca do cabo ou conector");
            System.out.println("4- quebrado ou inutilizado");
            System.out.println("Informe o defeito:");
            var_Defeito = teclado.nextInt();
        
            if (var_Defeito == 0){
                break;
            }
            
            switch (var_Defeito) {
                case 1 -> var_Contador_sit_1++;
                case 2 -> var_Contador_sit_2++;
                case 3 -> var_Contador_sit_3++;
                case 4 -> var_Contador_sit_4++;
                default -> System.out.println("Código de defeito inválido.");
            }

            var_Contador_total++;

        }
        
        // Calcular percentuais
        float p1,p2,p3,p4;
        p1=((float)var_Contador_sit_1 /(float)var_Contador_total )*(float)100;
        p2=((float)var_Contador_sit_2 /(float)var_Contador_total )*(float)100;
        p3=((float)var_Contador_sit_3 /(float)var_Contador_total )*(float)100;
        p4=((float)var_Contador_sit_4 /(float)var_Contador_total )*(float)100;

        // Exibir relatório
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-40s %-15s %-10s\n", "Situação", "Quantidade", "Percentual");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-40s %-15d %.2f%%\n", "1 - necessita de esfera", var_Contador_sit_1, p1);
        System.out.printf("%-40s %-15d %.2f%%\n", "2 - necessita de limpeza", var_Contador_sit_2, p2);
        System.out.printf("%-40s %-15d %.2f%%\n", "3 - necessita troca do cabo ou conector", var_Contador_sit_3, p3);
        System.out.printf("%-40s %-15d %.2f%%\n", "4 - quebrado ou inutilizado", var_Contador_sit_4, p4);
        System.out.printf("-----------------------------------------------------------");
        System.out.println("\nQuantidade de mouses: " + var_Contador_total);

        teclado.close();
    }
}
