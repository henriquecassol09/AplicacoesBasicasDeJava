package teste;

import dominio.Funcionario;

public class imprimirDados {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("henrique");
        funcionario1.setIdade(15);
        funcionario1.setSalario(new double[]{1200, 2200, 1500});

        funcionario1.imprime();
        funcionario1.mediaSalarial();

        System.out.println("sua Média salarial é " + funcionario1.getMedia());
    }
}