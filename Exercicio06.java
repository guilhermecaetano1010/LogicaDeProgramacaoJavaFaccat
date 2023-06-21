package faccat;
import java.util.Scanner;


public class Exercicio06 {
public static void main(String[]args){
	
Scanner sc= new Scanner(System.in);

System.out.println("Digite o valor da base de um retângulo:");
float base = sc.nextFloat();
System.out.println("Digite o valor da altura de um retângulo:");
float altura = sc.nextFloat();

float area = base*altura;

System.out.println("A área do retângulo é: "+area);

sc.close();
}

}
/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
área do retângulo. */

