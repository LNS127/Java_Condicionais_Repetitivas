import java.util.Scanner;
public class atv12 {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            int senha = s.nextInt();

            while (senha != 2002) {
                System.out.println("Senha Invalida");
                senha = s.nextInt();
            }

            System.out.println("Acesso Permitido");
        }
    }


