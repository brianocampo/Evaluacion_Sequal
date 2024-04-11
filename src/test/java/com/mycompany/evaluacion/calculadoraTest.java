package com.mycompany.evaluacion;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brian
 */
public class calculadoraTest {

    
    public String valor1;
    public String valor2;
        

    public calculadoraTest() {
    }

    @Before
    public void setUp() {
        
        valor1 = "5";
        valor2 = "80";
       
    }


    @Test
    public void sumaExitosa() throws Exception {
        
        Integer resultado;          
        resultado = calculadora.realizarSuma(valor1, valor2);
        assertEquals(resultado+"", "85");

    }
    
    @Test
    public void sumaFallida() throws Exception {
        
        Integer resultado;          
        resultado = calculadora.realizarSuma(valor1, valor2);
        assertNotEquals("85", resultado);

    }


}
