package faccat;
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float litrosVend;
        String tipoCombustivel;
        float aPagar = 0;

        System.out.print("Informe quantos litros você comprou: ");
        litrosVend = sc.nextFloat();

        System.out.print("Informe G para gasolina ou A para álcool: ");
        tipoCombustivel = sc.next();

        // Cálculo do valor a pagar
        if (tipoCombustivel.equalsIgnoreCase("G")) {    
            if (litrosVend <= 20) {
                aPagar = (litrosVend * 3.30f) - 0.03f;
            } else {
                aPagar = (litrosVend * 3.30f) - 0.05f;
            }
        } else if (tipoCombustivel.equalsIgnoreCase("A")) {
            if (litrosVend <= 20) {
                aPagar = (litrosVend * 2.90f) - 0.04f;
            } else {
                aPagar = (litrosVend * 2.90f) - 0.06f;
            }
        }
      
        System.out.println("O total a pagar é: R$" + String.format("%.2f", aPagar));
        sc.close();
    }
}
/*Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da 
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/