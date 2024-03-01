# exercise_three

Crear un proyecto en Java y su diagrama de clases para resolver el siguiente problema:

Juan José y Sebastián tienen como objetivo crear un sistema donde cada usuario pueda conectar a su base de datos de forma eficiente y segura. Para lograrlo, deberán crear un proyecto en Java que implemente el patrón Singleton para asegurar una única instancia de una clase que gestione la conexión.
Para crear una conexión, se requiere información esencial como el nombre de usuario (user), la contraseña (pass) y el host de la base de datos. Además, los usuarios pueden proporcionar datos opcionales para la conexión, tales como codificación de caracteres, tiempo de espera de la conexión, certificados SSL, puerto y nombre de la base de datos.
Dado que existen múltiples maneras de crear una conexión, deberán utilizar el patrón Builder para configurar esta conexión de manera adecuada. ¡Manos a la obra!

----

Formato de entrega:
Para el código/proyecto:
Enlace de GitHub o plataforma para revisión en la nube que no requiera inicio de sesión (se recomienda, y suma puntos en caso de requerirlo); ó carpeta comprimida con extensión .zip.
Evitar el uso de tildes o caracteres especiales en los nombres de los archivos.
Verificar que el archivo subido esté correcto; en caso de subir archivos corruptos, se considerarán igual que una entrega no realizada.
Debe haber una clase App con un método main() para probar el funcionamiento correcto del código.
Se calificarán las buenas prácticas de programación.
Para el diagrama de clases:
Adjuntar una imagen visible desde Classroom.
Fecha de entrega:
Luego de la fecha limite de entrega, ya no se aceptarán más trabajos.
----------
Equipo de trabajo:
Si realizan el trabajo en grupos, debe estar especificado de manera clara en un comentario dentro de la Tarea y cada integrante debe subir el entregable al Classroom.
Los grupos no pueden ser de más de 3 estudiantes.
Se calificará con mayor rigurosidad según el tamaño del grupo.

# Autores

- Juan Nicolas Castro H juann.castroh@uqvirtual.edu.co
- Santiago Polania P santiago.polaniap@uqvirtual.edu.co

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)


# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/exercise_three-1.0.jar
```