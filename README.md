# SpringSecurity

## Descripción
Este es un proyecto de demostración de Spring Boot que incluye un controlador básico `CustomerController` y está configurado para usar Spring Security (comentado en el `pom.xml`).

## Requisitos
- Java 17
- Maven 3.6.3 o superior

## Configuración del Proyecto
1. Clona el repositorio:
    ```sh
    git clone <https://github.com/Karolos10/SpringSecurity.git>
    cd SpringSecurity
    ```

2. Compila el proyecto:
    ```sh
    mvn clean install
    ```

3. Ejecuta la aplicación:
    ```sh
    mvn spring-boot:run
    ```

## Estructura del Proyecto
- `src/main/java/com/example/SpringSecurityApplication.java`: Clase principal para iniciar la aplicación Spring Boot.
- `src/main/java/com/example/controller/CustomerController.java`: Controlador REST básico con la ruta `/api/customers`.
- `pom.xml`: Archivo de configuración de Maven con las dependencias necesarias.

## Dependencias
- `spring-boot-starter-web`: Para crear aplicaciones web con Spring Boot.
- `spring-boot-starter-test`: Para pruebas unitarias y de integración.

## Notas
- La dependencia `spring-boot-starter-security` está comentada en el `pom.xml`. Descoméntala para habilitar Spring Security.
- La aplicación está configurada para usar Java 17.

## Autor
- Karolos10