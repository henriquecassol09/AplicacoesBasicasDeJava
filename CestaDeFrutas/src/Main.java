import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual a primeira fruta");
        String f1 = scanner.nextLine();
        System.out.println("qual a segunda fruta");
        String f2 = scanner.nextLine();
        System.out.println("qual a terceira fruta");
        String f3 = scanner.nextLine();
        System.out.println("qual a quarta fruta");
        String f4 = scanner.nextLine();
        System.out.println("qual a quinta fruta");
        String f5 = scanner.nextLine();
        String[] frutas = {f1, f2, f3, f4, f5};
        int aleatorio = random.nextInt(frutas.length);
        String frutasorteada = frutas[aleatorio];
        System.out.println("ao puxar uma fruta da cesta a que você tirou um(a) " + frutasorteada);



    }
}
