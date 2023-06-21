package faccat;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, valor3;

		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();

		System.out.print("Digite o terceiro valor: ");
		valor3 = sc.nextInt();

		int soma1 = valor2 + valor3;
		int soma2 = valor1 + valor3;
		int soma3 = valor1 + valor2;

		if (valor1 >= valor2 && valor1 >= valor3 && soma1 > valor1) {
			System.out.println("Os valores formam um triângulo.");
		} else if (valor2 >= valor1 && valor2 >= valor3 && soma2 > valor2) {
			System.out.println("Os valores formam um triângulo.");
		} else if (valor3 >= valor1 && valor3 >= valor2 && soma3 > valor3) {
			System.out.println("Os valores formam um triângulo.");
		} else {
			System.out.println("Os valores não conseguem formar um triângulo.");
		}
		sc.close();
	}
}
/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam 
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma 
dos outros 2 lados. */
