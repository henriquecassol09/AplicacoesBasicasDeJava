public class Main {
    static void main(String[] args) {
        FormaDePagamento pgto1 = new CartaoDeCredito(350.00);
        FormaDePagamento pgto2 = new Pix(80.00);

        pgto1.ProcessarPagamento();
        pgto2.ProcessarPagamento();

    }
}