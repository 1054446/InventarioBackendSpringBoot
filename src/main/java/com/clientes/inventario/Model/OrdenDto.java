package com.clientes.inventario.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ordenes",schema = "inventario")
public class OrdenDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "orden_id", updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordenId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id")
    private ClienteDto cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id")
    private ProductoDto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "fecha")
    private Timestamp fecha;

}
