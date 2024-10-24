package org.example


/**
 * Clase que representa el menú principal de la aplicación.
 */
class Menu(private val ejercicios: Ejercicios) {

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private fun pedirOpcion(min: Int, max: Int): Int {
        var opcion: Int

        do {
            print("Introduce opcion -> ")
            opcion = readln().toIntOrNull() ?: -1

            if (opcion == -1) {
                println("Opcion no valida. ")
            } else if (opcion !in min..max) {
                println("Opcion fuera de rango. ")
            }
        } while (opcion !in min..max)
        return opcion
    }


    /**
     * Función que muestra y gestiona el menú principal.
     */
    fun menuPrincipal() {

        var opc: Int
        do {
            imprimirMenuPrincipal()
            opc = pedirOpcion(1, 15)

            when (opc) {
                1 -> ejercicios.ejercicio1()
                2 -> ejercicios.ejercicio2()
                3 -> ejercicios.ejercicio3()
                4 -> ejercicios.ejercicio4()
                5 -> ejercicios.ejercicio5()
                6 -> ejercicios.ejercicio6()
                7 -> ejercicios.ejercicio7()
                8 -> ejercicios.ejercicio8()
                9 -> ejercicios.ejercicio9()
                10 -> ejercicios.ejercicio10()
                11 -> ejercicios.ejercicio11()
                12 -> ejercicios.ejercicio12()
                13 -> ejercicios.ejercicio13()
                14 -> ejercicios.ejercicio14()
                15 -> println("Saliendo del programa...")
            }
        } while (opc != 15)
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private fun imprimirMenuPrincipal() {
        //println("\n\nMenu Ejercicios")
        println("\n\nEjercicios 1-14 (15 para Salir)")
        //println("15.- Salir")
    }


}


