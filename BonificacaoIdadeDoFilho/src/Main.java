import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual idade tem seu filho?");
        int idade = scanner.nextInt();
        if (9 >= idade) {
            System.out.println("seu filho é crinça sua bonificação é 500 reais");
        } else if (12 >= idade && idade > 9) {
            System.out.println("seu filho é pre-adolecente sua bonificação é 400 reais");
        }else if (17 >= idade && idade > 12){
            System.out.println("seu filho é adolecente sua bonificação é de 300 reais");
        }else
            System.out.println("a analise relatou que os dados estão erados ou seu filho é de maior, por isso não havera bonificação");

    }



}