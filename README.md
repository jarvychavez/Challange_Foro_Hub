🚀 Foro Hub - API REST para Gestión de Tópicos
Una API REST robusta desarrollada con Spring Boot para la gestión de un foro de discusión, permitiendo crear, leer, actualizar y eliminar tópicos con seguridad JWT.

📚 Descripción del Proyecto
Foro Hub - API REST es un servicio backend diseñado para administrar tópicos en un foro.
Permite a los usuarios autenticados crear, modificar o eliminar tópicos, mientras que los visitantes pueden consultar la lista de tópicos.

Este proyecto sigue arquitectura en capas, aplicando Clean Code y buenas prácticas REST.
Incluye seguridad con Spring Security y JWT, validación de datos con Jakarta Validation y migraciones automáticas de base de datos con Flyway.

 Características Principales
Gestión Completa de Tópicos (CRUD)
Crear nuevos tópicos con título, mensaje,id y curso.

Obtener detalles de un tópico específico por ID.

Actualizar tópicos existentes.

Eliminar tópicos por ID.

Autenticación y Autorización Segura
Spring Security para la gestión de seguridad.

JWT para autenticación sin estado.

BCrypt para hashing seguro de contraseñas.

Validación de Datos
jakarta.validation para asegurar la integridad de la información enviada.

Gestión de Base de Datos
Flyway para versionar y administrar el esquema de la base de datos.

JPA/Hibernate para acceso y persistencia de datos.

🛠️ Tecnologías Utilizadas
Lenguaje: Java 17+

Framework: Spring Boot 3

Base de Datos: MySQL

ORM: Spring Data JPA / Hibernate

Migraciones: Flyway

Seguridad: Spring Security + JWT

Validación: Jakarta Bean Validation

Construcción: Maven

Dependencias útiles: Lombok, DevTools

🏛️ Arquitectura del Proyecto

src/main/java/com/challengeForoHub/demo
│
├── controller/                → Controladores REST
│   ├── AutenticacionController
│   └── TopicoController
│
├── domain/                    → Lógica de negocio
│   ├── topico/
│   │   ├── DatosRegistroTopico
│   │   ├── DatosActualizacionTopico
│   │   ├── Topico
│   │   └── TopicoRepository
│   │
│   └── usuario/
│       ├── AutenticacionService
│       ├── DatosAutenticacionUsuario
│       ├── Usuario
│       └── UsuarioRepository
│
├── infra/                     → Configuración e infraestructura
│   ├── exceptions/            → Manejo global de errores
│   └── security/               → Configuración de seguridad y JWT
│       ├── SecurityConfiguration
│       ├── SecurityFilter
│       └── TokenService
│
└── ForoApplication.java       → Clase principal


🔒 Seguridad
JWT: Todas las solicitudes a endpoints protegidos requieren un token en el header Authorization: Bearer <token>.

BCrypt: Contraseñas almacenadas de forma segura.

Control de Acceso: Endpoints públicos y privados según la operación.

📦 Instalación y Ejecución
Clonar repositorio

https://github.com/jarvychavez/Challange_Foro_Hub

