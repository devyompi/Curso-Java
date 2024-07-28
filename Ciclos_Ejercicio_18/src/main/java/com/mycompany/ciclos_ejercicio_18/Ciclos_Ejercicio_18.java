/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_18;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_18 {

    public static void main(String[] args) {
        int code, litrosvend, producto, cont600=0, litrosartc1=0, suma_litros=0;
        double fac_total=0, fac=0;
        
        
        
        for (int i=1;i<=5;i++) {
            
        code = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo de venta:"));
        producto = Integer.parseInt(JOptionPane.showInputDialog("Introduzca que producto a vendido:\n 1. 0.6$/litro \n 2. 3 $/litro \n 3. 1.25$/litro "));
        litrosvend = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los litros vendidos:")); 
        
        switch (producto){
            case 1: 
                fac = 0.6*litrosvend;
                break;
            case 2:
                fac = 3*litrosvend;
                break;
            case 3:
                fac = 1.25*litrosvend;
                break;   
        }
        if (code==1) {
        litrosartc1=litrosvend;}
        if (fac>600) {
        cont600++;
        }
              fac_total = fac_total+fac; 
         suma_litros += litrosvend;
        }
         
        System.out.println("Facturacion Total:\n"+fac_total);
        System.out.println("cantidad de litros vendidos:\n"+suma_litros);
        System.out.println("Facturas mayores a 600:\n"+cont600);
    System.out.println("Litros del articulo 1:\n"+litrosartc1);
        
    }
}
