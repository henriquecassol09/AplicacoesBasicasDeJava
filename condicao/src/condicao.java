import java.util.Scanner;

public class condicao {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual sua media");
        float media = scanner.nextFloat();
        if (media >= 60){
        System.out.println("aprovado");
        } else
        System.out.println("reprovado");

    }
}
