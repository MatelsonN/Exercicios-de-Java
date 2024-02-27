import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        String valor = "Não nulo";
        Scanner leitura = new Scanner(System.in);

        while (valor != null) {

            System.out.println("Digite o valor de X e Y. Caso não digite nada o programa será encerrado: ");
            double valorX = leitura.nextDouble();
            double valorY = leitura.nextDouble();

            if (valorX > 0 && valorY > 0){
                System.out.println("Primeiro");
            } else if (valorX > 0 && valorY < 0) {
                System.out.println("Quarto");
            } else if (valorX < 0 && valorY > 0) {
                System.out.println("Segundo");
            } else if (valorX < 0 && valorY < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Valor nulo, o sistema será encerrado!");
                valor = null;
            }

        }

    }
}
