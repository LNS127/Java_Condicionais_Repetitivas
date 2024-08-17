import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = s.nextDouble();

        double numPar = num + 5;
        double numImpar = num + 8;

        if (num%2 == 0){
            System.out.printf("O número é par: %.2f", numPar);
        }else{
            System.out.printf("O número é ímpar: %.2f", numImpar);
        }
    }
}
