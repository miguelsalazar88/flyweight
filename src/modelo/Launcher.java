package modelo;

import controller.Controller;
import vista.Ventana;

import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        Ventana v = new Ventana();
        Modelo m = new Modelo(v, 100000);
        Controller c = new Controller(v,m);
    }

}
