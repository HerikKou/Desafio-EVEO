package DesafioEVEO.DesafioEVEO.DTO;

import java.util.List;

import DesafioEVEO.DesafioEVEO.Model.Assinatura;
import DesafioEVEO.DesafioEVEO.Model.Clientes;

public class ContratoDto {
      private String id;
    private String descricao;
    private String inicioVigencia;
    private String fimvigencia;
    private List<Clientes> clientes;
    private List<Assinatura> assinaturas;
    public ContratoDto(String id, String descricao, String inicioVigencia, String fimvigencia, List<Clientes> clientes,
            List<Assinatura> assinaturas) {
        this.id = id;
        this.descricao = descricao;
        this.inicioVigencia = inicioVigencia;
        this.fimvigencia = fimvigencia;
        this.clientes = clientes;
        this.assinaturas = assinaturas;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getInicioVigencia() {
        return inicioVigencia;
    }
    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }
    public String getFimvigencia() {
        return fimvigencia;
    }
    public void setFimvigencia(String fimvigencia) {
        this.fimvigencia = fimvigencia;
    }
    public List<Clientes> getClientes() {
        return clientes;
    }
    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }
    public List<Assinatura> getAssinaturas() {
        return assinaturas;
    }
    public void setAssinaturas(List<Assinatura> assinaturas) {
        this.assinaturas = assinaturas;
    }
}
