package com.clientes.inventario.Repository;

import com.clientes.inventario.Model.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<ProductoDto, Long> {
}
