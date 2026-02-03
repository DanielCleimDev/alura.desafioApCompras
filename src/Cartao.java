public class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public boolean compra(double valor) {
        if(this.limite >= valor) {
            this.limite -= valor;
            return true;
        }
        return false;
    }
}
