import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o número do funcionário registrado na firma: ");
        int numero = pergunta.nextInt();
        System.out.println("Quantas horas trabalhadas o funcionário teve: ");
        float horas = pergunta.nextFloat();
        System.out.println("Qual o valor das horas trabalhadas do funcionário: ");
        float valor = pergunta.nextFloat();
        pergunta.close();

        float valorTrabalhado = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f",valorTrabalhado);
    }
}
