import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
/**
 * Clase para crear una ventana.
 */
public class MarcoParaImagen extends JFrame
{
    public MarcoParaImagen ()
    {
        setBounds(150, 150, 950, 550);
        setTitle("Marco con imagen");
        
        LaminaConImagen imaG = new LaminaConImagen();
        add(imaG);
        
        Toolkit ventana = Toolkit.getDefaultToolkit();
        Image icono = ventana.getImage("icono2.gif");
        setIconImage(icono);
    }
}
