-- Crear base de datos y usuario
CREATE DATABASE IF NOT EXISTS concesionario CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS 'soapp'@'localhost' IDENTIFIED BY 'soapp123!';
GRANT ALL PRIVILEGES ON concesionario.* TO 'soapp'@'localhost';
FLUSH PRIVILEGES;

-- Usar la base de datos
USE concesionario;

-- Crear tablas
CREATE TABLE IF NOT EXISTS tipo_vehiculo (
  idtv INT PRIMARY KEY,
  nomtv VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS vehiculo (
  placavehi VARCHAR(10) PRIMARY KEY,
  marcavehi VARCHAR(100),
  refvehi  VARCHAR(100),
  modelovehi VARCHAR(10),
  id_tv INT,
  CONSTRAINT fk_tv FOREIGN KEY (id_tv) REFERENCES tipo_vehiculo(idtv)
);

-- Insertar datos de prueba
INSERT IGNORE INTO tipo_vehiculo VALUES (1,'Bus'),(2,'Camioneta'),(3,'Moto');
INSERT IGNORE INTO vehiculo VALUES
('AAA111','Chevrolet','Spark GT','2018',2),
('BBB222','Yamaha','FZ25','2022',3),
('CCC333','Scania','K410','2019',1);
