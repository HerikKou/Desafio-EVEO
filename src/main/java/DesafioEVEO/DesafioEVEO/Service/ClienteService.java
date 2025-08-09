package DesafioEVEO.DesafioEVEO.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import DesafioEVEO.DesafioEVEO.Model.Clientes;

@Service
public class ClienteService {

    // Simulação de "banco de dados em memória"
    private final List<Clientes> clientesMock = List.of(
        new Clientes("123", "Empresa ABC", null, null, null),
        new Clientes("456", "Empresa XYZ", null, null, null)
    );

    public Clientes buscarPorId(String clienteId) {
        return clientesMock.stream()
            .filter(c -> c.getId().equals(clienteId))
            .findFirst()
            .orElse(null); // ou lançar exceção se não encontrar
    }
}
