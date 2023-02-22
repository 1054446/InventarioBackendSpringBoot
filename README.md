# InventarioBackendSpringBoot
#script de la base de datos de Mysql

CREATE DATABASE IF NOT EXISTS inventario;

use inventario;

ALTER TABLE ordenes
  DROP COLUMN producto_producto_id;
  
CREATE TABLE IF NOT EXISTS clientes
( 
  cliente_id INT(11) NOT NULL AUTO_INCREMENT,
  nombres VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50),
  telefono  VARCHAR(11),
  frecuente boolean,
  CONSTRAINT clientes_pk PRIMARY KEY (cliente_id)
);

CREATE TABLE IF NOT EXISTS productos
(
  producto_id INT(11) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(50) NOT NULL,
  CONSTRAINT productos_pk PRIMARY KEY (producto_id)
);

CREATE TABLE IF NOT EXISTS precios
(
  precio_id INT(11) NOT NULL AUTO_INCREMENT,  
  precio DECIMAL(9,2),
  producto_id int (11),
  CONSTRAINT precios_pk PRIMARY KEY (precio_id),
  FOREIGN KEY(producto_id) REFERENCES productos(producto_id)
);

CREATE TABLE IF NOT EXISTS ordenes
(
  orden_id INT(11) NOT NULL AUTO_INCREMENT,
  cliente_id int (11),
  producto_id int (11),
  cantidad int (11),
  fecha date,
  CONSTRAINT ordenes_pk PRIMARY KEY (orden_id),
  FOREIGN KEY(cliente_id) REFERENCES clientes(cliente_id),
  FOREIGN KEY(producto_id) REFERENCES productos(producto_id)
);
