import java.util.Scanner; //biblioteca do Scanner

public class s2p02e02 {
    public static void main(String[] args) {
        // variaveis
        int num1, num2, soma, multiplicacao;
        // scaner
        Scanner teclado = new Scanner(System.in);
        // entradas
        System.out.println("informe o primeiro n�mero: ");// escreve e pula uma linha (ln)
        // System.out.print("inform...");// Escreve e n�o pula linha
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo n�mero: ");
        num2 = teclado.nextInt();

        // processo
        soma = num1 + num2;
        multiplicacao = soma * num1;

        // sa�da
        System.out.println("O resultado da multiplica��o � " + multiplicacao);
        teclado.close();
    }
}
