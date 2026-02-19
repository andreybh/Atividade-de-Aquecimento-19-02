import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura (máximo 20): ");
        int altura = sc.nextInt();

        System.out.print("Digite a largura (máximo 20): ");
        int largura = sc.nextInt();

        if (altura <= 0 || altura > 20 || largura <= 0 || largura > 20) {
            System.out.println("Valores inválidos! Digite números entre 1 e 20.");
        } else {

            // 🔹 Retângulo completo
            System.out.println("\nRetângulo completo:");
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= largura; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // 🔹 Diagonal superior direita
            System.out.println("\nDiagonal superior direita:");
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= largura; j++) {
                    if (j == largura - i + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
