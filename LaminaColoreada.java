/**
 * Crea una lamina para dibujar figuras, y utiliza la clase Color para dar dar color
 * para ello sustitulle el mt draw() que dibuja el entorno de las figuras por el mt
 * fill(Shape s) que rellena las figuras
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
public class LaminaColoreada extends JPanel{
    public void paintComponent(Graphics g){
        Random ale = new Random(); // --------- COLORES ALEATORIOS.
        double LARGO_RECTANGULO = 400.33;
        double ALTO_RECTANGULO = 250;        
        super.paintComponent(g);
        // --------------- FIGURAS GEOMETRICAS CON LA BIBLIOTECA Java 2D.        
        Graphics2D g2 = (Graphics2D) g;

       Rectangle2D rectangulo = new Rectangle2D.Double(100, 150, LARGO_RECTANGULO, ALTO_RECTANGULO);                
       // ---- aplica al objeto g2 el mt que establece el color con el que vamos a dibujar, setPaint(Color.BLUE)
       g2.setPaint(Color.BLUE);
       //  ------- aplica al objeto g2 el relleno con el color espablecido.
       g2.fill(rectangulo);        
       // ------------------------draw(rectangulo); dibuja el contorno de la figura con el color establecido
       //g2.draw(rectangulo); 

        //         // --------------- ******** PARA DAR COLOR AL TRAZO Y AL RELLENO DE LAS FIGURAS.
        //        Rectangle2D rectangulo = new Rectangle2D.Double(100, 150, LARGO_RECTANGULO, ALTO_RECTANGULO); 
        //        // ---------- 1º DAMOS COLOR AL TRAZO.
        //        g2.setPaint(Color.BLACK);
        //        g2.draw(rectangulo); 
        //        // ----------- 2º DAMOS COLOR AL RELLENO
        //        g2.setPaint(Color.YELLOW);
        //        g2.fill(rectangulo);

        // ----------------------------------CREA UNA ELIPSE.
        Ellipse2D elipse = new Ellipse2D.Double();
        //utiliza setFrame(); para mostrar el rectangulo ya hecho. sino seria: Ellipse2D elipse = new Ellipse2D.Double(.., .., ..,.,);
        elipse.setFrame(rectangulo);
        // ---- aplica al objeto g2 el mt que establece el color con el que vamos a dibujar, setPaint(Color.BLUE)
        g2.setPaint(new Color(ale.nextInt(255), ale.nextInt(255), ale.nextInt(255)));//----------OTRA FORMA DE DAR COLOR.
        //  ------- aplica al objeto g2 el relleno con el color espablecido.
        g2.fill(elipse);
        //g2.draw(elipse); 
        
        // ------ MODIFICANDO TIPO DE LETRA EN EL FRAME
        // ----Invocamos a clase Font, y utilizamos sus mt.
        Font fuente = new Font("Arial",Font.ITALIC, 22);
        g2.setFont(fuente);
        g2.drawString("Hola qué hay, cómo estamos", 520,200);
        g2.setColor(Color.WHITE);
        // --------- PARA ESCRIBIR MAS LINEAS
        Font fuente2 = new Font("Arial",Font.BOLD, 22);
        g2.setFont(fuente);
        g2.drawString("Curso de Java ", 520,240);
        g2.setColor(Color.WHITE);
        

    }
}





















