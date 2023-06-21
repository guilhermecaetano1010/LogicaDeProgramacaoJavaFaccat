package faccat;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor1, valor2, valor3, maior1, maior2, soma;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextFloat();

        System.out.print("Digite o segundo valor diferente do primeiro: ");
        valor2 = sc.nextFloat();

        System.out.print("Digite o terceiro valor diferente dos dois últimos: ");
        valor3 = sc.nextFloat();

        if (valor1 < valor2 && valor1 < valor3) {
            maior1 = valor2;
            maior2 = valor3;
        } else if (valor2 < valor3) {
            maior1 = valor1;
            maior2 = valor3;
        } else {
            maior1 = valor1;
            maior2 = valor2;
        }

        soma = maior1 + maior2;
        System.out.println("A soma dos dois maiores é: " + soma + ".");
        sc.close();
    }
}
/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 
maiores. */
