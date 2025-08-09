package DesafioEVEO.DesafioEVEO.Model;


public class FaturasRecentes {
    private String referencia;
    private double valor;
    private boolean pago;
   
    public FaturasRecentes(String referencia, double valor, boolean pago) {
        this.referencia = referencia;
        this.valor = valor;
        this.pago = pago;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
