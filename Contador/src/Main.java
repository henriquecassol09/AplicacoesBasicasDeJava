// este codigo [e um exercio por isso a repeti;áo na contagem

public class Main{
    static void main() {
       int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador = contador + 1;
        }

        contador = 0;
        System.out.println("agora vem o contador dentro de um do-while");

        do{
            System.out.println("dentro do do-while " + ++contador);
        } while (contador <= 10); {
            System.out.println(contador);
        }

        System.out.println("agora vem o contador dentro de um for");

        for(int i = 0; i <= 10; ++i){
            System.out.println("for " + i);
        }
    }
}