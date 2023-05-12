import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = ler.nextInt();

        if (multiploCincoSete(numero)){
            System.out.println(numero+" é múltiplo de 5 e 7.");
        }else if(multiploCinco(numero)){
            System.out.println(numero+" é múltiplo de 5, mas não de 7.");
        }else if(multiploSete(numero)){
            System.out.println(numero+" é múltiplo de 7, mas não de 5.");
        }else{
            System.out.println(numero+" não é múltiplo de 5, nem de 7.");
        }

    }
    public static boolean multiploCincoSete(int numero){

        return numero % 5 == 0 && (numero % 7) == 0;
    }
    public static boolean multiploCinco(int numero){

        return numero % 5 == 0;
    }
    public static boolean multiploSete(int numero){

        return numero % 7 == 0;
    }

}