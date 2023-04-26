package vista;

import controller.Controller;
import utils.Utils;

import javax.swing.*;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controller controller;
    private JButton botonIniciar = new JButton("Iniciar");

    public Ventana(){
        this.setSize(Utils.sizeVentana,Utils.sizeVentana);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Flyweight");
        this.initComponents();
    }

    private void initComponents() {
        this.add(panel);
        this.add(botonIniciar);
        this.botonIniciar.setBounds(250,530,100,30);
    }

    public void setController(Controller controller){
        this.controller = controller;
        this.botonIniciar.addActionListener(controller);
    }

    public Panel getPanel() {
        return panel;
    }

    public JButton getBotonIniciar() {
        return botonIniciar;
    }
}
