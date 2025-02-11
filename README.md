PROYECTO DE AUTOMATIZACIÓN DE FLUJOS CON SERENITY Y GHERKIN
Este repositorio contiene un conjunto de pruebas automatizadas para la pagina StarSharp utilizando el patron de diseño Screenplay en el lenguaje de programacion Java, las pruebas estan usando Serenity, Gherkin y gestionadas con Gradle.

TECNOLOGIAS Y HERRAMIENTAS
-Lenguaje de programacion: JAVA
-Patron de diseño: Screenplay
-Framework de Automatización: Serenity BDD
-Lenguaje de especificación: Gherkin
-Gestor de dependencias: Gradle
-Navegador: Chrome

DESCRIPCION DEL PROYECTO
Este proyecto esta enfocado en la automatizacion de 2 flujos en la pagina web StartSharp, se utilizan especificaciones en Gherkin para describir el comportamiento esperado de los flujos y se implementan pruebas automatizadas con serenity para ejecutarlas y verificar su correcta ejecución

INSTALACION
1. Clonar el repositorio
2. Asegurar tener instalado java y gradle
3. Ejecutar el siguiente comando para construir las dependencias y compilar el proyecto:
Gradle build
4. Para ejecutar las pruebas automatizadas, usa el siguiente comando
gradle clean test
