package faccat;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura en Fahrenheit: ");
		float temperaturaFahrenheit = sc.nextFloat();
        float temperaturaCelcius = ((5*temperaturaFahrenheit)-32*5)/9;
       System.out.println("A temperatura em Celsius é: "+ temperaturaCelcius);
		sc.close();
	}

}

/*
 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
 * escrever o valor correspondente em graus Celsius
 */