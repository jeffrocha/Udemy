import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 10.35784;
		String nome="Maria";
		int idade = 31;
		double renda= 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = "+ x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n",x);
		System.out.printf("%s tem %d anos e ganha %f reais%n", nome, idade, renda);


	}

}
