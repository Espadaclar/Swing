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
        //---el atributo de arriba lo igualamos a ImageIO.read(_input_) y nos pide un parm de tipo File
        //   que corresponde con la ruta donde esta almacenada la imagen, creamos el objeto y lo pasamos
        File archivo = new File("bola2.png");
        try{// ---- read(archivo) requiere de una excepcion.
            imagen = ImageIO.read(archivo);// -------- y ta tenemos almacenada la imagen en 'imagen'
            //largo = imagen.WIDTH;
        }
        catch(IOException e){
            System.out.println("Error de ruta.");
        }
        
        //para almacenar el largo y ancho de la imagen;
        //en la api de java vemos que estos getters dicen 'observer - an object waiting for the image to be loaded.'
        // o sea que el parametro que se les pasa, es un objeto que esta esperando la carga de la imagen, este objeto 
        // en este caso es la lamina en la que vamos a dibujar. o sea 'this';
        int largo = imagen.getWidth(this);
        int alto  = imagen.getHeight(this);
        // ------ PASAMOS A DIBUJAR LA IMAGEN.
        g.drawImage(imagen, 0, 0, null); 
        //repite la imagen situada en las coordenadas (0/0), con un tamano de (200/200 de la imagen
        //que se copia), en las coordenadas (250/0)
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 100; j++){ 
                if(i + j > 0){
                    g.copyArea(0, 0, largo, alto, largo *i, alto *j);
                }
            }
        }
    }
}


