package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Ejercicios ejcs = new Ejercicios();
        Menu menu = new Menu(ejcs);
        menu.menuPrincipal();
    }
}