import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        int senha = 0;
        Scanner leitura = new Scanner(System.in);

        while (senha != 2002) {

            System.out.println("Digite a senha de 4 números: ");
            senha = leitura.nextInt();

            if (senha != 2002) {
                System.out.println("Senha inválida.");
            }
        }
        System.out.println("Acesso permitido.");
        leitura.close();


    }
}
