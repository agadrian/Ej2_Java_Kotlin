package org.example

class InventarioVideojuegos {
    private val videojuegos = mutableListOf<Videojuego>()

    fun addJuegos(juego: Videojuego) {
        if (videojuegos.contains(juego)) {
            println("Ya existe este juego")
        }else{
            videojuegos.add(juego)
            println("Juego añadido(${juego.titulo})")
        }
    }

    fun deleteJuegos(juego: Videojuego) {
        if (videojuegos.contains(juego)) {
            videojuegos.remove(juego)
            println("Juego eliminado correctamente(${juego.titulo})")
        }else{
            println("No existe este juego")
        }
    }

    fun mostrarJuegos(){
        if (videojuegos.size > 0) {
            println("Listado de videojuegos:")
            videojuegos.forEachIndexed() { index, juego ->
                println("${index+1} - $juego")
            }
        }else{
            println("No hay videojuegos en la lista")
        }

    }
}