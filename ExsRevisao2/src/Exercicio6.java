import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] numeros = new int[4][5];
        int soma=0;

        System.out.println("Digite os 20 números para soma: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = ler.nextInt();
                soma = soma + numeros[i][j];

            }
        }
        System.out.println("A soma é "+soma+".");
    }
}