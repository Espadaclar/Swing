
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Toolkit;
/**
 * @version 17 / 06 / 2017)
 */
public class MiMarco extends JFrame
{
    public MiMarco(){
        //----------tamaño de la pantalla.
        // setSize(500, 300);
        //-----------pone situacion de la pantalla y tamanno.
        setBounds(500, 250, 550,250);
         //-------titulo de la ventana
        setTitle("Mi Ventana");
        //---------se redimensiona con el puntero
        //setResizable(true);
        //----------abrir el frame a pantalla completa.
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        
    }
    
    
}
