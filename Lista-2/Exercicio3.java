import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double[] dobros = new double[5];

       
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            dobros[i] = numeros[i] * 2;
        }

        
        System.out.println("Valores do segundo vetor (dobro dos números):");
        for (double numero : dobros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
