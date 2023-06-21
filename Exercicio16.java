package faccat;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas maçãs gostaria: ");
        float quantidade = sc.nextFloat();
        float total;

        if (quantidade > 11) {
            total = quantidade * 1;
        } else {
            total = (float) 1.3 * quantidade; //Quando tem número quebrado precisa colocar a conta com float entre parenteses.
        }
        
        System.out.println("O total da sua compra foi de: " + String.format("%.2f", total)); //Dois números depois da vírgula 
        
        sc.close();
    }
}
/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra.*/
