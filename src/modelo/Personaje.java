package modelo;

import utils.Utils;

import java.awt.image.BufferedImage;

public class Personaje {

    private BufferedImage imagen;
    private int x;
    private int y;

    public Personaje(BufferedImage imagen) {
        this.imagen = imagen;
        this.x = Utils.rnd.nextInt(Utils.sizePanel);
        this.y = Utils.rnd.nextInt(Utils.sizePanel);
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
