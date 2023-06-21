package faccat;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioHora, salarioTotal, horasTrabalhadas, horasExtras, salarioHoraExtra1, salarioHoraExtra2, salarioHoraExtraTotal;

        System.out.print("Digite o valor ganho por hora de trabalho: ");
        salarioHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas em um mês: ");
        horasTrabalhadas = sc.nextFloat();

        if (horasTrabalhadas <= 160) {
            salarioTotal = salarioHora * horasTrabalhadas;
            System.out.println("O salário total do funcionário no mês é de: " + salarioTotal);
        } else {
            horasExtras = horasTrabalhadas - 160;
            salarioHoraExtra1 = horasExtras * salarioHora;
            salarioHoraExtra2 = (float) (salarioHoraExtra1 * 0.5);
            salarioHoraExtraTotal = salarioHoraExtra1 + salarioHoraExtra2;
            salarioTotal = salarioHora * 160 + salarioHoraExtraTotal;
            System.out.println("O salário final do funcionário é de: " + salarioTotal);
        }
        sc.close();
    }
}

/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais 
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva 
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */