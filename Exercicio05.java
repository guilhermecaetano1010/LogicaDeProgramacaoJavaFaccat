package faccat;
import java.util.Scanner;


public class Exercicio05 {
public static void main(String[]args){
	
Scanner sc= new Scanner(System.in);

System.out.println("Digite um valor:");
int numero = sc.nextInt();

int antecessor = numero-1;

System.out.println("O antecessor do valor é: "+antecessor);

sc.close();
}

}

/* Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor*/