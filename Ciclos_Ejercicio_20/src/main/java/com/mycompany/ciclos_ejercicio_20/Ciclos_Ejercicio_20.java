/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_20;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_20 {

    public static void main(String[] args) {
      int n, sueldomax=0,sueldo;
             
      
      n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));
      
      for (int i=1;i<=n;i++) {
          sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"+i+":"));
          if (sueldo>sueldomax) {
          sueldomax=sueldo;
          }
      }
      JOptionPane.showMessageDialog(null,"El sueldo max es:"+sueldomax);
    }
}
