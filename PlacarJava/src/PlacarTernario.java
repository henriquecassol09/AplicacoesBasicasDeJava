import java.util.Scanner;

public class PlacarTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o numero do placar (1 a 3)");
        int placar = scanner.nextInt();

        String podio = switch (placar) {
            case 1 -> "medalha de ouro ";
            case 2 -> "medalha de prata ";
            case 3 -> "medalha de bronze";
            default -> "não medalhou";
        };
        System.out.println(podio);
    }


}
