package org.example;

import java.util.Scanner;

/**
 * Clase que representa el menú principal de la aplicación.
 */
public class Menu {
    Ejercicios ejercicios;
    Scanner scanner;

    public Menu(Ejercicios ejercicios) {
        this.ejercicios = ejercicios;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private int pedirOpcion(int min, int max) {
        int opcion = -1;

        do {
            System.out.print("Introduce opción -> ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida.");
                opcion = -1;
            }

            if (opcion < min || opcion > max) {
                System.out.println("Opción fuera de rango.");
            }
        } while (opcion < min || opcion > max);

        return opcion;
    }

    /**
     * Función que muestra y gestiona el menú principal.
     */
    public void menuPrincipal() {
        int opc;

        do {
            imprimirMenuPrincipal();
            opc = pedirOpcion(1, 15);

            switch (opc) {
                case 1 -> ejercicios.ejercicio1();
                case 2 -> ejercicios.ejercicio2();
                case 3 -> ejercicios.ejercicio3();
                case 4 -> ejercicios.ejercicio4();
                case 5 -> ejercicios.ejercicio5();
                case 6 -> ejercicios.ejercicio6();
                case 7 -> ejercicios.ejercicio7();
                case 8 -> ejercicios.ejercicio8();
                case 9 -> ejercicios.ejercicio9();
                case 10 -> ejercicios.ejercicio10();
                case 11 -> ejercicios.ejercicio11();
                case 12 -> ejercicios.ejercicio12();
                case 13 -> ejercicios.ejercicio13();
                case 14 -> ejercicios.ejercicio14();
                case 15 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no válida."); // En caso de error
            }
        } while (opc != 15);
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private void imprimirMenuPrincipal() {
        System.out.println("\n\nEjercicios 1-14 (15 para Salir)");
    }
}
