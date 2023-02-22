package com.clientes.inventario.Repository;

import com.clientes.inventario.Model.OrdenDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<OrdenDto, Long> {
}
