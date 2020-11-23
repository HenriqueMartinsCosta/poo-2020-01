public class NotaFiscal {

    ItemNotaFiscal[] itens = new ItemNotaFiscal[3];

    public float getTotal() {

        float total = 0;

        for (ItemNotaFiscal item : itens) {
            
            total += item.getTotal();

        }

        return total;

    }

}