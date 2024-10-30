package org.example;

import java.util.*;
import java.io.IOException;
import java.util.Random;



public class Ejercicios {

    Scanner scanner = new Scanner(System.in);  // Crear el objeto Scanner
    Random random = new Random();

    /**
     * 1. Saludo personalizado
     * Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
     * Juan!".
     */
    public void ejercicio1() {


        System.out.print("Ingresa nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);
    }

    /**
     * 2. Número par o impar
     * Pedir un número al usuario e indicar si es par o impar.
     * @throws IOException
     */
    public void ejercicio2()
    {
        System.out.print("Introduce numero para comprobar par o impar: ");
        Double numero = scanner.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }

    /**
     * 3. Cálculo del área de un círculo
     * Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
     */
    public void ejercicio3(){
        System.out.print("Introduce radio para calcular el area de un circulo: ");

        try{
            Double numero = scanner.nextDouble();
            Double radio = Math.PI * (numero * numero);
            System.out.println("El area de un circulo de " + numero + " de radio es: " + String.format("%.2f", radio));

        }catch (Exception e){
            System.out.println("Debes introducir un valor numerico. Error: " + e);
        }
    }

    /**
     * 4. Generador de números aleatorios
     * Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
     * El programa indicará si el número es mayor o menor al ingresado.
     * Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while
     */
    public void ejercicio4() {
        int numRandom = random.nextInt(0,100);
        System.out.print("Introduce numero para adivinar: ");
        try{
            int num;
            int cont = 0;

            do {
                num = scanner.nextInt();
                cont++;
                if(num < numRandom){
                    System.out.println("El numero oculto es mayor");
                }else{
                    System.out.println("El numero oculto es menor");
                }

            }while (num != numRandom);

            System.out.println("Bingo!!. Num de intentos: " + cont);

        }catch (Exception e){
            System.out.println("Debes introducir un valor numerico. Error: " + e);
        }
    }

    /**
     * 5. Tabla de multiplicar
     * Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
     */
    public void ejercicio5() {
        System.out.print("Introduce numero: ");

        try{
            double num = scanner.nextDouble();
            for (int i = 0; i < 10; i++) {
                System.out.println(num + " x " + (i+1) + " --> " + (num * (i+1)));
            }
        }catch (Exception e){
            System.out.println("Debes introducir un valor numerico. Error: " + e);
        }
    }

    /**
     * 6. Sumar números del 1 al 100
     * Crear un programa que sume todos los números del 1 al 100.
     */
    public void ejercicio6() {
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            suma += (i+1);
        }

        System.out.println("Suma de los numeros 1-100: " + suma);
    }


    /**
     * 7. Reverso de una cadena
     * Pedir una cadena al usuario e imprimirla al revés
     */
    public void ejercicio7() {
        System.out.print("Introduce una cadena para darle la vuelta: ");
        String cadena = scanner.nextLine();

        String reversed = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversed += cadena.charAt(i);
        }

        System.out.println("Cadena reversed: " + reversed);
    }

    /**
     * 8. Contador de vocales
     * Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
     */
    public void ejercicio8() {
        Map<String, Integer> vocales = new HashMap<>();

        vocales.put("a", 0);
        vocales.put("e", 0);
        vocales.put("i", 0);
        vocales.put("o", 0);
        vocales.put("u", 0);

        System.out.print("Introduce una frase para contar sus vocales: ");
        String frase = scanner.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            String letra = String.valueOf(frase.charAt(i)); // Obtiene el valor de i

            if (vocales.containsKey(letra)) {
                vocales.put(letra, vocales.get(letra) + 1); //vocales.get(letra) obtiene el valor de la clave letra
            }
        }

        System.out.println("Cantidad de vocales en la frase "+ frase);

        // Recorrer todas las entradas de un dicc
        for(Map.Entry<String, Integer> entrada : vocales.entrySet()){ // Entrada es cada par clave-valor
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    /**
     * 9. Números primos
     * Pedir un número al usuario y verificar si es un número primo.
     */
    public void ejercicio9() {
        System.out.print("Introduce número a comprobar primo:");
        int numero = scanner.nextInt();

        if (checkPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        }else{
            System.out.println("El numero " + numero + " no es primo");
        }
    }

    public boolean checkPrimo(int num){

        // Menor o igual a 1 no es primo
        if (num <= 1){
            return false;
        }

        // 2 es primo
        if (num == 2){
            return true;
        }

        // si es mayor que 2 y par, no es primo
        if (num % 2 == 0){
            return false;
        }

        // Ddivisores desde 3 hasta la raíz cuadrada de n
        for (int i = 3; i * i <= num; i += 2) { // Solo numeros impares
            if (num % i == 0) {
                return false; // Si num es divisible por i, no es primo
            }
        }

        return true;
    }

    /**
     * 10. Conversión de temperaturas
     * Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
     * viceversa. (C = (F - 32) * 5/9, F = C * 9/5 + 32).
     */
    public void ejercicio10() {

        System.out.println("Elige una opcion:\n1 - De Celsius a Fahrenheit\n2 - De Fahrenheit a Celsius");

        try{
            int opc = scanner.nextInt();

            if (opc != 1 && opc != 2){
                throw new Exception();
            }

            if (opc == 1) celToFahrenheit();
            if (opc == 2) fahrenheitToCelsius();


        }catch (Exception e){
            System.out.println("Debes elegir entre las opciones disponibles");
        }


    }

    public void celToFahrenheit() {
        System.out.print("Introduce grados celsius: ");
        try{
            double cel = scanner.nextDouble();
            double fahrenheit = (cel * 9/5) + 32;
            System.out.println(cel + " Celsius son -> " + String.format("%.2f", fahrenheit) + " Fahrenheit");

        }catch (Exception e){
            System.out.println("Debe introducir un valor numerico. Error: " + e);
        }
    }


    public void fahrenheitToCelsius() {
        System.out.print("Introduce grados fahrenheit: ");
        try{
            double fah = scanner.nextDouble();
            double celsius = (fah - 32) * 5/9;
            System.out.println(fah + " Fahrenheit son -> " + String.format("%.2f",celsius) + " Celsius");

        }catch (Exception e){
            System.out.println("Debe introducir un valor numerico. Error: " + e);
        }
    }

    /**
     * 11. Fibonacci
     * Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
     * número N lo ingresa el usuario)
     */
    public void ejercicio11() {

        System.out.print("Introduce cantidad de números de la secuencia de Fibonacci: ");

        try{
            int num = scanner.nextInt();
            int x = 0;
            int y = 1;

            for (int i = 1; i <= num; i++) {
                System.out.println(x + " ");

                int z = x + y; // Suma de los dos numeros para obtener el tercero
                //Intercambiamos los valores del 1 al 2, y del 2 al 3
                x = y;
                y = z;
            }
        }catch (Exception e){
            System.out.println("Debes introducir un valor numerico. Error: " + e);
        }
    }

    /**
     * 12. Inversión de un número
     * Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
     * Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
     */
    public void ejercicio12(){
        System.out.print("Introduce numero a invertir: ");

        try {
            int numero = scanner.nextInt();

            String reversed = "";
            for (int i = String.valueOf(numero).length() - 1; i >= 0; i--) {
                reversed += String.valueOf(numero).charAt(i);
            }

            System.out.println("Numero invertido: " + reversed);
        }catch (Exception e){
            System.out.println("Debe introducir un entero!");
        }
    }

    /**
     * 13. Clase Anime sencilla
     * Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
     * usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
     */
    public void ejercicio13(){
        System.out.println("Introduce datos del anime: ");
        System.out.print("Nombre: ");
        String nombre = scanner.next();

        System.out.print("Episodios: ");
        String episodios = scanner.next();

        System.out.print("Genero: ");
        String genero = scanner.next();

        Anime anime = new Anime(nombre, episodios, genero);
        System.out.println("\nInformacion del anime: ");
        anime.mostrarInfo();
    }


    /**
     * 14. Inventario de videojuegos
     * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
     * usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
     * eliminar y mostrar los videojuegos del inventario
     */
    public void ejercicio14(){
        InventarioVideojuegos inventarioJuegos = new InventarioVideojuegos();

        Videojuego juego1 = new Videojuego("COD", "PS4", "40");
        Videojuego juego2 = new Videojuego("FIFA", "PS4", "799");

        inventarioJuegos.addVideojuego(juego1);
        inventarioJuegos.addVideojuego(juego2);

        System.out.println("Introduce datos videojuego: ");
        System.out.print("Titulo: ");
        String titulo = scanner.next();

        System.out.print("Plataforma: ");
        String plataforma = scanner.next();

        System.out.print("Horas jugadadas: ");
        String horas = scanner.next();

        Videojuego juego3 = new Videojuego(titulo, plataforma, horas);
        inventarioJuegos.addVideojuego(juego3);

        inventarioJuegos.mostrarVideojuegos();
        inventarioJuegos.removeVideojuego(juego1);
        inventarioJuegos.mostrarVideojuegos();

    }

}
