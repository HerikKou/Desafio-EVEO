package DesafioEVEO.DesafioEVEO.DTO;

import java.util.List;

import DesafioEVEO.DesafioEVEO.Model.Assinatura;
import DesafioEVEO.DesafioEVEO.Model.Contrato;
import DesafioEVEO.DesafioEVEO.Model.Fatura;

public class ClienteDto {//DTO- transferência de dados entre camadas
        private String id;
    private String nome;
    private List<Contrato> contratos;
private List<Assinatura> assinaturas;
    private List<Fatura> faturas;
   
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public List<Fatura> getFaturas() {
        return faturas;
    }
    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }
   
  
 
    
}
