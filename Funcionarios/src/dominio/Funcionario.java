package dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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
        if(salario != null){
            this.media = 0; // Limpa o valor anterior para não acumular errado
            for (double salarios : salario){
                media += salarios;
            }
            media /= salario.length;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}