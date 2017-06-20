import javax.swing.*;
import java.awt.*;
/**
 * Crea un frame y anade una lamina donde poder dibujar, escribir, poner botones etc
 */
public class EscribiendoEnMarco extends JFrame{
    public EscribiendoEnMarco() {
        setBounds(50, 50, 700,250);
        setTitle("Primer Texto");
        setVisible(true);
        //instanciamos la clase Lamina para anadirla a la ventana.
        Lamina miLamina = new Lamina();
        //la anadimos.
        add(miLamina);
        
        //cambia el icono de java.
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("icono2.gif");
        //Le decimos que establezca este icono.
        setIconImage(miIcono);
    }
    
}
