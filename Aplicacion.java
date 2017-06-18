import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.*;
/**
 * @version 17 / 06 / 2017)
 */
public class Aplicacion
{
    public static void main(String[] args){
        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
       
        //obligado indicar lo que hacer al cerrar la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
