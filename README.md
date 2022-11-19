# Proyecto de Desarrollo de Software

### 1. DESCRIPCION 

Proyecto de Desarrollo de Software del ciclo 3, realizado con Spring Boot por el equipo GADJET TEAM, 
Universidad de Antioquia, Misión TIC 2022, correspondiente a una app Web de gestión de empleados 
e ingresos-egresos para una empresa.

Para acceder el usuario deberá primero registrarse y luego realizar el proceso de login. La app 
cuenta con 3 módulos de gestión: Enterprises, Employees y Transactions. En cada módulo se puede
realizar las operaciones de agregar, ver y actualizar datos de la empresa, empleados y transacciones,
así como eliminar en su totalidad una empresa, un empleado o una transacción.

El documento completo con las indicaciones dadas para el proyecto se encuentra en la rama main o
en el siguiente link:

https://drive.google.com/file/d/1zsEnri95cVkkLwZw2SGAQ2ujJXIFmzPc/view?usp=share_link

### 2. LINK DE ACCESO A LA APP

Se accede a la app mediante cualquiera de los siguientes links:

* https://gadjet-systema.herokuapp.com

* https://spring4-misiontic.herokuapp.com

### 3. VIDEO QUE EVIDENCIA LA FUNCIONALIDAD

Para evidenciar la funcionalidad de la app se puede ver el video el cual se encuentra en la rama main
o en el siguiente link:

https://drive.google.com/file/d/1GW4JPdSN3BGiG5Rzy-NLh7wDlREBpY4D/view?usp=sharing

### 4. MANUAL DEL USUARIO

Se puede ver el manual del usuario en la rama main de este repositorio, o mediante el siguiente
link:

https://drive.google.com/file/d/1-m5ybxNzJ-ozDNkQ0e6IrQJrHd_imMbu/view?usp=share_link

### 5. FRAMEWORKS, LENGUAJE Y HERRAMIENTAS UTILIZADAS

 * Spring Boot
 * Java
 * Posgresql
 * Supabase
 * Html
 * css
 * Bootstrap
 * Thymeleaf
 * Heroku
 
### 6. HISTORIAS DE USUARIO

#### + Historia de usuario 1 (HU_01)

   Como usuario administrador, quiero poder crear una empresa en el sistema.
    
 #### + Historia de usuario 2 (HU_02)

   Como usuario administrador, quiero poder agregar un nuevo empleado a mi empresa.
    
 #### + Historia de usuario 3 (HU_03)

   Como usuario administrador, quiero poder agregar un ingreso de dinero a la empresa.
    
 #### + Historia de usuario 4 (HU_04)

   Como usuario administrador, quiero poder agregar un egreso a la empresa.
    
 #### + Historia de usuario 5 (HU_05)

   Como usuario operativo, quiero poder visualizar los gastos e ingresos de la empresa.
    
 #### + Historia de usuario 6 (HU_06)

   Como usuario administrador, quiero poder visualizar los gastos e ingresos de la empresa.

### 7. DESARROLLO DE LA APP 

Este proyecto se realizó empleando la metodología SCRUM en 4 Sprints. El desarrollo de cada 
Sprint queda incorporado en las ramas de este repositorio denominados Sprint1, Sprint2 y Sprint_3_y_4. 
A parte del código, cada rama de los Sprints contiene una carpeta con las indicaciones de 
realización, informe y video que muestra los resultados que se fueron logrando con cada Sprint, así
como un readme donde se describe brevemente los archivos que contiene.

El código completo de la app está en la rama main, dentro de la carpeta Sprint_3_4. En los Sprints se 
realizaron las siguientes tareas:

#### A. Sprint 1: Equipo de trabajo y Github

 * Conformación de equipo de trabajo de 5 personas.
 
 * Creación de una organización en Github.
 
 * Creación de un repositorio de ejemplo dentro de la organización donde cada miembro evidencie
 un commit.
 
#### B. Sprint 2: Clases para las entidades básicas de la aplicación.

 * Modelar una empresa como una clase de Java.
 
 * Modelar un empleado como una clase de Java.
 
 * Modelar el movimiento de dinero como una clase de Java.

#### C. Sprint 3: Backend para la aplicación

 * Crear controladores REST para la empresa.
 
 * Crear controladores REST para los usuarios.
 
 * Crear controladores REST para los movimientos de dinero una empresa especifica.
 
 * Crear servicios para la empresa.
 
 * Crear servicios para los empleados.
 
 * Crear servicios REST para los movimientos de dinero.
 
 * Crear entidades y repositorios para la empresa.
 
 * Crear entidades y repositorios para los empleados.
 
 * Crear entidades y repositorios para los movimientos de dinero.

#### D. Sprint 4: Frontend para la aplicación.

CRUD: Por sus siglas en inglés: Create, Read, Update and Eliminate datos.

 * Crear una interfaz para CRUD de los datos de la empresa.
 
 * Crear una interfaz para CRUD de los datos de los empleados de la empresa
 
 * Crear una interfaz para CRUD de los movimientos de dinero de la empresa.
 
 * Agregar autenticación a la aplicación.
 
 * Desplegar la app a través de internet.
