package com.clientes.inventario.Service;

import com.clientes.inventario.Model.OrdenDto;
import com.clientes.inventario.Model.RespuestaApi;
import com.clientes.inventario.Repository.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {

    @Autowired
    OrdenesRepository ordenesRepository;

    public RespuestaApi mostrarOrdenes(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(ordenesRepository.findAll());
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi guardaOrden(OrdenDto ordenDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        OrdenDto ordenDtoResult = ordenesRepository.save(ordenDto);
        respuestaApi.setResultado(ordenDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi actualizaOrden(OrdenDto ordenDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        OrdenDto ordenDtoResult = ordenesRepository.save(ordenDto);
        respuestaApi.setResultado(ordenDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi eliminarOrden(Long id){
        RespuestaApi respuestaApi = new RespuestaApi();
        ordenesRepository.deleteById(id);
        respuestaApi.setResultado("deleted");
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }
}
