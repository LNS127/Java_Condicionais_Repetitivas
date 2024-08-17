import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Valor de X: ");
        int x = s.nextInt();
        System.out.println("Digite o Valor de Y: ");
        int y = s.nextInt();
        System.out.println("Digite o Valor de Z: ");
        int z = s.nextInt();

        if ( x>y && y>z){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ", x,y,z);
        }else if (y>z && x<z){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ",y,z,x);
        }else if (z>x && x>y){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ", z,x,y);
        }else if (x>z && z>y){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ", x,z,y);
        }else if (y>z && x>z){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ", y,x,z);
        }else if (z>x && y>x){
            System.out.printf("A ordem dos números da maneira decrescente é: %d, %d, %d ", z,y,x);
        }
    }
}
