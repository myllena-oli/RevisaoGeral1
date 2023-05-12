import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String sexo;
        int mulheres=0, homens=0, j=1;
        double alturaHomens = 0, menorAltura=0, maiorAltura=0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a altura da " + i + "ª pessoa: ");
            double altura = ler.nextDouble();

            while (j==1) {
                menorAltura = altura;
                maiorAltura = altura;
                j++;
            }
            if (altura>maiorAltura){
                maiorAltura=altura;
            }
            if (altura<menorAltura){
                menorAltura=altura;
            }
            ler.nextLine();

            while (true) {
                System.out.println("Se essa pessoa for do sexo feminino digite 'f', se for masculino digite 'm': ");
                sexo = ler.nextLine();
                if (sexo.equals("f")|| sexo.equals("m")) {
                    break;
                } else {
                    System.out.println("Dado incorreto. Se essa pessoa for do sexo feminino digite 'f', se for masculino digite 'm': ");
                }
            }
            if (sexo.equals("f")){
                mulheres++;
            }else {
                homens++;
                alturaHomens = alturaHomens + altura;
            }

        }
        System.out.println("A maior altura é "+maiorAltura+". E a menor altura é "+menorAltura+".");
        System.out.println("A média de altura dos homens é "+(alturaHomens/homens)+".");
        System.out.println("Há "+mulheres+" mulheres no grupo.");

    }
}