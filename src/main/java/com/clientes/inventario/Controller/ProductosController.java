package com.clientes.inventario.Controller;

import com.clientes.inventario.Model.ProductoDto;
import com.clientes.inventario.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario/v1")
public class ProductosController {

    @Autowired
    ProductoService productoService;

    @GetMapping(value = "/productos")
    public ResponseEntity<Object> getProductos(){
        return new ResponseEntity<>(productoService.mostrarProductos(), HttpStatus.OK);
    }

    @PostMapping(value = "/productos")
    public ResponseEntity<Object> saveProducto(@RequestBody ProductoDto productosDto){
        return new ResponseEntity<>(productoService.guardaProducto(productosDto), HttpStatus.OK);
    }

    @PutMapping(value = "/productos")
    public ResponseEntity<Object> updateProducto(@RequestBody ProductoDto productosDto){
        return new ResponseEntity<>(productoService.actualizaProducto(productosDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/productos/{id}")
    public ResponseEntity<Object> deleteProducto(@PathVariable Long id){
        return new ResponseEntity<>(productoService.eliminarProducto(id), HttpStatus.OK);
    }
}
