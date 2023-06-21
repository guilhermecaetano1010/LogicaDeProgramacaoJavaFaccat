package faccat;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1, time2;
        int gols1, gols2;

        System.out.print("Digite o nome do primeiro time: ");
        time1 = sc.nextLine();

        System.out.print("Digite o nome do segundo time: ");
        time2 = sc.nextLine();

        System.out.print("Digite a quantidade de gols marcados pelo primeiro time: ");
        gols1 = sc.nextInt();

        System.out.print("Digite a quantidade de gols marcados pelo segundo time: ");
        gols2 = sc.nextInt();

        // Verificação do vencedor ou empate
        if (gols1 > gols2) {
            System.out.println("O vencedor foi o time: " + time1 + ".");
        } else if (gols1 == gols2) {
            System.out.println("A partida deu empate.");
        } else {
            System.out.println("O vencedor foi o time: " + time2 + ".");
        }
        sc.close();
    }
}
/* Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome 
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. */
