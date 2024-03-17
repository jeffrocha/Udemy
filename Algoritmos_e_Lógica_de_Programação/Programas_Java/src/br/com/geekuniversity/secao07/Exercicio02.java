package br.com.geekuniversity.secao07;

public class Exercicio02 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.println("Múltiplo de 10");
			}
		}
	}
}
