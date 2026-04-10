public class CartaoDeCredito extends FormaDePagamento{
    public CartaoDeCredito(double valor){
        super(valor);
    }

    @Override

    public void ProcessarPagamento() {
        System.out.println("pagamento via cartão: R$" + getValor() + " eviando a operadora...");
         }
}