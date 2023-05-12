import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Map<String, Double> funcionarios = new HashMap<>();
        List<String> nomes = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        double media = 0;

        System.out.println("Quantos funcionários tem na sua empresa? ");
        int quantidade = ler.nextInt();

        for (int i = 0; i < quantidade; i++) {
            ler.nextLine();
            System.out.println("Digite o nome do " + (i + 1) + "º funcionário: ");
            nomes.add(ler.nextLine());
            System.out.println("Digite o salário desse funcionário: ");
            salario.add(ler.nextDouble());
            funcionarios.put(nomes.get(i), salario.get(i));
        }
        for (int i = 0; i < salario.size(); i++) {
            media = salario.get(i) + media;
        }

        System.out.println("Os funcionários e seus salários são: ");

        System.out.println(funcionarios);
        System.out.printf("A média de salário é: R$%.2f" , (media / salario.size()));

    }
}