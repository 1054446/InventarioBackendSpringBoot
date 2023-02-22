package com.clientes.inventario.Controller;

import com.clientes.inventario.Model.ClienteDto;
import com.clientes.inventario.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario/v1")
public class ClientesController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/clientes")
    public ResponseEntity<Object> getClientes(){
        return new ResponseEntity<>(clienteService.mostrarClientes(), HttpStatus.OK);
    }

    @PostMapping(value = "/clientes")
    public ResponseEntity<Object> saveClientes(@RequestBody ClienteDto clientesDto){
        return new ResponseEntity<>(clienteService.guardaCliente(clientesDto), HttpStatus.OK);
    }

    @PutMapping(value = "/clientes")
    public ResponseEntity<Object> updateClientes(@RequestBody ClienteDto clientesDto){
        return new ResponseEntity<>(clienteService.actualizaCliente(clientesDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/clientes/{id}")
    public ResponseEntity<Object> deleteClientes(@PathVariable Long id){
        return new ResponseEntity<>(clienteService.eliminarCliente(id), HttpStatus.OK);
    }
}
