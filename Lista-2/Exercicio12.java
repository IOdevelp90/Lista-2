public class Exercicio12 {
    public static void main(String[] args) {
        int[] vetor = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        int produtoParesPositivos = 1;

        
        for (int num : vetor) {
            if (num > 0 && num % 2 == 0) {
                produtoParesPositivos *= num;
            }
        }

        System.out.println("Produto dos elementos pares positivos: " + produtoParesPositivos);
    }
}
