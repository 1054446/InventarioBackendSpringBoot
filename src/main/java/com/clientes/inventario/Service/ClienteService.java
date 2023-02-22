package com.clientes.inventario.Service;

import com.clientes.inventario.Model.ClienteDto;
import com.clientes.inventario.Model.RespuestaApi;
import com.clientes.inventario.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClientesRepository clientesRepository;

    public RespuestaApi mostrarClientes(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(clientesRepository.findAll());
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi guardaCliente(ClienteDto clienteDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        ClienteDto clienteDtoResult = clientesRepository.save(clienteDto);
        respuestaApi.setResultado(clienteDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi actualizaCliente(ClienteDto clienteDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        ClienteDto clienteDtoResult = clientesRepository.save(clienteDto);
        respuestaApi.setResultado(clienteDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi eliminarCliente(Long id){
        RespuestaApi respuestaApi = new RespuestaApi();
        clientesRepository.deleteById(id);
        respuestaApi.setResultado("deleted");
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }
}
