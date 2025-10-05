# WebFlotaVehiculo - Sistema de Gestión de Vehículos

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JSP](https://img.shields.io/badge/JSP-007396?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache-tomcat&logoColor=black)

## 📋 Descripción

WebFlotaVehiculo es una aplicación web desarrollada en Java que permite gestionar una flota de vehículos de manera eficiente. El sistema proporciona funcionalidades completas para registrar, editar, eliminar y listar vehículos, así como gestionar tipos de vehículos.

## ✨ Características Principales

- **Gestión de Vehículos**: Registro, edición, eliminación y listado de vehículos
- **Tipos de Vehículos**: Administración de categorías (Bus, Camioneta, Moto, etc.)
- **Interfaz Responsive**: Diseño adaptable usando Bootstrap y ACE Admin Template
- **Base de Datos**: Persistencia de datos con MySQL/MariaDB
- **Arquitectura MVC**: Patrón Modelo-Vista-Controlador para mejor organización del código

## 🛠️ Tecnologías Utilizadas

### Backend
- **Java**: Lenguaje de programación principal
- **JSP (JavaServer Pages)**: Para la generación de contenido dinámico
- **Servlets**: Controladores para el manejo de peticiones HTTP
- **JDBC**: Conectividad con la base de datos

### Frontend
- **HTML5/CSS3**: Estructura y estilos
- **JavaScript/jQuery**: Interactividad del lado del cliente
- **Bootstrap**: Framework CSS para diseño responsive
- **ACE Admin Template**: Template profesional para la interfaz de usuario
- **DataTables**: Plugin para tablas interactivas

### Base de Datos
- **MySQL/MariaDB**: Sistema de gestión de base de datos relacional

### Servidor
- **Apache Tomcat 9**: Servidor de aplicaciones Java

## 🗄️ Estructura de la Base de Datos

### Tabla `tipo_vehiculo`
```sql
CREATE TABLE tipo_vehiculo (
  idtv INT PRIMARY KEY,
  nomtv VARCHAR(100) NOT NULL
);
```

### Tabla `vehiculo`
```sql
CREATE TABLE vehiculo (
  placavehi VARCHAR(10) PRIMARY KEY,
  marcavehi VARCHAR(100),
  refvehi VARCHAR(100),
  modelovehi VARCHAR(10),
  id_tv INT,
  CONSTRAINT fk_tv FOREIGN KEY (id_tv) REFERENCES tipo_vehiculo(idtv)
);
```

## 🚀 Instalación y Configuración

### Prerrequisitos
- Java JDK 8 o superior
- Apache Tomcat 9.0+
- MySQL o MariaDB
- IDE (recomendado: IntelliJ IDEA o Eclipse)

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/JulianMartinez-1/JavaWilson.git
   cd JavaWilson/WebFlotaVehiculo
   ```

2. **Configurar la base de datos**
   ```sql
   -- Crear la base de datos
   CREATE DATABASE concesionario CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
   
   -- Crear usuario y permisos
   CREATE USER 'soapp'@'localhost' IDENTIFIED BY 'soapp123!';
   GRANT ALL PRIVILEGES ON concesionario.* TO 'soapp'@'localhost';
   FLUSH PRIVILEGES;
   
   -- Usar la base de datos
   USE concesionario;
   
   -- Crear tablas y datos de prueba
   -- (Ejecutar el script setup_db.sql incluido en el proyecto)
   ```

3. **Configurar la conexión a base de datos**
   - Editar la clase `dao.conexionLib` con tus credenciales de base de datos
   - Verificar la URL de conexión JDBC

4. **Compilar el proyecto**
   ```bash
   ant clean dist
   ```

5. **Desplegar en Tomcat**
   ```bash
   # Copiar el WAR generado a Tomcat
   cp dist/WebFlotaVehiculo.war /ruta/a/tomcat/webapps/
   
   # Iniciar Tomcat
   /ruta/a/tomcat/bin/startup.bat  # Windows
   /ruta/a/tomcat/bin/startup.sh   # Linux/Mac
   ```

6. **Acceder a la aplicación**
   - Abrir navegador en: `http://localhost:8080/WebFlotaVehiculo/`

## 📱 Uso de la Aplicación

### Funcionalidades Principales

1. **Listar Vehículos**
   - URL: `/listarVehi.jsp`
   - Muestra todos los vehículos registrados en una tabla interactiva
   - Permite buscar, filtrar y exportar datos
   - Botones de acción para editar y eliminar vehículos

2. **Registrar Vehículo**
   - URL: `/registrarVehi.jsp`
   - Formulario para agregar nuevos vehículos
   - Campos: Placa, Marca, Referencia, Modelo, Tipo de Vehículo

3. **Editar Vehículo**
   - Accesible desde la tabla de vehículos
   - Permite modificar todos los datos excepto la placa

4. **Gestionar Tipos de Vehículo**
   - URL: `/registrarTv.jsp`
   - Administración de categorías de vehículos

### Navegación
- **Menú Principal**: Acceso rápido a todas las funcionalidades
- **Breadcrumbs**: Navegación contextual
- **Botones de Acción**: Iconos intuitivos para cada operación

## 📁 Estructura del Proyecto

```
WebFlotaVehiculo/
├── src/
│   ├── java/
│   │   ├── controlador/          # Servlets (Controladores)
│   │   │   ├── vehiControlador.java
│   │   │   └── tipovehiControlador.java
│   │   ├── dao/                  # Data Access Objects
│   │   │   ├── vehiDAO.java
│   │   │   ├── tipoVehiDAO.java
│   │   │   └── conexionLib.java
│   │   └── modelo/               # Modelos/Entidades
│   │       ├── vehi.java
│   │       └── tipovehi.java
│   └── conf/                     # Archivos de configuración
├── web/                          # Archivos web (JSP, CSS, JS)
│   ├── *.jsp                     # Páginas JSP
│   ├── assets/                   # Recursos estáticos
│   │   ├── css/
│   │   ├── js/
│   │   └── images/
│   ├── META-INF/
│   └── WEB-INF/
│       ├── web.xml
│       └── lib/                  # Librerías JAR
├── lib/                          # Dependencias externas
├── nbproject/                    # Configuración NetBeans
├── build.xml                     # Script de construcción Ant
└── README.md
```

## 🔧 Configuración de Desarrollo

### Variables de Entorno
```properties
# Base de datos
DB_HOST=localhost
DB_PORT=3306
DB_NAME=concesionario
DB_USER=soapp
DB_PASSWORD=soapp123!
```

### Construcción con Ant
```bash
# Limpiar proyecto
ant clean

# Compilar
ant compile

# Crear WAR
ant dist

# Limpiar y construir
ant clean dist
```

## 📝 Funcionalidades Implementadas

- ✅ CRUD completo de vehículos
- ✅ Gestión de tipos de vehículos
- ✅ Interfaz responsive con ACE Admin Template
- ✅ Validaciones de formularios
- ✅ Exportación de datos (CSV, Excel, PDF)
- ✅ Búsqueda y filtrado en tablas
- ✅ Confirmaciones para eliminación
- ✅ Mensajes de feedback al usuario

## 🔮 Futuras Mejoras

- [ ] Autenticación y autorización de usuarios
- [ ] Módulo de mantenimiento de vehículos
- [ ] Gestión de conductores
- [ ] Reportes avanzados
- [ ] API REST
- [ ] Integración con servicios externos

## 🤝 Contribución

Las contribuciones son bienvenidas. Para contribuir:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/NuevaFuncionalidad`)
3. Commit tus cambios (`git commit -m 'Añadir nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/NuevaFuncionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👨‍💻 Autor

**Julian Martinez**
- GitHub: [@JulianMartinez-1](https://github.com/JulianMartinez-1)
- Email: [tu-email@ejemplo.com]

## 📞 Soporte

Si tienes alguna pregunta o problema:
- Abre un [Issue](https://github.com/JulianMartinez-1/JavaWilson/issues)
- Contacta al autor

---

⭐ **¡Si te gusta este proyecto, no olvides darle una estrella!** ⭐
