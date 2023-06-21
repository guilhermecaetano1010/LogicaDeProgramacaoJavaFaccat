package faccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Digite sua primeira nota: ");
    float primeiraNota = sc.nextFloat();
    System.out.println("Digite sua segunda nota: ");
    float segundaNota = sc.nextFloat();
    System.out.println("Digite sua terceira nota: ");
    float terceiraNota = sc.nextFloat();
    
    float notaFinal = ((2*primeiraNota)+(3*segundaNota)+(5*terceiraNota))/10;
   
    System.out.println("Sua média final é de: "+notaFinal);
    sc.close();

	}

}

/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.*/
