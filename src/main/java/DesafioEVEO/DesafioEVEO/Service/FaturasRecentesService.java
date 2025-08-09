package DesafioEVEO.DesafioEVEO.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import DesafioEVEO.DesafioEVEO.Model.FaturasRecentes;




@Service
public class FaturasRecentesService {
   
    public List<FaturasRecentes> FaturaDeCadaCliente(String clienteid){

      
      return List.of(
        new FaturasRecentes("2025-07",5800.00,true),

         new FaturasRecentes("2025-06",5730.00,true)
      );
    }
}
