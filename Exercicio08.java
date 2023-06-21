package faccat;
import java.util.Scanner;


public class Exercicio08 {
public static void main(String[]args){
	
Scanner sc= new Scanner(System.in);

System.out.println("Digite o total de eleitores de um município: ");
int totalVotos = sc.nextInt();
System.out.println("Digite a quantidade de votos brancos: ");
int votosBrancos = sc.nextInt();
System.out.println("Digite a quantidade de votos nulos: ");
int votosNulos = sc.nextInt();
System.out.println("Digite a quantidade de votos válidos:");
int votosValidos = sc.nextInt();


double percentualBrancos = 100*votosBrancos/totalVotos; //Colocar o 100 na frente, bug no site.
double percentualNulos = 100*votosNulos/totalVotos;
double percentualValidos = 100*votosValidos/totalVotos;

System.out.println( "De um total de: "+totalVotos+" Percentual de votos brancos: "+ percentualBrancos +"%"+ " Percentual de votos nulos: "+ percentualNulos+"%"+ " Percentual de votos válidos: "+ percentualValidos+"%");

sc.close();
}

}
/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos 
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total 
de eleitores. */