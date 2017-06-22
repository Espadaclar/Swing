import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import  java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel
{
    //para almacenar la imagen,
    private Image imagen;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        
        //---el atributo de arriba lo igualamos a ImageIO.read(_input_) y nos pide un parm de tipo File
        //   que corresponde con la ruta donde esta almacenada la imagen, creamos el objeto y lo pasamos
        File archivo = new File("imagen1.jpg");
        try{// ---- read(archivo) requiere de una excepcion.
            imagen = ImageIO.read(archivo);// -------- y ta tenemos almacenada la imagen en 'imagen'
        }
        catch(IOException e){
            System.out.println("Error de ruta.");
        }
        // ------ PASAMOS A DIBUJAR LA IMAGEN.
        // el parametro observado lo hemos puesto a null, se trata de un observador que inspecciiona
        // como va el procesos de mostrar la imagen, en este caso lo ponemos a mull.
        g.drawImage(imagen,100, 100, null);    
    }
}
