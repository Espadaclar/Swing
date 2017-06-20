import javax.swing.*;
import java.awt.*;

/**
 * CLASE PARA PONER UNA LAMINA O CRISTAL TRANSPARENTE EN LA VENTANA PARA ESCRIBIR, DIBUJAR ETC.
 */
public class Lamina extends JPanel{
    /**
     * Sobreescribimos el mt paintComponent(Graphics g) que está declarado en la clase JComponent
     * que a su vez hereda de JPanel, paintComponent() se encarga de hacer unos dibujos por defecto, al 
     * sobreescribirlo lo que hacemos es decirle que ademas de realizar su trabajo, escriba o realice lo
     * que nosotros le mandemos.
     * IMPORTANTE,  -------- es decirle al mt, que antes de que realice el trabajo que le ordenamos, realice
     * el trabajo que ya tiene por defecto, PARA ELLO INVOCAMOS AL MT. super.paintComponent(g);
     */
    public void paintComponent(Graphics g){
        //Llama al mt 'paintComponent(g)' para que haga su trabajo.
        super.paintComponent(g);
        //y demas de eso, realiza el trabajo que nosotros le ordenamos.
        g.drawString("Estamos aprendiendo Swing", 30, 30);
    }
}
