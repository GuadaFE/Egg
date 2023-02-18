/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author guada
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define una variable de tipo boolean, double y char. Guarda información en ellas a través del 
       //Scanner. 
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Valor de bandera: " );
       boolean bandera = leer.nextBoolean();
       
       System.out.println("Valor double: " );
       double decimal = leer.nextDouble();
      
       System.out.println("Valor caracter: " );
       char caracter = leer.next().charAt(0);
       
    }
    
}
