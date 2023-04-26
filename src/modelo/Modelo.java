package modelo;

import vista.Ventana;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Modelo {

    private Ventana vista;
    private ArrayList<Personaje> arreglo = new ArrayList<Personaje>();

    public Modelo(Ventana vista, int num) throws IOException {
        this.vista = vista;
        this.generarPersonajes(num);
    }

    public void generarPersonajes(int num) throws IOException {
        for (int i =0; i<num; i++){
            ImagenSingleton imagen = ImagenSingleton.getInstance();
            Personaje p = new Personaje(imagen.getImagen());
            this.arreglo.add(p);
        }
        this.vista.getPanel().setArregloPanel(this.arreglo);
    }
}
