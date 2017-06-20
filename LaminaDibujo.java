/**
 * Crea una lamina para dibujar.
 */
import javax.swing.*;
import java.awt.*;
public class LaminaDibujo extends JPanel
{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //-----------dibuja un rectangulo, con la esquina derechaSuperior en ( 90x/120y) y tamao 300/59
        //g.drawRect(90, 120, 300, 59);
        //------ dibuja una linea, punto inicio (x/y) punto final (x/y)
        //g.drawLine(123, 222, 856, 442);
        //---------dibuja una arco.
        g.drawArc(53, 55, 100, 400, 90, 200);
    }
}