package com.clientes.inventario.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "productos",schema = "inventario")
public class ProductoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "producto_id", updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
}
