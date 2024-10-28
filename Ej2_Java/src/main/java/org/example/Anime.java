package org.example;

/**
 * 13. Clase Anime sencilla
 * Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
 * usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
 */
public class Anime {

    String nombre;
    int episodios;
    String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEpisodios: " + episodios + "\nGenero: " + genero);

    }
}
