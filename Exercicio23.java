package faccat;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo, nome;
        double pesoIdeal, altura;  //double para não dar erro na conta com casas depois da virgula

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu sexo (M ou F): ");
        sexo = sc.nextLine();

        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {   //equalsIgnoreCase compara as Strings.
            pesoIdeal = 72.7 * altura - 58;
        } else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.println(nome+" seu peso ideal é: " + pesoIdeal);
        
        sc.close();
    }
}
/* Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule 
e mostre seu peso ideal*/
