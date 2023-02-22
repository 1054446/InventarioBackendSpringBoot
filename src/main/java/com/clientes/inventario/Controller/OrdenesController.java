package com.clientes.inventario.Controller;

import com.clientes.inventario.Model.OrdenDto;
import com.clientes.inventario.Service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario/v1")
public class OrdenesController {

    @Autowired
    OrdenService ordenService;

    @GetMapping(value = "/ordenes")
    public ResponseEntity<Object> getOrdenes(){
        return new ResponseEntity<>(ordenService.mostrarOrdenes(), HttpStatus.OK);
    }

    @PostMapping(value = "/ordenes")
    public ResponseEntity<Object> saveOrden(@RequestBody OrdenDto ordenesDto){
        return new ResponseEntity<>(ordenService.guardaOrden(ordenesDto), HttpStatus.OK);
    }

    @PutMapping(value = "/ordenes")
    public ResponseEntity<Object> updateOrden(@RequestBody OrdenDto ordenesDto){
        return new ResponseEntity<>(ordenService.actualizaOrden(ordenesDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/ordenes/{id}")
    public ResponseEntity<Object> deleteOrden(@PathVariable Long id){
        return new ResponseEntity<>(ordenService.eliminarOrden(id), HttpStatus.OK);
    }
}
