package modelo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagenSingleton {
    private static ImagenSingleton instance = null;
    private BufferedImage imagen;


    private ImagenSingleton() throws IOException {
        this.imagen = ImageIO.read(new File("/home/miguel/Desktop/Flyweight/src/images/pngegg.png"));
    }
    public static ImagenSingleton getInstance() throws IOException {

        if(instance == null){
            instance = new ImagenSingleton();

        }

            return instance;

    }

    public BufferedImage getImagen() {
        return imagen;
    }
}
