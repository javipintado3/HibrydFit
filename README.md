# HybridFit - La App para Atletas Híbridos

## Descripción

**HybridFit** es una innovadora aplicación diseñada para aquellos que siguen la filosofía del atleta híbrido, que combina entrenamiento de fuerza y cardio para mejorar la salud y el bienestar general. Esta plataforma permite a los usuarios registrar, compartir y seguir sus rutinas de entrenamiento, fomentando una comunidad activa y motivadora.

### ¿Qué es un Atleta Híbrido?

Un atleta híbrido es alguien que se dedica a múltiples disciplinas de entrenamiento, buscando un equilibrio entre fuerza, resistencia y agilidad. **HybridFit** proporciona las herramientas necesarias para que estos atletas puedan llevar un seguimiento efectivo de su progreso, compartir sus logros y motivar a otros en su viaje hacia un estilo de vida saludable.

## Características Principales

- **Registro de Entrenamientos**: Los usuarios pueden registrar y publicar entrenamientos de fuerza y cardio, con la opción de combinarlos.
- **Iconos de Reconocimiento**: Los usuarios que realizan ambos tipos de entrenamiento reciben un icono de "fueguito" en su perfil, reconociendo su esfuerzo.
- **Interacción Social**: Funciones como "likes", comentarios y la opción de seguir a otros usuarios fomentan la comunidad y el apoyo mutuo.
- **Perfiles Personalizados**: Cada usuario tiene un perfil donde puede mostrar su tipo de cardio favorito y sus entrenamientos.
- **Roles de Usuario**: La aplicación incluye diferentes roles (administrador y usuario normal) para gestionar la interacción y el contenido.

## Tecnologías Utilizadas

- **Backend**: Java con **Spring Boot**, utilizando **arquitectura hexagonal** para una mejor organización y mantenibilidad del código.
- **Frontend**: **Angular** para una interfaz de usuario dinámica y responsiva.
- **Base de Datos**: **MySQL** para la gestión de datos.
- **Autenticación**: Utiliza **JSON Web Tokens (JWT)** para una seguridad robusta.
- **Despliegue**: Posibilidad de despliegue en **AWS** para escalabilidad y accesibilidad.

## Estructura del Proyecto

La arquitectura de **HybridFit** sigue un enfoque hexagonal, organizando las distintas capas de la aplicación de la siguiente manera:

- **Capa de Dominio**: Contiene las entidades y la lógica de negocio principal (por ejemplo, `User`, `Workout`, `Comment`).
- **Capa de Aplicación**: Servicios que gestionan la lógica de la aplicación, coordinando las entidades del dominio (por ejemplo, `UserService`, `WorkoutService`).
- **Capa de Infraestructura**: Maneja las interacciones con sistemas externos, como bases de datos y seguridad (por ejemplo, `UserRepository`, `SecurityConfig`).

