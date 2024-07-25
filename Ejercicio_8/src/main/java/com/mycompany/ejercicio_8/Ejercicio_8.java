
package com.mycompany.ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        //scanner
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables 
        double a=0, b=0, c=0, potencia=0, raiz=0, res=0, res1=0, res2=0; 
        double x1,x2 = 0;
        System.out.println("Ingrese a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese c: ");
        c = entrada.nextDouble();
        //proceso
        potencia = Math.pow(b,2);
        res = potencia-(4*a*c);
        raiz = Math.sqrt(-res);
        res1 = (-1*b) + (raiz);
        res2 = (-1*b) - (raiz);
        x1 = res1/(2*a);
        x2 = res2/(2*a);
              
        
        //salida
        System.out.println(x1);
        System.out.println(x2);
        
    }
}

