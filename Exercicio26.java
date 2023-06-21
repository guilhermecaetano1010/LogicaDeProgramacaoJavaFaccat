package faccat;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float quantidadeAtual, quantidadeMax, quantidadeMin, quantidadeMedia;

        System.out.print("Digite a quantidade atual em estoque: ");
        quantidadeAtual = sc.nextFloat();

        System.out.print("Digite a quantidade máxima de estoque: ");
        quantidadeMax = sc.nextFloat();

        System.out.print("Digite a quantidade mínima de estoque: ");
        quantidadeMin = sc.nextFloat();

        quantidadeMedia = (quantidadeMax + quantidadeMin) / 2;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("A quantidade média é: " + quantidadeMedia);
            System.out.println("Não efetuar a compra.");
        } else {
            System.out.println("A quantidade média é: " + quantidadeMedia);
            System.out.println("Efetuar a compra.");
        }
        sc.close();
    }
}
/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e 
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade 
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual 
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar 
compra'. */