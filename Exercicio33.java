package faccat;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();

        // Verificação do maior número ou igualdade
        if (numero1 > numero2) {
            System.out.println("O primeiro número é o maior: " + numero1 + ".");
        } else if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O segundo número é o maior: " + numero2 + ".");
        }
        sc.close();
    }
}
/*Ler dois valores e imprimir uma das três mensagens a seguir: 
‘Números iguais’, caso os números sejam iguais 
‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
‘Segundo maior’, caso o segundo seja maior que o primeiro. */