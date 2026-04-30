import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        int tentativa = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do seu usuario?");
        String usuario = scanner.nextLine();
        System.out.println("Qual sua senha?");
        String senha = scanner.nextLine();
        System.out.println("---------------------------------------------");
        while (tentativa < 3){
            System.out.println("digite o seu usuario para login");
            String tentativaUsuario = scanner.nextLine();
            System.out.println("digite o sua senha para login");
            String tentativaSenha = scanner.nextLine();
            if(usuario.equals(tentativaUsuario) && senha.equals(tentativaSenha)){
                System.out.println("Login aceito");
                break;
            }else{
                tentativa = tentativa + 1;
                System.out.println("Senha ou usuario incorreto tente novamente");
                System.out.println("---------------------------------------------");
                if (tentativa == 3){
                    System.out.println("Conta bloqueada");
                }
            }
        }
    }
}