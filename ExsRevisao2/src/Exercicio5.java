public class Exercicio5 {
    public static void main(String[] args) {

        for(int numero=100;numero<=150;numero++){

            int centena = 1;
            int dezena = (numero - 100)/10;
            int unidade = (numero - 100)%10;
            if ((centena+dezena+unidade)%2==0){
                System.out.println(numero);
            }
        }
    }
}