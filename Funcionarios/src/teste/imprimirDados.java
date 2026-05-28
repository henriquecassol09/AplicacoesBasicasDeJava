package teste;

import dominio.Funcionario;


public class imprimirDados {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "henrique";
        funcionario1.idade = 15;
        funcionario1.salario = new double[]{1200, 2200, 1500};


        funcionario1.imprime();
        funcionario1.mediaSalarial();

    }
}
