import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        
        System.out.print("Digite o valor de n: ");
        double n = scanner.nextDouble();

        
        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < n) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
