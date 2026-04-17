public class bombaCombustivel {
    private  String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel

    public bombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel){
        this.tipoCombustivel  = tipoCombustivel;
        this.valorLitro  = valorLitro;
        this.quantidadeCombustivel  = quantidadeCombustivel
    }

    public void abastecerPorValor (double valor){
        double litrosParaAbastecer = valor / valorLitro;

        if (litrosParaAbastecer <= quantidadeCombustivel){
            quantidadeCombustivel -= litrosParaAbastecer;
            System.out.println("abastecido" + litrosParaAbastecer);
        }else {
            System.out.println("erro: não a combustivel sufuciente na bomba");
        }
    }
    public void abastecerPorLitro (double litro){
        if(litro <= quantidadeCombustivel){
            double valorParaPagar = litro *valorLitro;
            quantidadeCombustivel -= litro;
            System.out.println("valor a pagar é" + valorParaPagar);
        } else {
            System.out.println("erro: não a combustivel suficiente na bomba");
        }

    }
}
