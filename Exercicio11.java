package faccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Digite seu salário fixo: ");
	float salarioFixo = sc.nextFloat();
	System.out.println("Digite o total de carros vendidos: ");
	float carrosVendidos = sc.nextFloat();
	System.out.println("Digite sua comissão fixa: ");
	float comissaoFixa = sc.nextFloat();
	System.out.println("Digite o valor total de suas vendas: ");
	float valorVendas = sc.nextFloat();

	
	float comissaoFixaPorCarro = carrosVendidos * comissaoFixa;
	float porcentagemVendas = valorVendas * 5/100;
	float salarioFinal =  salarioFixo + comissaoFixaPorCarro + porcentagemVendas;
	
	System.out.println("O seu salário final é: "+salarioFinal+".");
	
    sc.close();
	}

}

/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas 
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
vendedor. */
