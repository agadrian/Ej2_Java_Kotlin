package org.example
import java.lang.Math.PI
import kotlin.math.sqrt
import kotlin.random.Random


class Ejercicios {



    /**
     * 1. Saludo personalizado
     * Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
     * Juan!"
     */
    fun ejercicio1(){
        print("Introduce nombre: ")
        val nombre = readln()
        print("Hola, $nombre")
    }


    /**
     * 2. Número par o impar
     * Pedir un número al usuario e indicar si es par o impar.
     */
    fun ejercicio2(){
        print("Introduce un numero: ")
        val num = readln().toIntOrNull()
        if (num != null) {
            if (num % 2 == 0) println("Numero $num es par") else println("Numero $num es impar")
        }else{
            println("Debes introducir un valor numerico entero!!")
        }
    }

    /**
     * 3. Cálculo del área de un círculo
     * Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2)
     */
    fun ejercicio3(){
        print("Introduce el radio de un circulo: ")
        val radio = readln().toFloatOrNull()
        if (radio != null) {
            val area = PI * (radio * radio)
            println("Area de un circulo de $radio de radio: $area")
        }else{
            println("Debes introducir un valor numerico!!")
        }
    }

    /**
     * 4. Generador de números aleatorios
     * Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
     * El programa indicará si el número es mayor o menor al ingresado.
     * Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
     */
    fun ejercicio4(){
        val randNum = Random.nextInt(0,100)
        print("Introduce numero: ")
        var intentos = 0

        do {
            val num = readln().toIntOrNull()
            if (num==null){
                println("El numero debe ser un valor numerico entero!!")
                continue
            }

            intentos++

            when {
                num < randNum -> println("Numero oculto es mayor...")
                randNum < num -> println("Numero oculto es menor...")
            }

        }while (num != randNum)

        println("Has acertado en $intentos intentos!")
    }

    /**
     * 5. Tabla de multiplicar
     * Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
     */
    fun ejercicio5(){
        print("Introduce un numero: ")
        val num = readln().toFloatOrNull()

        if (num != null) {
            for (i in 0..<10){
                println("$num x ${i+1} -> ${num*(i+1)}")
            }
        }else{
            println("Debes introducir un valor numerico!!")
        }
    }


    /**
     * 6. Sumar números del 1 al 100
     * Crear un programa que sume todos los números del 1 al 100.
     */
    fun ejercicio6(){
        var num = 0
        for (i in 0..<100){
            println(num)
            num += (i+1)
        }
        println("Suma total (1-100) -> $num")
    }

    /**
     * 7. Reverso de una cadena
     * Pedir una cadena al usuario e imprimirla al revés.
     */
    fun ejercicio7(){
        print("Introduce una cadena de texto: ")
        println(readln().reversed())
    }


    /**
     * 8. Contador de vocales
     * Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
     * 9
     */
    fun ejercicio8(){
        val vocales = mutableMapOf<Char, Int>(
            'a' to 0,
            'e' to 0,
            'i' to 0,
            'o' to 0,
            'u' to 0
        )

        print("Introduce una frase: ")
        val frase = readln().toLowerCase()

        for (i in frase){
            if (i in vocales.keys){
                vocales[i] = vocales[i]!! + 1
            }
        }

        println("Cantidad de vocales en la frase: $frase")
        for ((vocal, cant) in vocales){
            println("$vocal: $cant")
        }
    }


    /**
     * 9. Números primos
     * Pedir un número al usuario y verificar si es un número primo.
     */
    fun ejercicio9(){
        print("Introduce un numero: ")
        val num = readln().toIntOrNull()
        if (num != null) {
            if (esPrimo(num)){
                println("Es primo")
            }else{
                println("No es primo")
            }
        }

    }

    private fun esPrimo(num: Int): Boolean{
        if (num < 2) return false
        val sqrt = sqrt(num.toDouble()).toInt()
        for (i in 2..sqrt) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }


    /**
     * 10. Conversión de temperaturas
     * Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
     * viceversa. (C = (F - 32) * 5/9, F = C * 9/5 + 32).
     */
    fun ejercicio10(){
        
    }
}