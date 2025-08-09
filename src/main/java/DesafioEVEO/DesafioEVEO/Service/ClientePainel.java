package DesafioEVEO.DesafioEVEO.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import DesafioEVEO.DesafioEVEO.DTO.ClienteDto;
import DesafioEVEO.DesafioEVEO.Model.Clientes;


@Service
public class ClientePainel {
    @Autowired
    private ContratoService contratoService;
    @Autowired
    private FaturaService faturaService;
    @Autowired
    private AssinaturaService assinaturaService;
    @Autowired
    private ClienteService clienteService;

    public ClienteDto getClientePainel(String clienteId) {
        Clientes cliente = clienteService.buscarPorId(clienteId);
        if (cliente == null) {
            throw new RuntimeException("Cliente não encontrado");
        }

        ClienteDto dto = new ClienteDto();
        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setContratos(contratoService.ContratoDeCadaCliente(clienteId));
        dto.setAssinaturas(assinaturaService.AssinaturasDeCadaCliente(clienteId));
        dto.setFaturas(faturaService.FaturaDeCadaCliente(clienteId));
        return dto;
    }
}
