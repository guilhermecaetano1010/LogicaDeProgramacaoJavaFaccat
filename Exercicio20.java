package faccat;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1, numero2;

        System.out.print("Digite um número: ");
        numero1 = sc.nextFloat();

        System.out.print("Digite outro número: ");
        numero2 = sc.nextFloat();

        if (numero1 > numero2) {
            System.out.println("Os números em ordem crescente ficam: " + numero2 + ", " + numero1 + ".");
        } else {
            System.out.println("Os números em ordem crescente ficam: " + numero1 + ", " + numero2 + ".");
        }
        sc.close();
    }
}
/* Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente*/