import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a palavra que deve ser invertida");
        String palavra = scanner.nextLine();
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("Palavra invertida: " + invertida);

    }
}