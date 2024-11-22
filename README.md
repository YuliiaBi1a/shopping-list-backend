# 🛒 **Aplicación de Lista de la Compra: CRUD con JavaScript y Backend**

Este proyecto consiste en una lista de la compra funcional que permite gestionar productos a través de una aplicación frontend conectada a un backend desarrollado con Spring Boot.

## 🚀 **Características**

- **Frontend:** Interfaz para visualizar, añadir, actualizar y eliminar productos. [Enlace al repositorio del Frontend](https://github.com/LaFamiliaPaulinchi/shopping-list-frontend)

- **Backend:** API REST para operaciones CRUD con validaciones.
- **Persistencia:** Gestión de datos utilizando un repositorio de productos.

## 📝 **Tecnologías Utilizadas**

### Frontend:
- **HTML5** y **CSS3** para el diseño.
- **JavaScript** para la lógica y manejo del DOM.
- **Fetch API** para la comunicación con el backend.

### Backend:
- **Java** con **Spring Boot** para construir la API REST.
- **Spring Data JPA** para la gestión de la base de datos.
- **H2 Database** (configurable) como base de datos en memoria.
- **Postman** Prueba de  HTTP request

---


## 🛠️ **Pruebas con Postman**

Usamos **Postman** para probar y validar las rutas del backend.

### 🌐 **Rutas principales**

| Método  | Ruta                   | Descripción                          |
|---------|------------------------|--------------------------------------|
| `GET`   | `/api/products`        | Obtener todos los productos.         |
| `GET`   | `/api/products/{id}`   | Obtener un producto por ID.          |
| `POST`  | `/api/products`        | Crear un nuevo producto.             |
| `PUT`   | `/api/products/{id}`   | Actualizar un producto existente.    |
| `DELETE`| `/api/products/{id}`   | Eliminar un producto por ID.         |

### 🚀 **Ejemplos rápidos**

#### Crear un producto (`POST /api/products`)
    
        {
         "name": "Manzanas",
         "bought": false
        }


📖 Uso
1. Clonar el repositorio:
        bash
        
          git clone https://github.com/<tu-repositorio>.git
2. Configurar el Backend:
Dirígete al directorio backend/. 
Configura el archivo application.properties según tus necesidades.

    Ejecuta la aplicación Spring Boot:

           mvn spring-boot:run

## 🤝 Contribuidores

Equipo de Desarrollo:

- Juan Ignacio -https://github.com/juanignacioFG
- Yuliia  -https://github.com/YuliiaBi1a
- Evelyn - https://github.com/evymari
- Carito - https://github.com/carovasq
- Paula - https://github.com/PCalvoGarcia


¡Gracias por visitar nuestro proyecto! 🎉


