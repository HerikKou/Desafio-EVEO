package DesafioEVEO.DesafioEVEO.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import DesafioEVEO.DesafioEVEO.DTO.ClienteDto;

import DesafioEVEO.DesafioEVEO.Service.ClientePainel;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
//CONTROLLER - Controla as requisições http//
public class Controller {
    @Autowired
    private ClientePainel clientePainel;


    @GetMapping("/clientes/{clienteId}/painel")
    public ClienteDto getClientePainel(@PathVariable String clienteId) throws Exception {
        return clientePainel.getClientePainel(clienteId);
    }
    
}
