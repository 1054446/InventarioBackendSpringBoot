package com.clientes.inventario.Repository;

import com.clientes.inventario.Model.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<ClienteDto, Long> {
}
