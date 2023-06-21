package faccat;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 6) {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2);
            System.out.println("Você foi aprovado, sua média foi: " + media);
        } else {
            System.out.println("Suas notas foram: " + nota1 + " e " + nota2);
            System.out.println("Sua média não foi suficiente, você foi reprovado, sua média foi de: " + media);
        }
       sc.close();
    }
}
/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
aluno é aprovado). Escrever também a média calculada.*/
