public class Pix extends FormaDePagamento {
    public Pix(double valor) {
        super(valor);
    }
        @Override

        public void ProcessarPagamento () {
            System.out.println("pagamento via Pix: " + getValor() + " Aguardando recebimento");

        }
    }

