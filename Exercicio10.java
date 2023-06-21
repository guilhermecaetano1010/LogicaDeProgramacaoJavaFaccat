package faccat;

import java.util.Scanner;

public class Exercicio10{

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite seu salário mensal: ");
	float custo = sc.nextFloat();
	
	float valorDistribuidor = custo*28/100;
	float valorImposto = custo*45/100;
	float resultado = custo + valorDistribuidor + valorImposto;
	
	System.out.println("O seu salário final com reajuste de "+resultado+".");
	
    sc.close();
	}

}
