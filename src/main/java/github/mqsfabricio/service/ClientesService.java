package github.mqsfabricio.service;

import github.mqsfabricio.model.Cliente;
import github.mqsfabricio.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;

    public ClientesService (ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente) {
        //aplica validações
    }
}
