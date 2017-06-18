import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
/**
 * Averigua el tamano de la pantalla, y crea una ventana de acuerdo a estos datos.
 */
public class CreandoMarcoCentral extends JFrame
{

    /**
     * Constructor for objects of class CreandoMarcoCentral
     */
    public CreandoMarcoCentral()
    {
        //variable que almacena datos de la pantalla, por el mt `getDefaultToolkit();
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        //En la api de java vemos que `getScreenSize()` devuelve el tamano de la pantalla 
        //en un objeto Dimesion.(este objeto tamanoPantalla almacena 1900/1080)
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        //para extraer esa medida, nos vamos a la api, y vemos que la clase Dimension dispone de campos de clase.
        int largoPantalla = tamanoPantalla.width;
        int alturaPantalla = tamanoPantalla.height;
        //teniendo la medidas de la pantalla. puedo crear una ventana la mitad de grande que la pantalla.
        setSize(largoPantalla/2, alturaPantalla/2);
        //para centrarla, el punto 0/0 de la ventana seria 1/4 de la pantalla.
        setLocation(largoPantalla/4, alturaPantalla/4);
        setTitle("Marco centrado");
        
        //PARA CAMBIAR EL ICONO DE JAVA QUE APARECE EN LA ESQUINA IZQUIERDA.
        //actuamos sobre 'miPantalla' por tener todos los datos de la pantalla.
        //1º conseguimos el icono y se almacena en un objeto Image
        Image miIcono = miPantalla.getImage("icono2.gif");
        //Le decimos que establezca este icono.
        setIconImage(miIcono);
    }

    /**
     * para obtener las dimensiones  de la pantalla donde se este ejecutando el programa. 
     */
    public void resolucionDePantalla(){
        
    }
}














