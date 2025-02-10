# **Alberto Alonso - Prueba Técnica GFT**

## **Descripción**

Este proyecto está desarrollado con **Spring Boot** y **Java 17**, utilizando una **arquitectura hexagonal** que separa claramente las responsabilidades de la lógica de negocio, las interfaces y los servicios externos.

Se ha seguido un enfoque de **Desarrollo Guiado por Pruebas (TDD)**, donde los **tests** han sido implementados antes de desarrollar la lógica de negocio, asegurando que el comportamiento del sistema esté validado desde el inicio.

El proyecto utiliza una base de datos **H2** para la persistencia de datos, con los datos inicializados al iniciar la aplicación.

---

## **Características**

- **Arquitectura Hexagonal:** Organización modular y desacoplada del código para facilitar la integración y mantenimiento.
- **Desarrollo Guiado por Pruebas (TDD):** Los tests fueron escritos antes de la lógica de negocio para asegurar un alto nivel de cobertura y calidad.
- **Base de Datos H2:** Base de datos en memoria con datos inicializados para pruebas.
- **Swagger:** Documentación interactiva de la API para facilitar su uso y prueba.
- **Docker:** Imagen Docker disponible en Docker Hub para facilitar la ejecución en cualquier entorno.

---

## **Requisitos**

- **Java 17**: Asegúrate de tener instalado **Java 17** en tu sistema.
- **Puerto 8080:** El servicio requiere que el puerto **8080** esté libre para poder ejecutarse correctamente.

---

## **Instrucciones de Ejecución**

### **Opción A: Ejecutar desde el IDE**

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/AlbertoAlonsoMc/Prueba-Tecnica-GFT-Inditex.git

2. **Abre y ejecuta el proyecto en tu IDE.**
3. **Accede a la API de Swagger en: http://localhost:8080/swagger-ui.html**

### **Opción B: Ejecutar con Docker**
1. **Instala Docker en tu equipo.**

2. **Descarga la imagen desde Docker Hub:**
   ```bash
   docker pull albertoalonsomc/prueba-tecnica-inditex-image

3. **Ejecuta el contenedor de Docker.**
    ```bash
   docker run -p 8080:8080 albertoalonsomc/prueba-tecnica-inditex-image
   
4. **Accede a la API de Swagger en: http://localhost:8080/swagger-ui.html**
