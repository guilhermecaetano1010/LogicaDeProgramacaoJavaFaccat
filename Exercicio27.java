package faccat;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Digite um número: ");
        valor = sc.nextInt();

        if (valor > 0) {
            System.out.println("O valor é positivo!");
        } else if (valor == 0) {
            System.out.println("O valor é neutro!");
        } else {
            System.out.println("O valor é negativo!");
        }
       sc.close();
    }
}
/* Ler um valor e escrever se é positivo, negativo ou zero.
*/