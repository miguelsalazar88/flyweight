package vista;

import modelo.Personaje;
import utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel{

    private ArrayList<Personaje> arregloPanel = new ArrayList<Personaje>();

    public Panel(){

        this.setVisible(true);
        this.setSize(Utils.sizePanel,Utils.sizePanel);
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Personaje p: arregloPanel) {
            g.drawImage(p.getImagen(), p.getX(),p.getY(), null);
        }

    }

    public void setArregloPanel(ArrayList<Personaje> arregloPanel) {
        this.arregloPanel = arregloPanel;
    }
}
