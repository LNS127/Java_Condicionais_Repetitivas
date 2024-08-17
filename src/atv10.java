import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o código do seu lanche: ");
        int codigo = s.nextInt();
        System.out.println("Digite a quantidade de lanche que você deseja:");
        int quantidade = s.nextInt();

        if (codigo == 1) {
            double total = 4.0 * quantidade;
            System.out.printf("O valor total é: R$ %.1f%n", total);


        } else if (codigo == 2) {
            double total = 4.5 * quantidade;
            System.out.printf("O valor total é: R$ %.1f%n", total);


        } else if (codigo == 3) {
            double total = 5.0 * quantidade;
            System.out.printf("O valor total é: R$ %.1f%n", total);


        }else if (codigo == 4){
            double total = 2.0 * quantidade;
            System.out.printf("O valor total é: R$ %.1f%n", total);


        }else if (codigo == 5){
            double total = 1.5 * quantidade;
            System.out.printf("O valor total é: R$ %.1f%n", total);
        }
    }
}