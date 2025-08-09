package DesafioEVEO.DesafioEVEO.DTO;

import java.util.List;

import DesafioEVEO.DesafioEVEO.Model.Assinatura;
import DesafioEVEO.DesafioEVEO.Model.Contrato;
import DesafioEVEO.DesafioEVEO.Model.FaturasRecentes;



public class ClienteDto {//- transferência de dados entre camadas
        private String clienteId;
    private String nome;
    private List<Contrato> contratos;
  private List<Assinatura> assinaturas;
    private List<FaturasRecentes> faturas;
    public String getId() {
        return clienteId;
    }
    public void setId(String clienteId) {
        this.clienteId = clienteId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Contrato> getContratos() {
        return contratos;
    }
    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
    public List<Assinatura> getAssinaturas() {
        return assinaturas;
    }
    public void setAssinaturas(List<Assinatura> assinaturas) {
        this.assinaturas = assinaturas;
    }
    public List<FaturasRecentes> getFaturas() {
        return faturas;
    }
    public void setFaturas(List<FaturasRecentes> faturas) {
        this.faturas = faturas;
    }
   

   
  
 
    
}
