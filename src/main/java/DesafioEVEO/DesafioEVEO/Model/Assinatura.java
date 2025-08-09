package DesafioEVEO.DesafioEVEO.Model;



public class Assinatura {
    private String produto;
    private String status;
  
    public Assinatura(String produto, String status) {
        this.produto = produto;
        this.status = status;
       
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
   
    
   

}
