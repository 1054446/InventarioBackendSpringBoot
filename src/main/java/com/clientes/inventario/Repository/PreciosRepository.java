package com.clientes.inventario.Repository;

import com.clientes.inventario.Model.PrecioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreciosRepository extends JpaRepository<PrecioDto, Long> {
}
