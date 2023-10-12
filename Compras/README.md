# ¡Reto Automatizador! 🚀

Este es un proyecto de automatización de pruebas de aceptación usando **Java** como lenguaje de desarrollo, además se implementa el patrón **Screenplay** para la escritura de pruebas usando el core de **Serenity**. En este proyecto los requerimientos se escriben en lenguaje **Gherkin** con la implementación de **Cucumber** para Java.

Las pruebas están centradas en el sitio web de compras de SAUCEDEMO con los siguientes escenarios:

- Inicio de Sesión
- Agregar productos al carrito
- Visualizar el carrito de compras

## Pre requisitos para ejecutar 📋
- Java version "19.0.2" 2023-01-17 o superior y JDK (variables de entorno configuradas).
- IntelliJ IDEA
- Gradle version 8.3 (variables de entorno configuradas).
- Cucumber for Java Plugin
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

	gradle clean test aggregate -i

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, por ejemplo para el Login.

    gradle clean test --tests "LoginRunner"

## Navegador Web 🌐
Actualmente la automatización ejecuta por defecto con Chrome.

## Obtener el código

El código de la automatización está alojado en un repositorio de GitHub, para hacer uso de él puede clonarlo usando Git o descargar el archivo zip del proyecto.

Git:

## Versionamiento 📌
Se usó Git para el control de versiones. 🔀

## Autor 👨
**Marco Herrera**
