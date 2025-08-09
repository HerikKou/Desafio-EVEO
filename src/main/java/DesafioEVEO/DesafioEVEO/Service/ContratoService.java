 package DesafioEVEO.DesafioEVEO.Service;

import java.util.List;

import org.springframework.stereotype.Service;



import DesafioEVEO.DesafioEVEO.Model.Contrato;

@Service
public class ContratoService {
    
    public List<Contrato> ContratoDeCadaCliente(String clienteId){
 return List.of(
 new Contrato("C-001","Contrato de IaaS","2023-01-01","2025-01-01")
 );
    
}}