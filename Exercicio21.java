package faccat;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, duracao;

        System.out.print("Digite o horário de início da partida: ");
        inicio = sc.nextInt();

        System.out.print("Digite o horário de término da partida: ");
        fim = sc.nextInt();

        if (fim < inicio) {
            duracao = (24 - inicio) + fim;
        } else if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = 24;
        }

        System.out.println("A duração da partida foi de: " + duracao + " hora(s).");
        sc.close();
    }
}
/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */