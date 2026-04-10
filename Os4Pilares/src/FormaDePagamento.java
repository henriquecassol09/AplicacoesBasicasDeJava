public abstract class FormaDePagamento {

    private double valor;

            public FormaDePagamento(double valor){
                this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public abstract void ProcessarPagamento();
}
