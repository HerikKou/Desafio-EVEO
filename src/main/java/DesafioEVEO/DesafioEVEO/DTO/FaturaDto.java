package DesafioEVEO.DesafioEVEO.DTO;

import java.util.List;

import DesafioEVEO.DesafioEVEO.Model.Clientes;

public class FaturaDto {//MODEL- é usado para armazenar dados que precisam ser exibidos na Exibição 
       private String referencia;
    private double valor;
    private boolean pago;
        private List<Clientes> clientes;
        public FaturaDto(String referencia, double valor, boolean pago, List<Clientes> clientes) {
            this.referencia = referencia;
            this.valor = valor;
            this.pago = pago;
            this.clientes = clientes;
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
        public List<Clientes> getClientes() {
            return clientes;
        }
        public void setClientes(List<Clientes> clientes) {
            this.clientes = clientes;
        }
   
}
