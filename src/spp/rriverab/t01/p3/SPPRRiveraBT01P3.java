//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.t01.p3;

import java.util.Scanner;

import java.lang.Math;


public class SPPRRiveraBT01P3 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        double x1, x2 , y1, y2, d;
        
        System.out.println("Calculadora de distancia entre 2 puntos \n");
        
        System.out.println("Introduzca la coordenada en x del primer punto: ");
        x1 = teclado.nextDouble();
        System.out.println("Introduzca la coordenada en y del primer punto: ");
        y1 = teclado.nextDouble();
        System.out.println("Introduzca la coordenada en x del segundo punto: ");
        x2 = teclado.nextDouble();
        System.out.println("Introduzca la coordenada en y del segundo punto: ");
        y2 = teclado.nextDouble();
        
        d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)) ;
        
        System.out.println("La distancia entre los dos puntos\n(" +x1+ "," +y1+ ")\n(" +x2+ "," +y2+ ")\nes: " +d);
        
              
    }
    
}
