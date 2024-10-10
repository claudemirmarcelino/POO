package T1_POO;

public class Fatura {
        private String numero;
        private String descricao;
        private int quantidadeComprada;
        private double precoPorItem;
    
        public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
            this.numero = numero;
            this.descricao = descricao;
            this.quantidadeComprada = (quantidadeComprada > 0) ? quantidadeComprada : 0;
            this.precoPorItem = (precoPorItem > 0) ? precoPorItem : 0.0;
        }
    
        public String getNumero() {
            return numero;
        }
    
        public void setNumero(String numero) {
            this.numero = numero;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        public int getQuantidadeComprada() {
            return quantidadeComprada;
        }
    
        public void setQuantidadeComprada(int quantidadeComprada) {
            this.quantidadeComprada = (quantidadeComprada > 0) ? quantidadeComprada : 0;
        }
    
        public double getPrecoPorItem() {
            return precoPorItem;
        }
    
        public void setPrecoPorItem(double precoPorItem) {
            this.precoPorItem = (precoPorItem > 0) ? precoPorItem : 0.0;
        }
    
        public double getTotalFatura() {
            return quantidadeComprada * precoPorItem;
        }
    
        public void exibirFatura() {
            System.out.println("Número: " + numero);
            System.out.println("Descrição: " + descricao);
            System.out.println("Quantidade Comprada: " + quantidadeComprada);
            System.out.println("Preço por Item: " + precoPorItem);
            System.out.println("Total da Fatura: " + getTotalFatura());
    }
}

