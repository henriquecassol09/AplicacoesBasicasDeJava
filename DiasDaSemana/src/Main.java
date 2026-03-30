import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite 1 para domingo 2 para segunda 3 para terça 4 para quarta 5 para quinta 6 para sexta e 7 para sabado");;
        int dia = scanner.nextInt();
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }
        if(dia > 1 && dia < 7 ){
            System.out.println("é dia util");
        } else if (dia == 1 || dia == 7 )
            System.out.println("não é dia util");


        scanner.close();
    }
}