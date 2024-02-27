import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int x = leitura.nextInt();

        for (int i = 0; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
