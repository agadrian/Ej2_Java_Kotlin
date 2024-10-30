package org.example;

import java.util.ArrayList;

public class InventarioVideojuegos {

    ArrayList<Videojuego> videojuegos = new ArrayList<>();

    public void addVideojuego(Videojuego videojuego) {
        if (!videojuegos.contains(videojuego)) {
            videojuegos.add(videojuego);
            System.out.println("Videojuego " + videojuego.titulo + " añadido correctamente");
        }else{
            System.out.println("El Videojuego " + videojuego.titulo + " ya existe en la lista");
        }
    }

    public void removeVideojuego(Videojuego videojuego) {
        if (videojuegos.contains(videojuego)) {
            videojuegos.remove(videojuego);
            System.out.println("Videojuego " + videojuego.titulo + " eliminado del inventario correctamente");
        }else{
            System.out.println("El Videojuego " + videojuego.titulo + " no existe en la lista");
        }
    }

    public void mostrarVideojuegos() {
        if (videojuegos.size() > 0) {
            System.out.println("Listado de videojuegos: ");
            videojuegos.forEach(videojuego -> {
                videojuego.mostrarInfo();
            });
        }else{
            System.out.println("No hay videojuegos que mostrar");
        }

    }
}
