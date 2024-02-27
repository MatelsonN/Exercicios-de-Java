import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite a hora inicial e a hora final de um jogo: ");
        int horaInicial = pergunta.nextInt();
        int horaFinal = pergunta.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        pergunta.close();
    }
}
