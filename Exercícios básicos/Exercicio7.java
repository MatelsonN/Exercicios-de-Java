import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C na ordem: ");
        float valorA = pergunta.nextFloat();
        float valorB = pergunta.nextFloat();
        float valorC = pergunta.nextFloat();
        pergunta.close();

        float areatriangulo = (valorA * valorC) / 2;
        double areaCirculo = 3.14159 * (Math.pow(valorC, 2));
        float areaTrapezio = ((valorA + valorB) / 2) * valorC;
        double areaQuadrado = Math.pow(valorB, 2);
        float areaRetangulo = valorA * valorB;

        System.out.printf("TRIANGULO: %.3f\n", areatriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);


    }
}
