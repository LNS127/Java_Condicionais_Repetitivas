import java.util.Objects;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = s.nextLine();
        System.out.println("Digite seu estado civil: ");
        String estadoCivil = s.nextLine();

        String respostaSexo = "Feminino";
        String respostaEstadoCivil = "Casada";

        if (Objects.equals(sexo, respostaSexo) && Objects.equals(estadoCivil, respostaEstadoCivil)) {
            System.out.println("Digite a quantos anos você está casada");
            int tempoCasada = s.nextInt();
            System.out.println("A pesquisa terminou. Muito obrigado por responder, " + nome + ", parabéns pelos seus " + tempoCasada + " anos de casada.");
        }else {
            System.out.println("A pesquisa terminou. Muito obrigado por responder, " + nome + ".");
        }
    }
}