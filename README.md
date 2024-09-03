# Restaurante Backend - Java Spring Boot

Este es el backend de una aplicación para la gestión de un restaurante, desarrollado en **Java Spring Boot**. La aplicación se encarga de manejar la autenticación de usuarios mediante tokens, así como la generación de códigos que luego se transformarán en QR para las mesas del restaurante.

## Funcionalidades

- ## Autenticación de Usuarios:
  - Gestión de credenciales de usuario utilizando **tokens**.
  - Los usuarios pueden autenticarse para acceder a las diferentes funcionalidades de la aplicación.

- ## Gestión de Mesas:
  - CRUD (Crear, Leer, Actualizar, Eliminar) de mesas del restaurante.
  
    - 🔵 **/api/v1/Mesa/retrieveAll** --> Consultar todas las mesas.
    - 🔵 **/api/v1/Mesa/retrieve/{id}** --> Consultar mesa filtrando por id.
    - 🔵 **/api/v1/Mesa/retrieveMesaToken/{id}** --> Consultar token por id.
    - 🔵 **/api/v1/Mesa/retrieveMesaByToken/{token}** --> Consultar  mesa por el token.
    - 🟢 **/api/v1/Mesa/dejarMesa** --> Dejar mesa cuando se desocupa.
    - 🟢 **/api/v1/Mesa/add** --> Dar de alta mesa.
                    
          ``` + Json
              {
                "token": "string",
                "estado": true,
                "empleado": {
                  "id": 0
                  }
                },
                "geolocalizacion": {
                  "id": 0,
                  "x1": 0,
                  "x2": 0,
                  "x3": 0,
                  "x4": 0,
                  "y1": 0,
                  "y2": 0,
                  "y3": 0,
                  "y4": 0
                }
              }

          ```
    - 🟡 **/api/v1/Mesa/update** --> Modificar mesa
    
           ``` + Json
               {
                 "token": "string",
                 "estado": true,
                 "empleado": {
                   "id": 0
                   }
                 },
                 "geolocalizacion": {
                   "id": 0,
                   "x1": 0,
                   "x2": 0,
                   "x3": 0,
                   "x4": 0,
                   "y1": 0,
                   "y2": 0,
                   "y3": 0,
                   "y4": 0
                 }
              }
      
  - Generación de **tokens** que representan el código de la mesa.
  - Conversión de estos tokens en códigos QR para ser escaneados por los clientes y registrar su ocupacion.
  - Geolocalizacion de las mesas.
  - Registro de la ocupación de la mesa, incluyendo fecha y hora.

- ## Ocupación:
  - CRUD: (Crear, Leer, Actualizar) la ocupacion de las mesas.
   
    - 🔵 **/api/v1/Ocupacion/retrieveAll** --> Consultar el histórico de ocupacion de las mesas.
    - 🔵 **/api/v1/Ocupacion/retrieve/{id}** --> Consultar el históco de ocupacion de una de las mesas.
    - 🟢 **/api/v1/Ocupacion/add** --> Agregar una nueva ocupacion.
         ```
         {
          "mesa": {
            "id": 0
             }
         }

         ```
    - 🟡 **/api/v1/Ocupacion/update** --> Actualizar ocupacion.
         ```
         {
          "id": 0,
          "inicio": "2024-09-03T01:55:38.408Z",
          "fin": "2024-09-03T01:55:38.408Z",
          "mesa": {
            "id": 0
          }
        }
         ```
     
  - Generacion de históricos de ocupacion de una mesa.
  - Este histórico registra quien ocupó la mesa.

- ## Cliente:
  - CRUD para registrar los clientes que ocupan las mesas.
    
    - 🔵 **/api/v1/Cliente/retrieveAll** --> Dame los clientes que ocuparon mesas.
    - 🔵 **/api/v1/Cliente/retrieve/{id}** --> Filtrar por id el Cliente.
    - 🟢 **/api/v1/Cliente/add** --> Dar de alta un cliente que ocupo una mesa.
    - 🟡 **/api/v1/Cliente/update** --> Actualizar el registro de un cliente.
    
- ## Gestión de Platos y Bebidas:
  - CRUD de platos y bebidas disponibles en el restaurante.
    
    - **Bebidas:**
      - 🔵 **/api/v1/Plato/retrieveAllBebida** --> Consultar listado de bebidas.
      - 🔵 **/api/v1/Plato/retrieveBebida/{id}** --> Consultar bebida filtrando por id.
      - 🟢 **/api/v1/Plato/addBebida** --> Dar de alta una nueva bebida.
      - 🟡 **/api/v1/Plato/updateBebida** --> Actualizar bebida.
      - 🔴 **/api/v1/Plato/removeBebida** --> Dar de baja una bebida

     - **Plato:**
        - 🔵 **/api/v1/Plato/retrieveAllPlato** --> Consultar listado de bebidas.
        - 🔵 **/api/v1/Plato/retrievePlato/{id}** --> Consultar bebida filtrando por id.
        - 🟢 **/api/v1/Plato/addPlato** --> Dar de alta una nueva bebida.
        - 🟡 **/api/v1/Plato/updatePlato** --> Actualizar bebida.
        - 🔴 **/api/v1/Plato/removePlato** --> Dar de baja un plato
        
  - Gestión de inventario y disponibilidad.
  

- ## Gestión de Empleados:
  - CRUD de empleados.
    
    - 🔵 **/api/v1/Empleado/retiveAll** --> Consultar listado de empleados.
    - 🔵 **/api/v1/Empleado/retrive/{id}** --> Buscar empleado por id.
    - 🟢 **/api/v1/Empleado/add** --> Dar de alta un empleado.
    - 🟡 **/api/v1/Empleado/update** -->Actualizar atributos de un empleado.
  
  - Asignación de roles y permisos dentro de la aplicación.

- ## Gestión de marcas:
  - CRUD de marcas de vevidas
    
     - 🔵 **/api/v1/Marca/retriveAll** --> Listar todas las marcas
     - 🔵 **/api/v1/Marca/retrive/{id}** --> Buscar marca por id
     - 🟢 **/api/v1/Marca/add** --> Dar de alta un marca
     - 🟡 **/api/v1/Marca/update** --> Modificar

- ## Gestion de pedidos:
  - CRUD de marcas de pedidos

    - **Bebidas:**
      - 🔵 **/api/v1/DetalleBebidaController/retriveAll**
      - 🔵 **/api/v1/DetalleBebidaController/retrive/{id}**
      - 🟢 **/api/v1/DetalleBebidaController/add**
      - 🟡 **/api/v1/DetalleBebidaController/update**
        
    - **Platos:**
      - 🔵 **/api/v1/DetallePlatoController/retriveAll**
      - 🔵 **/api/v1/DetallePlatoController/retrive/{id}**
      - 🟢 **/api/v1/DetallePlatoController/add**
      - 🟡 **/api/v1/DetallePlatoController/update**

- ## Gestion de login:
  - Iniciar session
  
    - 🟢 **/security/login**
    - 🟢 **/security/validateToken**

- ## Gestion de geolocalizacion de las mesas:

  - 🔵 **/api/v1/Geolocalizacion/retriveAll**
  - 🟢 **/api/v1/Geolocalizacion/add**
  - 🟡 **/api/v1/Geolocalizacion/update**
    
## Requisitos

- **Java 11**
- **Spring Boot 2.7.10**
- **Maven 3.6.3**

## Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/usuario/restaurante-backend.git
   cd restaurante-backend
   
2. **Modelado de base de datos**

![Untitled2](https://github.com/user-attachments/assets/a27f8ee9-26ae-4d58-bcb8-df4d7f10c8dd)
