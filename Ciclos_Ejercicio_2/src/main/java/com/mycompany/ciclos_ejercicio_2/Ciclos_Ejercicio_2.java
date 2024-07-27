/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_2 {

    public static void main(String[] args) {
      int num;
      
      num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero:"));
      
      while (num!=0){
          
          if (num>=0){
              JOptionPane.showMessageDialog(null,"El numero es positivo:" +num);
          } else {
              JOptionPane.showMessageDialog(null,"El numero es negativo" + num);
              
          }
      
          num = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero:"));
      }
      
    }
}
