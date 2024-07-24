/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int salariofijo = 1000, carros_vend, monto;
        double total;
        
        System.out.println("Digite la cantidad de carros vendidos: ");
        carros_vend = entrada.nextInt();
        System.out.println("Digite el monto vendido: ");
        monto = entrada.nextInt ();
    
        total = (carros_vend*150)+(salariofijo)+(monto*0.05);
        
        System.out.println("Su salario mensual es de: "+total);
        
                
    }
}
