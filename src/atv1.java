import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = s.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = s.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = s.nextDouble();

        double D = A+B;

        if(D>C){
            System.out.println("A soma é menor que C.");
        }else {
            System.out.println("A soma é maior que C.");
        }
    }
}
