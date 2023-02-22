package com.clientes.inventario.Service;

import com.clientes.inventario.Model.PrecioDto;
import com.clientes.inventario.Model.RespuestaApi;
import com.clientes.inventario.Repository.PreciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrecioService {

    @Autowired
    PreciosRepository preciosRepository;

    public RespuestaApi mostrarPrecios(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(preciosRepository.findAll());
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi guardaPrecio(PrecioDto precioDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        PrecioDto precioDtoResult = preciosRepository.save(precioDto);
        respuestaApi.setResultado(precioDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi actualizaPrecio(PrecioDto precioDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        PrecioDto precioDtoResult = preciosRepository.save(precioDto);
        respuestaApi.setResultado(precioDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi eliminarPrecio(Long id){
        RespuestaApi respuestaApi = new RespuestaApi();
        preciosRepository.deleteById(id);
        respuestaApi.setResultado("deleted");
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }
}
