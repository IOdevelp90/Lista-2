import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = new int[vetorA.length];

        
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        System.out.println("Vetor B (cópia invertida de A): " + Arrays.toString(vetorB));
    }
}
