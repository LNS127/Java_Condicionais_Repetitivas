import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valro de A: ");
        int A = s.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = s.nextInt();

        int C1 = A+B;
        int C2 = A*B;

        if (A == B){
            System.out.println("Os números são iguais, o valor da soma entre eles é: " + C1);
        }else {
            System.out.println("Os números são diferentes, o valor da mutliplicação entre eles é: " + C2);
        }
    }
}
