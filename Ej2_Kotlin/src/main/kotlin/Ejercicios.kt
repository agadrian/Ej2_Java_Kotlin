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
        println("** Ejercicio 1 **")
        print("Introduce nombre: ")
        val nombre = readln()
        print("Hola, $nombre")
    }


    /**
     * 2. Número par o impar
     * Pedir un número al usuario e indicar si es par o impar.
     */
    fun ejercicio2(){
        println("** Ejercicio 2 **")
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
        println("** Ejercicio 3 **")
        print("Introduce el radio de un circulo: ")
        val radio = readln().toFloatOrNull()
        if (radio != null) {
            val area = PI * (radio * radio)
            println("Area de un circulo de $radio de radio: ${"%.2f".format(area)}")
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
        println("** Ejercicio 4 **")
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
        println("** Ejercicio 5 **")
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
        println("** Ejercicio 6 **")
        var num = 0
        for (i in 0..<100){
            num += (i+1)
        }
        println("Suma total (1-100) -> $num")
    }

    /**
     * 7. Reverso de una cadena
     * Pedir una cadena al usuario e imprimirla al revés.
     */
    fun ejercicio7(){
        println("** Ejercicio 7 **")
        print("Introduce una cadena de texto: ")
        println(readln().reversed())
    }


    /**
     * 8. Contador de vocales
     * Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
     * 9
     */
    fun ejercicio8(){
        println("** Ejercicio 8 **")
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
        println("** Ejercicio 9 **")
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
        println("** Ejercicio 10 **")
        print("Que quieres hacer\n1- Celsisus a Fahr\n2- Fahr a Celsius: ")
        val elecc = readln().toIntOrNull()
        if (elecc != null && elecc in 1..2) {
           when (elecc) {
               1 -> celsisuToFah()
               2 -> fahToCelsius()
           }
        }else{
            println("Debes elegir 1,2")
        }

    }

    private fun celsisuToFah(){
        print("Introduce temp en celsius: ")
        val temp = readln().toDoubleOrNull()
        if (temp != null) {
            val res = (temp * 9 / 5) + 32
            print("$temp Celsius en Fahrenheit -> $res")
        }else{
            println("Debes introducir un valor numerico")
        }
    }

    private fun fahToCelsius(){
        print("Introduce temp en Fahrenheit: ")
        val temp = readln().toDoubleOrNull()
        if (temp != null) {
            val res = (temp - 32) * 5/9
            print("$temp Fahrenheit en Celsius -> ${"%.2f".format(res)}")
        }else{
            println("Debes introducir un valor numerico")
        }
    }


    /**
     * 11. Fibonacci
     * Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
     * número N lo ingresa el usuario).
     */
    fun ejercicio11(){
        println("** Ejercicio 11 **")
        print("Introduce numero: ")
        val num = readln().toIntOrNull()
        if (num == null) {
            println("Debes introducir un valor numerico")
            return
        }

        var n1 = 0
        var n2 = 1

        println("Los primeros $num numeros de Fibonacci son: ")
        for (i in 1..num){
            print("$n1 ")

            val n3 = n1 + n2
            n1 = n2
            n2 = n3
        }
    }

    /**
     * 12. Inversión de un número
     * Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
     * Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
     */
    fun ejercicio12(){
        println("** Ejercicio 12 **")
        print("Introduce numero para darle la vuelta: ")
        val num = readln().toIntOrNull()
        if (num == null) {
            println("Debes introducir un valor numerico")
            return
        }

        println(num.toString().reversed())
    }


    /**
     * 13. Clase Anime sencilla
     * Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
     * usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
     */
    fun ejercicio13(){
        println("** Ejercicio 13 **")
        print("Datos creacion clase anime\nIntroduce nombre: ")
        val nombre = readln()

        print("Introduce episodios: ")
        val episodios = readln()

        print("Introduce genero: ")
        val genero = readln()

        val anime = Anime(nombre, episodios, genero)
        println(anime)
    }

    /**
     * 14. Inventario de videojuegos
     * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
     * usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
     * eliminar y mostrar los videojuegos del inventario.
     */
    fun ejercicio14(){
        println("** Ejercicio 14 **")
        val inventario = InventarioVideojuegos()

        val juego1 = Videojuego("COD", "PS3", 2500)
        val juego2 = Videojuego("F1", "PC", 300)

        val datos = pedirDatos()
        val juego3 = Videojuego(datos[0], datos[1], datos[2].toInt())



        inventario.addJuegos(juego1)
        inventario.addJuegos(juego2)
        inventario.addJuegos(juego3)

        inventario.mostrarJuegos()

        inventario.deleteJuegos(juego1)
        inventario.deleteJuegos(juego2)

        inventario.mostrarJuegos()

    }

    private fun pedirDatos(): List<String>{
        print("Introduce datos juego\nTitulo del juego: ")
        val titulo = readln()
        print("Plataforma del juego: ")
        val plataforma = readln()
        print("Horas jugadas al juego: ")
        val horas = readln().toIntOrNull() ?: 0

        return listOf(titulo, plataforma, horas.toString())
    }
}

