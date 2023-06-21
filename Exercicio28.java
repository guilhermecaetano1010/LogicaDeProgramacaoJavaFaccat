package faccat;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor1, valor2, valor3, teste1 = 0, teste2 = 0;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextFloat();

        System.out.print("Digite o segundo valor diferente do primeiro: ");
        valor2 = sc.nextFloat();

        System.out.print("Digite o terceiro valor diferente dos dois últimos: ");
        valor3 = sc.nextFloat();

        if (valor1 > valor2) {
            teste1 = valor1 - valor3;
        } else {
            teste2 = valor2 - valor3;
        }

        if (teste1 > 0) {
            System.out.println("O maior valor é o primeiro!");
        } else if (teste2 > 0) {
            System.out.println("O maior valor é o segundo!");
        } else {
            System.out.println("O maior valor é o terceiro!");
        }
        sc.close();
    }
}
/* Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */