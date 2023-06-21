package faccat;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite seu salário mensal: ");
	double salario = sc.nextDouble();
	System.out.println("Digite o percentual de reajuste salarial: ");
	double reajuste = sc.nextDouble();
	
	double acrescimo = salario*reajuste/100;
	double salarioFinal = salario+acrescimo;
	
	System.out.println("O seu salário final com reajuste de "+reajuste+"%"+" é: R$"+salarioFinal+".");
	
    sc.close();
	}

}
/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e escrever o valor do novo salário*/