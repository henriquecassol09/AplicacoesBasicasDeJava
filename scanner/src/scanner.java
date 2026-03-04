import java.util.Scanner;

public class scanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);


        System.out.println("digite seu nome");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println(nome);
        System.out.println(idade);

        scanner.close();
    }

}
