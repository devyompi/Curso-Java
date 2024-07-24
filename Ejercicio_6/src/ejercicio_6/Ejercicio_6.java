/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //entrada y salida
        double a, b, suma;
        //
        double A2, B2;

       //pedir dos numeros
        System.out.println("Digite el primer número: ");
        a = entrada.nextDouble();
        System.out.println("Digite el segundo número: ");
        b = entrada.nextDouble();
        
        //proceso
        A2 = Math.pow(a,2);     
        B2 = Math.pow(b,2);
        suma = A2+B2+(2*a*b);
        
        //salida
        System.out.println("El cuadrado de la suma es: "+suma);
             
        
    }
    
}
