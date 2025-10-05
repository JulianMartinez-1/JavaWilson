@echo off
echo ===================================
echo SOLUCION COMPLETA PARA LA APLICACION
echo ===================================

echo.
echo 1. Iniciando MySQL de XAMPP...
cd "C:\Users\Julian\OneDrive\Desktop\xampp2"
start "" "xampp-control.exe"

echo.
echo Esperando que inicies MySQL manualmente...
echo INSTRUCCIONES:
echo - En el panel de XAMPP que se abrio, haz clic en START junto a MySQL
echo - Debe ponerse verde y mostrar "Running"
echo - Luego presiona cualquier tecla aqui para continuar
pause

echo.
echo 2. Configurando base de datos...
cd "C:\Users\Julian\OneDrive\Desktop\xampp2\mysql\bin"

echo Creando base de datos...
mysql.exe -u root -e "CREATE DATABASE IF NOT EXISTS concesionario CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;"

echo Creando usuario...
mysql.exe -u root -e "DROP USER IF EXISTS 'soapp'@'localhost';" 2>nul
mysql.exe -u root -e "CREATE USER 'soapp'@'localhost' IDENTIFIED BY 'soapp123!';"
mysql.exe -u root -e "GRANT ALL PRIVILEGES ON concesionario.* TO 'soapp'@'localhost';"
mysql.exe -u root -e "FLUSH PRIVILEGES;"

echo Creando tablas...
mysql.exe -u root concesionario -e "DROP TABLE IF EXISTS vehiculo;"
mysql.exe -u root concesionario -e "DROP TABLE IF EXISTS tipo_vehiculo;"
mysql.exe -u root concesionario -e "CREATE TABLE tipo_vehiculo (idtv INT PRIMARY KEY, nomtv VARCHAR(100) NOT NULL);"
mysql.exe -u root concesionario -e "CREATE TABLE vehiculo (placavehi VARCHAR(10) PRIMARY KEY, marcavehi VARCHAR(100), refvehi VARCHAR(100), modelovehi VARCHAR(10), id_tv INT, CONSTRAINT fk_tv FOREIGN KEY (id_tv) REFERENCES tipo_vehiculo(idtv));"

echo Insertando datos...
mysql.exe -u root concesionario -e "INSERT INTO tipo_vehiculo VALUES (1,'Bus'),(2,'Camioneta'),(3,'Moto');"
mysql.exe -u root concesionario -e "INSERT INTO vehiculo VALUES ('AAA111','Chevrolet','Spark GT','2018',2),('BBB222','Yamaha','FZ25','2022',3),('CCC333','Scania','K410','2019',1);"

echo.
echo 3. Verificando datos insertados...
mysql.exe -u root concesionario -e "SELECT * FROM vehiculo;"

echo.
echo 4. Reiniciando Tomcat...
cd "C:\Users\Julian\OneDrive\Desktop\apache-tomcat-9.0.109\bin"
call shutdown.bat
timeout /t 5 /nobreak >nul

echo Limpiando despliegue anterior...
del "..\webapps\WebFlotaVehiculo.war" 2>nul
rmdir /s /q "..\webapps\WebFlotaVehiculo" 2>nul

echo Copiando nueva aplicacion...
copy "C:\Users\Julian\OneDrive\Desktop\JSP2\JSP\WebFlotaVehiculo\WebFlotaVehiculo\dist\WebFlotaVehiculo.war" "..\webapps\"

echo Iniciando Tomcat...
start "" startup.bat

echo.
echo ===================================
echo CONFIGURACION COMPLETADA
echo ===================================
echo.
echo Espera 30 segundos y luego ve a:
echo http://localhost:8080/WebFlotaVehiculo/listarVehi.jsp
echo.
echo La tabla deberia mostrar 3 vehiculos:
echo - AAA111 Chevrolet Spark GT 2018 (Camioneta)
echo - BBB222 Yamaha FZ25 2022 (Moto)
echo - CCC333 Scania K410 2019 (Bus)
echo.
pause
