package Exercicios;

public class aula30e03 {

	public static void main(String[] args) {
		//Diferença do Produto A e B pelo C e D Formula DIFERENÇA (A*B-C*D)
		int A,B,C,D,DIFERENCA;
		
		// Entrada:5,6,7,8 ; Saída:DIFERENÇA = -26
		A=5;
		B=6;
		C=7;
		D=8;
		DIFERENCA=(A*B-C*D);
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);

		// Entrada:5,6,-7,8 ; Saída:DIFERENÇA = 86
		A=5;
		B=6;
		C=-7;
		D=8;
		DIFERENCA=(A*B-C*D);
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);

	}

}
