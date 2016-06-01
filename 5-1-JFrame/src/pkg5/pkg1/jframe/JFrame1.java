package pkg5.pkg1.jframe;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.*;

public class JFrame1 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Título de la ventana");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());
        
        JButton boton1 = new JButton("Aceptar");
        ventana.add(boton1, BorderLayout.NORTH);
        
        JButton boton2 = new JButton("Cancelar");
        ventana.add(boton2, BorderLayout.CENTER);
        
        JButton boton3 = new JButton("Boton 3");
        ventana.add(boton3, BorderLayout.SOUTH);
        
        JButton boton4 = new JButton("Boton 4");
        ventana.add(boton4, BorderLayout.WEST);
        
        JButton boton5 = new JButton("Boton 5");
        ventana.add(boton5, BorderLayout.EAST);
        

        ventana.setVisible(true);
        
    }
}
