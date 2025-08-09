package DesafioEVEO.DesafioEVEO.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import DesafioEVEO.DesafioEVEO.Model.Fatura;




@Service
public class FaturaService {
   
    public List<Fatura> FaturaDeCadaCliente(String clienteid){
      return List.of(
        new Fatura("2025-07",5800.00,true),
         new Fatura("2025-06",5730.00,true)
      );
    }
}
