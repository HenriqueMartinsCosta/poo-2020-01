public class ItemNotaFiscal {
    
    int quantidade;
    Produto produto = new Produto();

    public float getTotal() {

        float precoComImposto = produto.preco * (1 + produto.alicota);
        return quantidade * precoComImposto;

    }

}
