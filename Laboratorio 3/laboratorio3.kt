// Programa de consola interactivo en Kotlin
import kotlin.system.measureTimeMillis

// Variable global para contar los pasos
var contadorPasos = 0

fun main() {
    while (true) {
        println("\nSeleccione una opcion:")
        println("1. Ordenar una lista usando Bubble Sort")
        println("2. Ordenar una lista usando Quick Sort")
        println("3. Calcular el factorial de un numero")
        println("4. Resolver las Torres de Hanoi")
        println("5. Salir")
        print("Opcion: ")

        when (readLine()?.toIntOrNull()) {
            1 -> ordenarBubbleSort()
            2 -> ordenarQuickSort()
            3 -> calcularFactorial()
            4 -> resolverTorresDeHanoi()
            5 -> {
                println("Saliendo del programa.")
                return
            }
            else -> println("Opcion no valida. Intente de nuevo.")
        }
    }
}

fun ordenarBubbleSort() {
    print("Ingrese una lista de numeros separados por comas: ")
    val entrada = readLine()?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: listOf()
    if (entrada.isEmpty()) {
        println("Entrada no valida. Intente de nuevo.")
        return
    }

    val tiempoEjecucion = measureTimeMillis {
        val resultado = bubbleSort(entrada.toMutableList())
        println("Lista ordenada usando Bubble Sort: $resultado")
    }
    println("Tiempo de ejecucion: ${tiempoEjecucion}ms")
}

fun ordenarQuickSort() {
    print("Ingrese una lista de numeros separados por comas: ")
    val entrada = readLine()?.split(",")?.mapNotNull { it.trim().toIntOrNull() } ?: listOf()
    if (entrada.isEmpty()) {
        println("Entrada no valida. Intente de nuevo.")
        return
    }

    val tiempoEjecucion = measureTimeMillis {
        val resultado = quickSort(entrada)
        println("Lista ordenada usando Quick Sort: $resultado")
    }
    println("Tiempo de ejecucion: ${tiempoEjecucion}ms")
}

fun calcularFactorial() {
    print("Ingrese un numero entero positivo: ")
    val numero = readLine()?.toIntOrNull()
    if (numero == null || numero < 0) {
        println("Entrada no valida. Intente con un numero positivo.")
        return
    }

    val resultado = factorial(numero)
    println("El factorial de $numero es: $resultado")
}

fun resolverTorresDeHanoi() {
    print("Ingrese el numero de discos: ")
    val numDiscos = readLine()?.toIntOrNull()
    if (numDiscos == null || numDiscos <= 0) {
        println("Entrada no valida. Intente con un numero mayor a 0.")
        return
    }

    println("Solucion para $numDiscos discos:")
    contadorPasos = 0  // Reiniciamos el contador antes de comenzar
    hanoi(numDiscos, 'A', 'C', 'B')
    println("\nTotal de pasos necesarios: $contadorPasos")
}

fun bubbleSort(lista: MutableList<Int>): List<Int> {
    for (i in lista.indices) {
        for (j in 0 until lista.size - i - 1) {
            if (lista[j] > lista[j + 1]) {
                val temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp
            }
        }
    }
    return lista
}

fun quickSort(lista: List<Int>): List<Int> {
    if (lista.size <= 1) return lista
    val pivot = lista[lista.size / 2]
    val menores = lista.filter { it < pivot }
    val iguales = lista.filter { it == pivot }
    val mayores = lista.filter { it > pivot }
    return quickSort(menores) + iguales + quickSort(mayores)
}

fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun hanoi(n: Int, origen: Char, destino: Char, auxiliar: Char) {
    if (n == 1) {
        contadorPasos++
        println("Paso $contadorPasos: Mover disco 1 de Torre $origen a Torre $destino")
        return
    }
    hanoi(n - 1, origen, auxiliar, destino)
    contadorPasos++
    println("Paso $contadorPasos: Mover disco $n de Torre $origen a Torre $destino")
    hanoi(n - 1, auxiliar, destino, origen)
}