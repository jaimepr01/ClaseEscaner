/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseescaner;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class ClaseEscaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner persona = new Scanner(System.in);
        String nombre = persona.nextLine();
        int edad = persona.nextInt();
        long movil = persona.nextLong();
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono móvil: "+movil);
    }
    
}
