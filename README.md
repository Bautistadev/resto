# Restaurante Backend - Java Spring Boot

## Índice
1. [Descripción](#descripción)
2. [Problemática](#problemática)
3. [Requisitos](#requisitos)
4. [Tecnologías utilizadas](#tecnologías-utilizadas)
5. [Comparativa](#comparativa)
6. [Funcionalidades](#funcionalidades)
7. [Configuración](#configuracion)
8. [Modelado de base de datos](#Modelado-de-base-de-datos)

## Descripción
Este es el backend de una aplicación para la gestión de un restaurante, desarrollado en **Java Spring Boot**. La aplicación se encarga de manejar la autenticación de usuarios mediante tokens, así como la generación de códigos que luego se transformarán en QR para las mesas del restaurante.

## Problemática
En la gestión tradicional de un restaurante, las operaciones diarias como la asignación de mesas, el registro de pedidos, y la administración de inventarios suelen realizarse manualmente, lo que puede llevar a errores humanos, demoras y una experiencia de cliente subóptima. Además, con la creciente demanda de soluciones tecnológicas que faciliten la interacción con los clientes y optimicen el flujo de trabajo interno, los restaurantes enfrentan la necesidad de modernizar sus sistemas.

Una problemática clave es la dificultad para manejar eficientemente la ocupación de mesas, especialmente en momentos de alta demanda, y garantizar que el proceso de pedido sea fluido y rápido. La ausencia de un sistema centralizado también dificulta la gestión del personal y el seguimiento del inventario en tiempo real, lo que puede resultar en pérdida de ventas o mal servicio.

Esta aplicación surge para abordar estos desafíos. Al implementar un sistema de gestión basado en Java Spring Boot que utiliza tokens para la autenticación de usuarios y la generación de códigos QR para las mesas, el restaurante puede optimizar sus operaciones. La solución permite una asignación de mesas más rápida y precisa, una administración de pedidos eficiente, y un seguimiento en tiempo real de la ocupación de las mesas, lo que se traduce en una mejora significativa en la experiencia del cliente y en la eficiencia operativa del restaurante.

![image](https://github.com/user-attachments/assets/0f2e02ac-3d71-44c3-9190-45c984b72dea)

## Requisitos

- **Java 11**
- **Spring Boot 2.7.10**
- **Maven 3.6.3**

## Tecnologías Utilizadas

- **Java Spring Boot:** Framework principal para el desarrollo de la API.
- **JWT (JSON Web Token):** Para la autenticación segura de usuarios.
- **JPA**: Para la conexión e iteracción con la base de datos.
- **Spring Security:** Para gestionar la autorización y roles de usuarios.
- **Maven:** Gestión de dependencias y ciclo de vida del proyecto.
- **MySQL:** Base de datos relacional para almacenar la información.
- **Swagger-ui**: Esta librería proporciona una interfaz personlizable e iterativa para nuestra API
- **openapi-generator**:El openapi-generator-maven-plugin es un plugin de Maven que se utiliza para generar automáticamente código fuente, clientes API, servidores, y documentación a partir de un archivo de especificación OpenAPI 

## Comparativa
### **1. Asignación de Mesas** 👉
  **Forma Tradicional:** El personal del restaurante asigna manualmente las mesas a los clientes, lo que puede llevar a errores, especialmente durante horas pico.
      No existe un sistema automatizado para saber cuáles mesas están ocupadas o disponibles en tiempo real, lo que puede causar confusión y retrasos.
  
  **Propuesta con la Aplicación:** Las mesas se gestionan mediante tokens y códigos QR, lo que permite una asignación automatizada y precisa.
      Los clientes pueden escanear un código QR en la mesa para registrarse automáticamente, y el sistema actualiza en tiempo real la disponibilidad de las mesas.
      Esto reduce el margen de error humano y mejora la eficiencia, permitiendo que el personal se concentre en otras tareas importantes.
      
  ### **2. Gestión de Pedidos** 📝
  **Forma Tradicional:** Los pedidos se toman manualmente, ya sea en papel o mediante una terminal de punto de venta (POS).
  Los errores en la toma de pedidos son comunes, y los tiempos de espera pueden aumentar debido a la falta de automatización.
  
  **Propuesta con la Aplicación:** La aplicación permite gestionar pedidos directamente desde una interfaz digital, minimizando los errores de transcripción.
  Los pedidos pueden ser gestionados y rastreados en tiempo real, lo que acelera el proceso y reduce los tiempos de espera para los clientes.
  
  ### **3. Gestión del Inventario** 📦
  **Forma Tradicional:** El inventario se actualiza manualmente al final del día o de la semana, lo que puede llevar a discrepancias y pérdida de ventas si ciertos 
  productos se agotan inesperadamente.
  La falta de visibilidad en tiempo real dificulta la toma de decisiones informadas sobre la compra de suministros.
  
  **Propuesta con la Aplicación:** La aplicación permite un seguimiento en tiempo real del inventario a medida que los platos y bebidas se ordenan y sirven.
  Esto garantiza que el inventario esté siempre actualizado, permitiendo una mejor planificación y evitando la falta de productos durante el servicio.
  
  ### **4. Gestión de Empleados** 🧍
  **Forma Tradicional:** La asignación de roles y turnos a los empleados se realiza manualmente, lo que puede resultar en conflictos o falta de claridad sobre las       responsabilidades de cada empleado.
  No existe una manera sencilla de rastrear el desempeño y la eficiencia del personal.
  
  **Propuesta con la Aplicación:** La aplicación permite una gestión automatizada de los empleados, asignando roles y responsabilidades de manera clara y efectiva.
  Los gerentes pueden hacer un seguimiento del rendimiento de los empleados en tiempo real, mejorando la toma de decisiones y la eficiencia operativa.
  
  ### **5. Experiencia del Cliente** 🧍
  **Forma Tradicional:** La experiencia del cliente depende en gran medida de la habilidad y el tiempo de respuesta del personal, lo que puede variar.
  Los clientes a menudo enfrentan tiempos de espera largos, especialmente durante momentos de alta demanda.
  
  **Propuesta con la Aplicación:** La experiencia del cliente se mejora significativamente al automatizar procesos clave como la asignación de mesas y la toma de 
  pedidos.
  Los tiempos de espera se reducen, y los clientes pueden disfrutar de un servicio más rápido y preciso, lo que aumenta la satisfacción general.

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
         ``` + Json
         {
          "mesa": {
            "id": 0
             }
         }

         ```
    - 🟡 **/api/v1/Ocupacion/update** --> Actualizar ocupacion.
         ``` + Json
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

         ```
         {
            "ocupacion": {
              "id": 0
           },
            "nombre": "string",
            "apellido": "string"
          }
         ```
    - 🟡 **/api/v1/Cliente/update** --> Actualizar el registro de un cliente.
    
         ```
         {
            "ocupacion": {
              "id": 0
           },
            "nombre": "string",
            "apellido": "string"
          }
         ```
    
- ## Gestión de Platos y Bebidas:
  - CRUD de platos y bebidas disponibles en el restaurante.
    
    - **Bebidas:**
      - 🔵 **/api/v1/Plato/retrieveAllBebida** --> Consultar listado de bebidas.
      - 🔵 **/api/v1/Plato/retrieveBebida/{id}** --> Consultar bebida filtrando por id.
      - 🟢 **/api/v1/Plato/addBebida** --> Dar de alta una nueva bebida.
        
           ``` +Json
           {
            "nombre": "string",
            "descripcion": "string",
            "precio": 0,
            "marca": {
              "id": 0
            }
          }
           
           ```
      - 🟡 **/api/v1/Plato/updateBebida** --> Actualizar bebida.
 
           ``` +Json
            {
              "id": 0,
              "nombre": "string",
              "descripcion": "string",
              "dateCreated": "2024-09-03T13:57:47.339Z",
              "dateDeleted": "2024-09-03T13:57:47.339Z",
              "marca": {
                "id": 0
              },
              "precio": 0
            }
           ```
      - 🔴 **/api/v1/Plato/removeBebida** --> Dar de baja una bebida

     - **Plato:**
        - 🔵 **/api/v1/Plato/retrieveAllPlato** --> Consultar listado de bebidas.
        - 🔵 **/api/v1/Plato/retrievePlato/{id}** --> Consultar bebida filtrando por id.
        - 🟢 **/api/v1/Plato/addPlato** --> Dar de alta una nueva bebida.
             ``` +Json
               {
                  "nombre": "string",
                  "descripcion": "string",
                  "categoria": {
                    "id": 0,
                    "categoria": "PIZZERIA" | "CAFETERIA"
                  },
                  "precio": 0
                }
             ```
        - 🟡 **/api/v1/Plato/updatePlato** --> Actualizar bebida.
          ``` +Json
              {
                "id": 0,
                "nombre": "string",
                "descripcion": "string",
                "precio": 0,
                "dateCreated": "2024-09-03T14:03:02.175Z",
                "dateDeleted": "2024-09-03T14:03:02.175Z",
                "categoria": {
                  "id": 0,
                  "categoria": "PIZZERIA"
                }
              }
          ```
        - 🔴 **/api/v1/Plato/removePlato** --> Dar de baja un plato
        
  - Gestión de inventario y disponibilidad.
  

- ## Gestión de Empleados:
  - CRUD de empleados.
    
    - 🔵 **/api/v1/Empleado/retiveAll** --> Consultar listado de empleados.
    - 🔵 **/api/v1/Empleado/retrive/{id}** --> Buscar empleado por id.
    - 🟢 **/api/v1/Empleado/add** --> Dar de alta un empleado.
         ``` +Json
           {
              "userName": "string",
              "nombre": "string",
              "apellido": "string",
              "dni": 0,
              "password": "string",
              "rol": {
                "id": 0,
                "rol": "ROLE_USER"
              }
            }
         ```
    - 🟡 **/api/v1/Empleado/update** -->Actualizar atributos de un empleado.
         ``` +Json
           {
            "id": 0,
            "userName": "string",
            "nombre": "string",
            "apellido": "string",
            "password": "string",
            "dni": 0,
            "rol": {
              "id": 0,
              "rol": "ROLE_USER"
            }
          }
         ```
  
  - Asignación de roles y permisos dentro de la aplicación.

- ## Gestión de marcas:
  - CRUD de marcas de vevidas
    
     - 🔵 **/api/v1/Marca/retriveAll** --> Listar todas las marcas
     - 🔵 **/api/v1/Marca/retrive/{id}** --> Buscar marca por id
     - 🟢 **/api/v1/Marca/add** --> Dar de alta un marca
          ``` +Json
            {
              "nombre": "string"
            }
          ```
     - 🟡 **/api/v1/Marca/update** --> Modificar
         ``` +Json
            {
              "id":0
              "nombre": "string"
            }
         ```

- ## Gestion de pedidos:
  - CRUD de marcas de pedidos

    - **Bebidas:**
      - 🔵 **/api/v1/DetalleBebidaController/retriveAll**
      - 🔵 **/api/v1/DetalleBebidaController/retrive/{id}**
      - 🟢 **/api/v1/DetalleBebidaController/add**
           ``` +Json
           {
              "cantidad": 0,
              "bebida": {
                "id": 0,
                "nombre": "string",
                "descripcion": "string",
                "dateCreated": "2024-09-03T14:11:42.359Z",
                "dateDeleted": "2024-09-03T14:11:42.359Z",
                "precio": 0,
                "marca": {
                  "id": 0,
                  "nombre": "string"
                }
              },
              "ocupacion": {
                "id": 0
             }
           }
           ```
      - 🟡 **/api/v1/DetalleBebidaController/update**
           ``` +Json
            {
              "id": 0,
              "cantidad": 0,
              "bebida": {
                "id": 0,
                "nombre": "string",
                "descripcion": "string",
                "dateCreated": "2024-09-03T14:19:37.060Z",
                "dateDeleted": "2024-09-03T14:19:37.060Z",
                "precio": 0,
                "marca": {
                  "id": 0,
                  "nombre": "string"
                }
              }
           ```
        
    - **Platos:**
      - 🔵 **/api/v1/DetallePlatoController/retriveAll**
      - 🔵 **/api/v1/DetallePlatoController/retrive/{id}**
      - 🟢 **/api/v1/DetallePlatoController/add**
           ```
           {
              "cantidad": 0,
              "porcion": {
                "id": 0,
                "porcion": "COMPLETA" | "MITAD"
              },
              "plato": {
                "id": 0,
                "nombre": "string",
                "descripcion": "string",
                "dateCreated": "2024-09-03T14:22:59.614Z",
                "precio": 0,
                "dateDeleted": "2024-09-03T14:22:59.614Z",
                "categoria": {
                  "id": 0,
                  "categoria": "PIZZERIA"
                }
              },
              "ocupacion": {
                "id": 0
              }
            }
           ````
      - 🟡 **/api/v1/DetallePlatoController/update**
        ``` + Json
            {
                "cantidad": 0,
                "porcion": {
                  "id": 0,
                  "porcion": "COMPLETA" | "MITAD"
                },
                "plato": {
                  "id": 0,
                  "nombre": "string",
                  "descripcion": "string",
                  "dateCreated": "2024-09-03T14:22:59.614Z",
                  "precio": 0,
                  "dateDeleted": "2024-09-03T14:22:59.614Z",
                  "categoria": {
                    "id": 0,
                    "categoria": "PIZZERIA"
                  }
                },
                "ocupacion": {
                  "id": 0
                }
            }
        ```

- ## Gestion de login:
  - Iniciar session
  
    - 🟢 **/security/login**
         ``` +Json
            {
              "userName": "string",
              "password": "string"
            }
         ```
    - 🟢 **/security/validateToken**

- ## Gestion de geolocalizacion de las mesas:

  - 🔵 **/api/v1/Geolocalizacion/retriveAll**
  - 🟢 **/api/v1/Geolocalizacion/add**
  - 🟡 **/api/v1/Geolocalizacion/update**
    

## Configuración 

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/Bautistadev/resto.git
   cd resto
   ```
2. Variables de entorno:
   ```bash
      export ENV_DATABASE_DB = "Nombre de la base de datos"
      export ENV_PASSWORD_DB = "Contraseña de la base de datos"
      export ENV_USER_DB = "Usuario de la base de datos"
      export ENV_PORT_SERVICE = "Puerto en el cual se ejecuta"
      export ENV_URI_DB = "Direccion de la base de datos (localhost, 192.168.xxx.xxx, http/.....)"
   ```
3. Resolver dependencias:
   ``` Maven
       mvn dependency:resolve
   ```
4. Compilar: 
   ```Maven
      mvn install
   ```  
5. Correr test (Opcional y verificar haber configurado las variables de entorno):
   ```Maven
      mvn test
   ```
   
   
## Modelado de base de datos

![Untitled2](https://github.com/user-attachments/assets/a27f8ee9-26ae-4d58-bcb8-df4d7f10c8dd)
