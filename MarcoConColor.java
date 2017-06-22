import javax.swing.*;
import java.awt.*;
import java.util.Random;
/**
 * para poder crear ventanas o marcos o frames ha de herdar de la clase JFrame.
 */
public class MarcoConColor extends JFrame
{
    /**
     * Constructor for objects of class MarcoConDibujo
     */
    public MarcoConColor()
    {
        Random ale = new Random(); // -- PARA COLORES ALEATORIOS.
        setBounds(50, 100, 899, 700);
        setTitle("Prueba de dibujo con color. Apli_5");
        setVisible(true);
        
        LaminaColoreada lamina =  new LaminaColoreada();
        // -------- establece el color de fondo de la lamina.
        lamina.setBackground(new Color(ale.nextInt(255), ale.nextInt(255), ale.nextInt(255)) );
        // ------------ INSTRUCCION PARA DAR EL COLOR DE FONDO QUE EL SISTEMA TRAE POR DEFECTO DEL SISTEMA
        //lamina.setBackground(SystemColor.window);
        add(lamina);
        
        //para poner mi icono en la ventana.
        Toolkit marco = Toolkit.getDefaultToolkit();
        Image icono = marco.getImage("icono2.gif");
        setIconImage(icono);
    }
}
