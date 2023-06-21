package faccat;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        float salarioFixo, valorVenda, comissaoTotal, salarioTotal;

        System.out.print("Digite seu salário fixo: ");
        salarioFixo = sc.nextFloat();

        System.out.print("Digite o valor de sua venda: ");
        valorVenda = sc.nextFloat();

        if (valorVenda <= 1500) {
            comissaoTotal = (3 / 100f) * valorVenda; //f colocado ao lado para saber que é flutante e a conta ficar correta
            salarioTotal = salarioFixo + comissaoTotal;
        } else {
            comissaoTotal = (3 / 100f) * 1500 + ((valorVenda - 1500) * 5 / 100f);
            salarioTotal = salarioFixo + comissaoTotal;
        }

        System.out.println("Seu salário total é de: " + salarioTotal + " reais.");
        sc.close();
    }
}
/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu salário total. */
