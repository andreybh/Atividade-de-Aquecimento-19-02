import java.util.Scanner;

public class Desafio01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura (máximo 20): ");
        int altura = sc.nextInt();

        if (altura <= 0 || altura > 20) {
            System.out.println("Altura Inválida! Digite um Número entre 1 e 20.");
        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}