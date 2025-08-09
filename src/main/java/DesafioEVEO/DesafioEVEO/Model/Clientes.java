package DesafioEVEO.DesafioEVEO.Model;

import java.util.List;

public class Clientes {
    private String clienteId;
    private String nome;
    private List<Contrato> contratos;
    private List<Assinatura> assinaturas;
    private List<FaturasRecentes> faturas;

    public Clientes(String clienteId, String nome, List<Contrato> contratos, List<Assinatura> assinaturas,
            List<FaturasRecentes> faturas) {
        this.clienteId= clienteId;
        this.nome = nome;
        this.contratos = contratos;
        this.assinaturas = assinaturas;
        this.faturas = faturas;
    }

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
