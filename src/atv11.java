import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de X:");
        int x = s.nextInt();
        System.out.println("Digite o valor de Y:");
        int y = s.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");


            }else if (x < 0 && y > 0){
                System.out.println("Segundo Quadrante");


            }else if(x < 0 && y < 0 ){
                System.out.println("Terceiro quadrante");


            }else{
                System.out.println("Quarto quadrante");
            }

            x = s.nextInt();
            y= s.nextInt();
    }
}

}