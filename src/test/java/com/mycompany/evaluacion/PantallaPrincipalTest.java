package com.mycompany.evaluacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.evaluacion.PantallaPrincipal;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Method;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author brian
 */
public class PantallaPrincipalTest {

    private JFrame dummyFrame;

    public PantallaPrincipalTest() {
    }

    @Before
    public void setUp() {
        dummyFrame = new JFrame();
    }

    @After
    public void tearDown() {
        dummyFrame.dispose();
    }

    @Test
    public void verificarArchivoExitosoTest() throws Exception {

        PantallaPrincipal pantalla = new PantallaPrincipal(dummyFrame, true);

        String archivoValido = "imagen.jpg";
        pantalla.verificarArchivo(archivoValido);
        assertTrue(true);

    }

    @Test
    public void verificarArchivoFallidoTest() {

        boolean control = true;

        try {
            
            PantallaPrincipal pantalla = new PantallaPrincipal(dummyFrame, true);

            String archivoValido = "imagen.html";
            pantalla.verificarArchivo(archivoValido);
            assertTrue(!control);

        } catch (Exception e) {
            control = false;
            assertTrue(!control);
        }
    }
    
     @Test
    public void redimensionarImagenExitosoTest() {

        String rutaImagen = "C:\\Users\\brian\\OneDrive\\Escritorio\\Evaluacion_Sequal\\imagenes\\imagen ancha.jpg";
        BufferedImage imagenTemp = null;
        
        try {
            
            PantallaPrincipal pantalla = new PantallaPrincipal(dummyFrame, true);
            
            File imagenFile = new File(rutaImagen);
            BufferedImage originalImage = ImageIO.read(imagenFile);
            imagenTemp = pantalla.redimensionarImagen(originalImage, 100, 100);
            assertNotNull(imagenTemp);

        } catch (Exception e) {

        }
    }
    
    

}
