package faccat;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor1, valor2, valor3;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextFloat();

        System.out.print("Digite o terceiro valor: ");
        valor3 = sc.nextFloat();

        if (valor1 < valor2 && valor1 < valor3) {
            if (valor2 < valor3) {
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            if (valor1 < valor3) {
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {
            if (valor1 < valor2) {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
            sc.close();
        }
    }
}
/*Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem 
crescente. */
