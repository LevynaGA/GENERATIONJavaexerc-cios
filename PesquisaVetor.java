package JavaArrays;

import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que você deseja encontrar:");
        int numero = input.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}
