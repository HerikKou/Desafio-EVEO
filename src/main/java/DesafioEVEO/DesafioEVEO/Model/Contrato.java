package DesafioEVEO.DesafioEVEO.Model;



public class Contrato {
    private String id;
    private String descricao;
    private String inicioVigencia;
    private String fimvigencia;

    public Contrato(String id, String descricao, String inicioVigencia, String fimvigencia) {
        this.id = id;
        this.descricao = descricao;
        this.inicioVigencia = inicioVigencia;
        this.fimvigencia = fimvigencia;

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

   
}
