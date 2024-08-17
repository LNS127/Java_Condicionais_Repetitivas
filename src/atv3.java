import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = s.nextInt();
        int par = numero%2;

        if (par == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é impar.");
        }
    }
}
