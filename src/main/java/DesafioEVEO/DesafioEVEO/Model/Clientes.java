package DesafioEVEO.DesafioEVEO.Model;

import java.util.List;

public class Clientes {
    private String id;
    private String nome;
    private List<Contrato> contratos;
    private List<Assinatura> assinaturas;
    private List<Fatura> faturas;

    public Clientes(String id, String nome, List<Contrato> contratos, List<Assinatura> assinaturas,
            List<Fatura> faturas) {
        this.id = id;
        this.nome = nome;
        this.contratos = contratos;
        this.assinaturas = assinaturas;
        this.faturas = faturas;
    }

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
