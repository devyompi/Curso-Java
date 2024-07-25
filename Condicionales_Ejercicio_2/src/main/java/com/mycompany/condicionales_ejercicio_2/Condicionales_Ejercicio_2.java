/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_2 {

    public static void main(String[] args) {
       /*
         Ejercicio 2:
         Pedir dos números y decir cuál es el mayor o si son iguales.
         */
        
       int a, b;
       
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
       
       if (a==b) {
           JOptionPane.showMessageDialog(null,"Los números son iguales"); 
       } else { 
       if (a<b) {
           JOptionPane.showMessageDialog(null,"El numero " +a+ "es menor que "+b);
       } else {
           JOptionPane.showMessageDialog(null,"El numero" +a+ "es mayor que"+b);
       }
       }
              
       
        
    }
}
