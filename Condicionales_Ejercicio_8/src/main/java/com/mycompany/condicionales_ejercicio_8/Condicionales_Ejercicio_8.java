/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_8 {

    public static void main(String[] args) {
        int num;
        
     num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero:"));
     
     if (num<10){
         JOptionPane.showMessageDialog(null,"El numero tiene 1 cifra");
     } else if (num<100&&num>=10) {
                 JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras");
        } else if (num<1000&&num>=100) {
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
        } else if (num<10000&&num>=1000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 4 cifras");
        } else if (num<100000&&num>=10000){
            JOptionPane.showMessageDialog(null,"El numero tiene 5 cifras");
        } else { 
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el rango");
        }
    }   
}   

     
  
    

