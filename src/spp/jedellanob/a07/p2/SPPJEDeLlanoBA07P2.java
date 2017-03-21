/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.a07.p2;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBA07P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el numero telefonico a 10 digitos " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Introduzca el numero ");
        numero= kb.nextInt();
        if (numero < telefono.length){
        System.out.println("El numero es " + telefono[numero]);
        } else System.out.println("FUERA DE RANGO.");    
    }
    
             public static void arrelgo(){

    }
    
}