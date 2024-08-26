package expresseatapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class icono {
     public static void establecerIcono(JFrame frame) {
        ImageIcon icono = new ImageIcon(icono.class.getResource("/imagenes/logo.jpg"));
        frame.setIconImage(icono.getImage());
    }
}
