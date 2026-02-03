public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Descrição: " + this.descricao + " Valor: " + this.valor;
    }
}
