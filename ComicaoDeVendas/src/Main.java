import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual seu salario atual");
        double salario = scanner.nextDouble();
        System.out.println("qual o valor de vendas realizado?");
        double vendas = scanner.nextDouble();

        if (vendas >= 5000){
            salario = salario + 1000;
            System.out.println("seu salario apos a comição é de: "+salario);
        } else if (vendas >= 3000 && vendas < 5000) {
            salario = salario + 500;
            System.out.println("seu salario apos a comição é de: "+salario);
        } else if (vendas >= 1000 && vendas < 3000) {
            salario = salario + 250;
            System.out.println("seu salario apos a comição é de: "+salario);
        } else {
            System.out.println("você não recebe comição então o valor do seu salario permanece: "+salario);
        }
    }
}