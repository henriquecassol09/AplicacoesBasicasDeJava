import java.util.Scanner;


public class Main {
    static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos litros de combustível foi gasto? ");
        double combustivel = scanner.nextDouble();
        System.out.println("Qual a distância percorida (em Km)? ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite 1 para gasolina ou 2 para alcool");
        int tipoCombustivel = scanner.nextInt();
        double total;
        double custoMedio = distancia/combustivel;
        switch (tipoCombustivel){
            case 1:
                total = distancia * 5.80;
                System.out.println("o valor do combustivel da viagem foi "+total);
                if(custoMedio > 12){
                    System.out.println("O caro é economico");
                }else
                    System.out.println("o carro não é economico");
                break;
            case 2:
                total = distancia * 3.90;
                System.out.println("o valor do combustivel da viagem foi "+total);
                break;
            default:
                System.out.println("combustivel invalido");
        }

    }
}