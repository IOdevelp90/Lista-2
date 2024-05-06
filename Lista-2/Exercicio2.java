import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("Número " + numeros[i] + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("Número " + numeros[i] + " é negativo.");
            } else {
                System.out.println("Número " + numeros[i] + " é zero.");
            }
        }

        scanner.close();
    }
}
