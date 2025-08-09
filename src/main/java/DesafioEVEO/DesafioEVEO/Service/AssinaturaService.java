package DesafioEVEO.DesafioEVEO.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import DesafioEVEO.DesafioEVEO.Model.Assinatura;

@Service
public class AssinaturaService {
   
    public List<Assinatura> AssinaturasDeCadaCliente(String clienteId) {
        
        // Simulação de dados mockados
        return List.of(
            new Assinatura("Firewall Gerenciado", "Ativo"),
            new Assinatura("Storage Objeto", "Inativo")
        );
    }
}

