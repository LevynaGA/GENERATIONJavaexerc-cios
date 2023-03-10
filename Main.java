package JavaMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDP = 0, somaDS = 0;

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (i == j) { // Verificando se é elemento da diagonal principal
                    somaDP += matriz[i][j];
                }
                if (i + j == 2) { // Verificando se é elemento da diagonal secundária
                    somaDS += matriz[i][j];
                }
            }
        }

       
        System.out.print("\nElementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        
        System.out.print("\nElementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }

       
        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDP);

       
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDS);

        sc.close();
    }
}

