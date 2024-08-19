import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int  diesel = 0;

        while (x!=4){
            if (x == 1){
                gasolina += 1;
            }else if (x == 2){
                alcool += 1;
            }else if (x == 3){
                diesel += 1;
            }

            x = s.nextInt();

        }
        System.out.printf("MUITO OBRIGADO%n Alcool: %d%n Gasolina: %d%n Diesel: %d%n ", alcool, gasolina, diesel);
    }
}
