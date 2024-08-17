import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = s.nextDouble();

        if (numero > 0){
            double dobro = numero * 2;
            System.out.printf("O número é positivo, o seu dobro é: %.2f", dobro);
        }else{
            double triplo = numero * 3;
            System.out.printf("O número é negativo, seu triplo é: %.2f", triplo );
        }
    }
}
