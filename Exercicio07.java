package faccat;
import java.util.Scanner;


public class Exercicio07 {
public static void main(String[]args){
	
Scanner sc= new Scanner(System.in);

System.out.println("Digite sua idade em anos: ");
int idadeAnos = sc.nextInt();
System.out.println("Digite sua idade em meses até seu último mesversário: ");
int idadeMeses = sc.nextInt();
System.out.println("Digite os dias restantes do seu mesversário até o dia de hoje: ");
int idadeDias = sc.nextInt();

int diasVividos = idadeAnos*365 + idadeMeses*30 + idadeDias;

System.out.println("Total de dias vividos: "+diasVividos);

sc.close();
}

}
/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */