import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10};

        
        int[] vetorC = new int[vetorA.length + vetorB.length];

       
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }

        
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(vetorC));
    }
}
