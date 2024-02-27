import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        int valorIn = 0;
        int valorOut = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int x = leitura.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Digite o valor para saber se estará no intervalo [10-20]: ");
            int valor = leitura.nextInt();

            if (valor >= 10 && valor <= 20) {
                valorIn += 1;
            } else {
                valorOut += 1;
            }
        }
        System.out.println(valorIn + " in");
        System.out.println(valorOut + " out");
    }
}