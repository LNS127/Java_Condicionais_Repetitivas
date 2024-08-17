import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o horário de início da partida: ");
        int inicio = s.nextInt();
        System.out.println("Digite o horário de encerramento da partida: ");
        int encerramento = s.nextInt();

        int dia = 24;
        if(inicio == encerramento){
            System.out.println("A partida durou:" + dia + " horas.");
        }else if(inicio > encerramento){
            int duracao = (dia-inicio) + encerramento;
            System.out.println("A partida durou: " + duracao +" horas.");
        }else {
            int duracao = encerramento - inicio;
            System.out.println("A partida durou: " + duracao + " horas.");
        }
    }
}
