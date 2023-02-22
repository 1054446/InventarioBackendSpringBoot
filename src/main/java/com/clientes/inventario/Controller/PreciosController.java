package com.clientes.inventario.Controller;

import com.clientes.inventario.Model.PrecioDto;
import com.clientes.inventario.Service.PrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario/v1")
public class PreciosController {

    @Autowired
    PrecioService precioService;

    @GetMapping(value = "/precios")
    public ResponseEntity<Object> getPrecios(){
        return new ResponseEntity<>(precioService.mostrarPrecios(), HttpStatus.OK);
    }

    @PostMapping(value = "/precios")
    public ResponseEntity<Object> savePrecio(@RequestBody PrecioDto preciosDto){
        return new ResponseEntity<>(precioService.guardaPrecio(preciosDto), HttpStatus.OK);
    }

    @PutMapping(value = "/precios")
    public ResponseEntity<Object> updatePrecio(@RequestBody PrecioDto preciosDto){
        return new ResponseEntity<>(precioService.actualizaPrecio(preciosDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/precios/{id}")
    public ResponseEntity<Object> deletePrecio(@PathVariable Long id){
        return new ResponseEntity<>(precioService.eliminarPrecio(id), HttpStatus.OK);
    }
}
