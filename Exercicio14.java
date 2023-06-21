package faccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		if (numero > 10) {
			System.out.println("O número " + numero + " é maior que 10!");
		} else {
			System.out.println("O número " + numero + " é menor que 10!");
		}
     sc.close();
	}
	
}
/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso 
contrário escrever NÃO É MAIOR QUE 10!*/