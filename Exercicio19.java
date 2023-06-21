package faccat;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero1, numero2;

		System.out.print("Digite o primeiro número: ");
		numero1 = sc.nextFloat();

		System.out.print("Digite o segundo número: ");
		numero2 = sc.nextFloat();

		if (numero1 > numero2) {
			System.out.println("O maior número entre os digitados é o: " + numero1);
		} else {
			System.out.println("O maior número entre os digitados é o: " + numero2);
		}
		sc.close();
	}
}
/*  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles
 */