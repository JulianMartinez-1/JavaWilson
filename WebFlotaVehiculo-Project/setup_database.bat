@echo off
echo Iniciando MySQL...
cd "C:\Users\Julian\OneDrive\Desktop\xampp2\mysql\bin"

echo Creando base de datos y usuario...
mysql.exe -u root -e "CREATE DATABASE IF NOT EXISTS concesionario CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;"
mysql.exe -u root -e "DROP USER IF EXISTS 'soapp'@'localhost';"
mysql.exe -u root -e "CREATE USER 'soapp'@'localhost' IDENTIFIED BY 'soapp123!';"
mysql.exe -u root -e "GRANT ALL PRIVILEGES ON concesionario.* TO 'soapp'@'localhost';"
mysql.exe -u root -e "FLUSH PRIVILEGES;"

echo Creando tablas...
mysql.exe -u root concesionario -e "DROP TABLE IF EXISTS vehiculo;"
mysql.exe -u root concesionario -e "DROP TABLE IF EXISTS tipo_vehiculo;"
mysql.exe -u root concesionario -e "CREATE TABLE tipo_vehiculo (idtv INT PRIMARY KEY, nomtv VARCHAR(100) NOT NULL);"
mysql.exe -u root concesionario -e "CREATE TABLE vehiculo (placavehi VARCHAR(10) PRIMARY KEY, marcavehi VARCHAR(100), refvehi VARCHAR(100), modelovehi VARCHAR(10), id_tv INT, CONSTRAINT fk_tv FOREIGN KEY (id_tv) REFERENCES tipo_vehiculo(idtv));"

echo Insertando datos de prueba...
mysql.exe -u root concesionario -e "INSERT INTO tipo_vehiculo VALUES (1,'Bus'),(2,'Camioneta'),(3,'Moto');"
mysql.exe -u root concesionario -e "INSERT INTO vehiculo VALUES ('AAA111','Chevrolet','Spark GT','2018',2),('BBB222','Yamaha','FZ25','2022',3),('CCC333','Scania','K410','2019',1);"

echo Verificando datos...
mysql.exe -u root concesionario -e "SELECT COUNT(*) as 'Tipos de vehiculo' FROM tipo_vehiculo;"
mysql.exe -u root concesionario -e "SELECT COUNT(*) as 'Vehiculos registrados' FROM vehiculo;"
mysql.exe -u root concesionario -e "SELECT * FROM vehiculo;"

echo Configuracion completada.
pause
