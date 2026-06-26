import java.util.Scanner;
import java.util.Random;

public class Main{
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("sera sorteado numeros de 1-4 você deve tentar acertar");
        System.out.println("qual numero você acha que é?");
        int numero = scanner.nextInt();

        int[] numeros = {1, 2, 3, 4};

        int sorteador = gerador.nextInt(numeros.length);
        int sorteado = numeros[sorteador];

        if (sorteado == numero){
            System.out.println("parabens você acertou!!!!");
        }else {
            System.out.println("não foi dessa vez! obrigado por jogar (:");
        }




    }
}