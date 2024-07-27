/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_12 {

    public static void main(String[] args) {
       int nota;
       
       nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota:"));
       
       switch (nota){
           case 0: JOptionPane.showMessageDialog(null,"Insuficiente D:");  
                    break;
           case 1: 
           case 2:
           case 3: 
           case 4:JOptionPane.showMessageDialog(null,"Suficiente!");  
                    break;
           case 5:
           case 6:    
           case 7: JOptionPane.showMessageDialog(null,"Bien!");  
                    break;
           case 8: 
           case 9: JOptionPane.showMessageDialog(null,"Notable!");  
                    break;
           case 10: JOptionPane.showMessageDialog(null,"Sobresaliente!");  
                    break;
           default: JOptionPane.showMessageDialog(null,"Nota ingresada incorrecta");    break;
       
       }
       
       
    }
}
