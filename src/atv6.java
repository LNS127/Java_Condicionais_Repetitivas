import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor booleano: ");
        boolean valor = s.nextBoolean();
        System.out.println("Digite outro valor booleano: ");
        boolean valor2 = s.nextBoolean();

        boolean valor3 = true;
        boolean valor4 = false;
        if (valor == valor3 && valor2 == valor3 ){
            System.out.println("Os valores são verdadeiros");
        } else if (valor == valor4 || valor2 == valor4) {
            System.out.println("Os valores são falsos");
        }
    }
}
