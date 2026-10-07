# Método de Gauss-Jordan

Práctica correspondiente a la materia de Métodos Numéricos, en la cual se implementa el método de Gauss-Jordan para resolver un sistema de ecuaciones lineales.

## Estructura del proyecto

El programa está desarrollado de forma modular y está compuesto por las siguientes clases:

- `DefMatriz.java`: define la matriz aumentada del sistema de ecuaciones.
- `Gauss.java`: contiene el método de eliminación gaussiana utilizado para obtener la matriz triangular superior.
- `GaussJordan.java`: reutiliza el método de eliminación gaussiana y realiza la normalización de los pivotes y la eliminación de los coeficientes superiores.
- `Principal.java`: ejecuta el programa y muestra las soluciones obtenidas.

## Compilación

Para compilar el programa, abrir una terminal en la carpeta donde se encuentran los archivos y ejecutar:

```bash
javac *.java
```

## Ejecución

Después de compilar, ejecutar:

```bash
java Principal
```

## Ejemplo de prueba

La matriz aumentada utilizada es:

```text
 2   1  -1 |   8
-3  -1   2 | -11
-2   1   2 |  -3
```

## Salida por consola

```text
Soluciones del sistema:
x1 = 2.0
x2 = 3.0
x3 = -1.0
```

El método de Gauss-Jordan permite obtener las soluciones directamente de la última columna de la matriz reducida, sin utilizar sustitución regresiva.
