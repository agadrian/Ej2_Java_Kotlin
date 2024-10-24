package org.example

class Anime(private val nombre: String, private val episodios: String, private val genero: String) {

    override fun toString(): String {
        return "Info anime -> Nombre: $nombre, Episodio: $episodios, Genero: $genero"
    }
}