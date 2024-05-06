import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;

      
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println("Valores menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
