package faccat;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual, anoNascimento, calculoIdade;

		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();

		System.out.print("Digite o ano do seu nascimento: ");
		anoNascimento = sc.nextInt();

		calculoIdade = anoAtual - anoNascimento;

		if (calculoIdade < 16) {
			System.out.println("Você não está apto para votar.");
		} else {
			System.out.println("Você está apto para votar.");
		}
		sc.close();
	}
}
/*
 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
 * mês em que a pessoa nasceu).
 */