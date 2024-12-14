# Laboratorio3-ED

# Programa de Consola Interactivo en Kotlin

Este programa permite realizar las siguientes operaciones mediante un menú interactivo en consola:

1. Ordenar una lista de números usando Bubble Sort.
2. Ordenar una lista de números usando Quick Sort.
3. Calcular el factorial de un número positivo.
4. Resolver las Torres de Hanói con un contador de pasos.
5. Salir del programa.

## Requisitos

- Tener instalado Kotlin en el sistema.
- Un editor de texto o IDE (como IntelliJ IDEA o Visual Studio Code) compatible con Kotlin.

## Cómo ejecutar el programa

1. Descargue el archivo fuente (main.kt).
2. Compile y ejecute el archivo usando el siguiente comando en la terminal:
   bash
   kotlinc main.kt -include-runtime -d programa.jar
   java -jar programa.jar
   

## Ejemplo de uso

### Menú principal

Seleccione una opcion:
1. Ordenar una lista usando Bubble Sort
2. Ordenar una lista usando Quick Sort
3. Calcular el factorial de un numero
4. Resolver las Torres de Hanoi
5. Salir
Opcion:


### Torres de Hanói

Ingrese el numero de discos: 3
Solucion para 3 discos:
Paso 1: Mover disco 1 de Torre A a Torre C
Paso 2: Mover disco 2 de Torre A a Torre B
Paso 3: Mover disco 1 de Torre C a Torre B
Paso 4: Mover disco 3 de Torre A a Torre C
Paso 5: Mover disco 1 de Torre B a Torre A
Paso 6: Mover disco 2 de Torre B a Torre C
Paso 7: Mover disco 1 de Torre A a Torre C

Total de pasos necesarios: 7


## Notas

- El programa valida las entradas para evitar errores.
- Se mide el tiempo de ejecución de los algoritmos de ordenamiento.
