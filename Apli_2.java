import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.*;
/**
 * )
 */
public class Apli_2
{
    public static void main(String[] args){
        
        CreandoMarcoCentral marcoCentrado = new CreandoMarcoCentral();
        marcoCentrado.setVisible(true);
        //OBLIGATORIO PONER LO QUE QUEREMOS HACER CON LA VENTANA AL FINAL.
        marcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
