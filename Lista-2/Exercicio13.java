import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci desejada: ");
        int n = scanner.nextInt();

        
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        
        System.out.print("Os " + n + " primeiros termos da sequência de Fibonacci são: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
