package com.clientes.inventario.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "clientes",schema = "inventario")
public class ClienteDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clienteId;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "frecuente")
    private boolean frecuente;

}
