
# Ejercicio de Automatización con Serenity BDD

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes requisitos:

1. **Java Development Kit (JDK)**: versión 17  
   Descárgalo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
   
2. **Maven**: versión 3.6 o superior  
   Descárgalo desde [aquí](https://maven.apache.org/download.cgi).

## Tecnologías usadas

- **Serenity BDD**: versión 3.9.8
- **Apache POI**: versión 3.17 (para manejo de archivos Excel)
- **Maven Compiler Source**: 1.8
- **Maven Compiler Target**: 1.8

## Estructura del Proyecto

El proyecto sigue la estructura básica de un proyecto Serenity BDD con Cucumber:

```
.
├── src
│   ├── main
│   └── test
├── pom.xml
└── readme.txt
```

1. **src/main**: Contiene el código fuente principal.
2. **src/test**: Contiene los tests escritos en Cucumber y las clases de soporte.
3. **pom.xml**: Archivo de configuración de Maven.
4. **readme.txt**: Instrucciones para ejecutar el proyecto.

## Instrucciones de Instalación y Ejecución

### Clonar el repositorio

Clona este repositorio desde GitHub a tu máquina local con el siguiente comando:

```bash
git clone <URL del repositorio>
cd <nombre del repositorio>
```

### Configurar el entorno

1. Asegúrate de tener Java 17 configurado correctamente. Puedes verificarlo con el siguiente comando:

```bash
java -version
```

Deberías ver algo similar a:

```bash
java version "17.0.x"
```

2. Configura Maven. Puedes verificar si Maven está correctamente instalado con:

```bash
mvn -version
```

Deberías ver algo similar a:

```bash
Apache Maven 3.6.x
```

### Compilar el proyecto

Para compilar el proyecto, utiliza el siguiente comando:

```bash
mvn clean compile
```

### Ejecutar las pruebas

Para ejecutar las pruebas con Serenity BDD, utiliza el siguiente comando:

```bash
mvn clean verify serenity:aggregate
```

Este comando ejecutará todas las pruebas automáticas y generará un reporte en la carpeta `target/site/serenity`.

### Visualizar reportes

Una vez finalizadas las pruebas, puedes visualizar el reporte generado por Serenity BDD. Abre el archivo `index.html` ubicado en la siguiente ruta:

```
target/site/serenity/index.html
```

### Notas adicionales

- Si necesitas modificar las versiones o dependencias, puedes hacerlo en el archivo `pom.xml`.
- La versión de Apache POI usada en este proyecto es la `3.17` para manipular archivos Excel.

## Contacto

Si tienes algún problema o duda sobre la ejecución del proyecto, no dudes en contactarme.
