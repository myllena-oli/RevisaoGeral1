import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        String num = ler.nextLine();
        for(int i=num.length()-1; i>=0;i--){
            System.out.print(num.charAt(i));
        }
    }
}