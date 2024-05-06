import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        int maior = vetor[0];
        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }

        
        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;

        
        System.out.print("Vetor atualizado (maior elemento na última posição): ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
