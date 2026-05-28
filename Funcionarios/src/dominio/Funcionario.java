package dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null){
        for (double salarios: this.salario) {
            System.out.println(salarios + " ");
        }
    }
}

    public void mediaSalarial(){
        double media = 0;
        if(salario != null){
        for (double salarios : salario){
            media += salarios;
        }
        media /= salario.length;
        System.out.println("sua media salarial é de "+media);
        }
    }

}

