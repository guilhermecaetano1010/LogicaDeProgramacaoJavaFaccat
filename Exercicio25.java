package faccat;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numeroConta, saldo, debito, credito, saldoAtual;

        System.out.print("Digite o número da sua conta: ");
        numeroConta = sc.nextFloat();

        System.out.print("Digite o saldo da sua conta: ");
        saldo = sc.nextFloat();

        System.out.print("Digite seu valor de débito: ");
        debito = sc.nextFloat();

        System.out.print("Digite seu valor de crédito: ");
        credito = sc.nextFloat();

        saldoAtual = saldo - debito + credito;

        if (saldoAtual < 0) {
            System.out.println("Seu saldo é negativo com valor de: " + saldoAtual + " reais.");
        } else {
            System.out.println("Seu saldo é positivo com valor de: " + saldoAtual + " reais.");
        }
        System.out.println("Na conta: " + numeroConta + ".");
        
        sc.close();
    }
}
/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */
