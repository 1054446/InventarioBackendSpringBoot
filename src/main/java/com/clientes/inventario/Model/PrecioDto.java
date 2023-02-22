package com.clientes.inventario.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "precios",schema = "inventario")
public class PrecioDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "precio_id", updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long precioId;

    @Column(name = "precio")
    private Double precio;

    @OneToOne(optional = false)
    @JoinColumn(name = "producto_id", referencedColumnName = "producto_id")
    private ProductoDto producto;


}
