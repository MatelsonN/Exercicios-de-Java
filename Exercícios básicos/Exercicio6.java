import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite o código da primeira peça: ");
        int primeiraPeca = pergunta.nextInt();
        System.out.println("Digite o número da primeira peça: ");
        int primeiroNumeroPeca = pergunta.nextInt();
        System.out.println("Digite o valor unitário da primeira peça escolhida: ");
        float primeiroValorUnitario = pergunta.nextFloat();
        System.out.println("Digite o código da segunda peça: ");
        int segundaPeca = pergunta.nextInt();
        System.out.println("Digite o número da segunda peça: ");
        int segundoNumeroPeca = pergunta.nextInt();
        System.out.println("Digite o valor unitário da segunda peça escolhida: ");
        float segundoValorUnitario = pergunta.nextFloat();
        pergunta.close();

        float valorAPagar = (primeiroNumeroPeca * primeiroValorUnitario) + (segundoNumeroPeca * segundoValorUnitario);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);
    }
}
