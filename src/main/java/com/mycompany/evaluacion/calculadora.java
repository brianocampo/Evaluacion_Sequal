
package com.mycompany.evaluacion;

public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ++++++++++++++++++++++++++++++++ ");
        System.out.println(" Resultado de la suma ");
        System.out.println(" " + realizarSuma("a", "6"));
        System.out.println(" ++++++++++++++++++++++++++++++++ ");
    }
    
    public static Integer realizarSuma(String valor1, String valor2) {

        String resultado2 = null;
        Integer resultado = 0;

        resultado = Integer.parseInt(valor1) + Integer.parseInt(valor2);

        if (Integer.parseInt(valor1) > 70) {
            resultado = Integer.parseInt(valor1) + Integer.parseInt(valor2) + 1;
            System.out.println(" resultado con el IF" + resultado);
        }

        return resultado;

    }
    
}
