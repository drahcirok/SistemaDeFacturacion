package ec.webmarket.restful.service.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Cliente;
import ec.webmarket.restful.dto.v1.ClienteDTO;
import ec.webmarket.restful.persistence.*;
import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente) {  // Se usa Cliente en lugar de ClienteDTO
        return clienteRepository.save(cliente);
    }

    public Cliente update(Long id, ClienteDTO clienteDTO) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setNombre(clienteDTO.getNombre());
            cliente.setEmail(clienteDTO.getEmail());
            cliente.setTelefono(clienteDTO.getTelefono());
            cliente.setDireccion(clienteDTO.getDireccion());
            return clienteRepository.save(cliente);  // Se guarda el cliente actualizado
        }).orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + id));
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}

