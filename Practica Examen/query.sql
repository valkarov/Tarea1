CREATE DATABASE verdureria;
USE verdureria;

CREATE TABLE sucursal(
    id_sucursal INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre_sucursal VARCHAR(120) NOT NULL
);

CREATE TABLE producto(
    id_producto INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre_producto VARCHAR(120) NOT NULL,
    precio INT NOT NULL
);

CREATE TABLE inventario(
    id_sucursal INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_sucursal) REFERENCES sucursal(id_sucursal),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE factura(
    id_factura INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_sucursal INT NOT NULL,
    FOREIGN KEY (id_sucursal) REFERENCES sucursal(id_sucursal)
);

CREATE TABLE venta(
    id_factura INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio INT NOT NULL,
    FOREIGN KEY (id_factura) REFERENCES factura(id_factura),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);