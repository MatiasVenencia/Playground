# Playground
Repositorio interno estructurado mediante tags de acuerdo al desarrollo de las distintas prácticas

# Convenciones a seguir

Todo código en este repositorio debe seguir las siguientes convenciones:
  * El código fuente debe estar dentro de la carpeta `src`.
  * El javadoc compilado debe ir en la carpeta `doc`.
  * Cualquier librería (archivos jars) debe ir en la carpeta `lib`.
  * Toda clase debe estar apropiadamente comentada utilizando Javadoc.

# Compilar

Para compilar se debe ejecutar el comando `javac [-cp <paths>] <path completo de la clase>` estando posicionado dentro de la carpeta `src`.

# Ejecutar

Para ejecutar una clase ejecutable (aquella con un método `public static void main(String[])`) se debe ejecutar `java [-cp <paths>] <nombre completo de la clase main>` estando posicionado en la carpeta raíz donde se compiló el código previamente (e.g.: `src`, `bin`).

# Generar Javadoc

Para compilar la documentación Javadoc, se debe ejecutar el comando `javadoc -sourcepath ./src -d ./docs -subpackages .` estando posicionado en la raíz del repositorio, el directorio `docs` se crea automáticamente si no existe.
