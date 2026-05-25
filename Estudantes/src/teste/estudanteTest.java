package teste;

import dominio.Estudante;
import dominio.impresoraEstudante;

public class estudanteTest {
    public  static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        impresoraEstudante impressora = new impresoraEstudante();

        estudante1.nome = "Henrique";
        estudante1.idade = 16;
        estudante1.sexo = "masculino";

        estudante2.nome = "Dhenyfer";
        estudante2.idade = 15;
        estudante2.sexo = "feminino";

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);
    }
}
