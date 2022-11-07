import java.util.Scanner; //biblioteca do Scanner
import java.io.IOException;

public class s2p02e02 {
    public static void main(String[] args) {
        // variaveis
        int num1, num2, soma, multiplicacao;
        // scaner
        Scanner teclado = new Scanner(System.in);
        // entradas
        ClearConsole();// chama a fun��os
        System.out.print("informe o primeiro n�mero: ");// escreve e pula uma linha (ln)
        // System.out.print("inform...");// Escreve e n�o pula linha
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo n�mero: ");
        num2 = teclado.nextInt();

        // processo
        soma = num1 + num2;
        multiplicacao = soma * num1;

        // sa�da
        System.out.println("O resultado da multiplica��o � " + multiplicacao);
        teclado.close();
    }

    public static void ClearConsole() {// Limpar console
        try {
            String operatingSystem = System.getProperty("os.name"); // Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
