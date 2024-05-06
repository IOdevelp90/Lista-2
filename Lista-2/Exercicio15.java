import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        
        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();
        for (int i = 1; i < vetor.length; i++) {
            System.out.print("Digite o próximo número (maior que " + vetor[i - 1] + "): ");
            int num = scanner.nextInt();
            if (num > vetor[i - 1]) {
                vetor[i] = num;
            } else {
                System.out.println("Número inválido. Deve ser maior que o anterior. Digite novamente.");
                i--;
            }
        }

        
        System.out.print("Vetor preenchido de acordo com a regra: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
