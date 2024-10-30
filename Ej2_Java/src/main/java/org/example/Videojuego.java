package org.example;

public class Videojuego {
    String titulo;
    String plataforma;
    String horasJugadas;

    public Videojuego(String titulo, String plataforma, String horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + ", Plataforma: " + plataforma + ", Horas Jugadas: " + horasJugadas);
    }

}
