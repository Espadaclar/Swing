/**
 * Crea una lamina para dibujar.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class LaminaDibujo extends JPanel
{
    public void paintComponent(Graphics g){
        double LARGO_RECTANGULO = 400.33;
        double ALTO_RECTANGULO = 250;
        
        super.paintComponent(g);
        // --------------- FIGURAS GEOMETRICAS CON LA BIBLIOTECA Java 2D.
        // --- 1º Necesitamos instanciar la clase 2D que queramos crear, en este caso un Rectangle, para ello hacemos una
        //        refundicion, un casting, con el objeto pasado en el parametro (el objeto Graphics g pasa a ser Graphics2D g2).
        Graphics2D g2 = (Graphics2D) g;

        //       Ocurre que la clase Rectangle2D es abstracta y no se puede instanciar. Sin embargo tenemos su clase interna
        //       Rectangle2D.Double, que hereda de Rectangle2D y sí se puede instanciar, ademas IMPLEMENTA LA INTERFACE Shape.
        //      RECORDEMOS:¡¡  Persona Juan = new Empleado(String name, int edad);(Empleado hereda de Persona)
       Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, LARGO_RECTANGULO, ALTO_RECTANGULO);
                
        // ----2º Crear un objeto de tipo Graphics2D, para utilizar su mt 'draw(Shape s)' el cual nos pedira una
        //         una instacia de un objeto que implementa la interface 'Shape' (ya lo hemos creado es g2)
        
       g2.draw(rectangulo); // tenemos que pasarle como parametro el objeto que implemente la interface Shape, como la clase 
                        // Rectangle2D implementa la interface Shape, muestro objeto rectangulo implementara esa interface.
        
        // ----------------------------------CREA UNA ELIPSE.
       Ellipse2D elipse = new Ellipse2D.Double();
       //utiliza setFrame(); para mostrar el rectangulo ya hecho. sino seria: Ellipse2D elipse = new Ellipse2D.Double(.., .., ..,.,);
       elipse.setFrame(rectangulo);
       g2.draw(elipse);
       
       // ---------------------------------- CREA UNA LINEA, INSTANCIADO EL OBJETO Line.Double() como parametro.
        g2.draw(new Line2D.Double(100, 100, 500.33, 350));
       
        // ---------------------------------- CREA UNA CIRCUNFERENCIA.
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = Math.sqrt(   Math.pow( (LARGO_RECTANGULO/2),  2) +  Math.pow( (ALTO_RECTANGULO/2),  2)   );
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);
        g2.draw(circulo);
        
        // -------------- CODIGO PARA **************   FIGURAS GEOMETRICAS SENCILLAS.   *****************
        //-----------dibuja un rectangulo, con la esquina derechaSuperior en ( 90x/120y) y tamao 300/59
        //g.drawRect(90, 120, 300, 59);
        //------ dibuja una linea, punto inicio (x/y) punto final (x/y)
        //g.drawLine(123, 222, 856, 442);
        //---------dibuja una arco.
        //g.drawArc(53, 55, 100, 400, 90, 200);
    }
}