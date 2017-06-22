import javax.swing.*;
import java.awt.*;
/**
 * para poder crear ventanas o marcos o frames ha de herdar de la clase JFrame.
 */
public class MarcoConDibujo extends JFrame
{
    /**
     * Constructor for objects of class MarcoConDibujo
     */
    public MarcoConDibujo()
    {
        setBounds(50, 100, 899, 700);
        setTitle("Prueba de dibujo");
        setVisible(true);
        
        LaminaDibujo lamina =  new LaminaDibujo();
        add(lamina);
        
        //para poner mi icono en la ventana.
        Toolkit marco = Toolkit.getDefaultToolkit();
        Image icono = marco.getImage("icono2.gif");
        setIconImage(icono);
    }
}
