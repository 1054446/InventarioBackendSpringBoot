package com.clientes.inventario.Service;

import com.clientes.inventario.Model.ProductoDto;
import com.clientes.inventario.Model.RespuestaApi;
import com.clientes.inventario.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductosRepository productosRepository;

    public RespuestaApi mostrarProductos(){
        RespuestaApi respuestaApi= new RespuestaApi();
        respuestaApi.setResultado(productosRepository.findAll());
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi guardaProducto(ProductoDto productoDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        ProductoDto productoDtoResult = productosRepository.save(productoDto);
        respuestaApi.setResultado(productoDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi actualizaProducto(ProductoDto productoDto){
        RespuestaApi respuestaApi = new RespuestaApi();
        ProductoDto productoDtoResult = productosRepository.save(productoDto);
        respuestaApi.setResultado(productoDtoResult);
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

    public RespuestaApi eliminarProducto(Long id){
        RespuestaApi respuestaApi = new RespuestaApi();
        productosRepository.deleteById(id);
        respuestaApi.setResultado("deleted");
        respuestaApi.setMensaje("OK");
        return respuestaApi;
    }

}
