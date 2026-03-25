import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o numero do placar (1 a 4)");
        int placar = scanner.nextInt();
        switch (placar){
            case 1:
                System.out.println("você esta em primeiro lugar");
                break;
            case 2:
                System.out.println("você esta em segundo lugar");
                break;
            case 3:
                System.out.println("você esta em terceiro lugar");
                break;
            case 4:
                System.out.println("você esta em quarto lugar");
                break;
            default:
                System.out.println("sem pontuação");
                break;
        };

    scanner.close();
    }
}