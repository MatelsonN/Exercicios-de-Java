import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int fim = 0;
        Scanner leitura = new Scanner(System.in);

        while (fim != 4) {
            System.out.println("Digite 1 para álcool, 2 para gasolina, 3 para diesel e 4 para sair: ");
            int valor = leitura.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("Abastecimento de álcool feito com sucesso");
                    alcool += 1;
                    break;
                case 2:
                    System.out.println("Abastecimento de gasolina feito com sucesso");
                    gasolina += 1;
                    break;
                case 3:
                    System.out.println("Abastecimento de diesel feito com sucesso");
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO!");
                    fim = 4;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        System.out.println("Alcool = " + alcool);
        System.out.println("Gasolina = " + gasolina);
        System.out.println("Diesel = " + diesel);
        }
}
