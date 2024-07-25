/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_4 {

    public static void main(String[] args) {
        double monto, pago;
        
       monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto comprado:"));
       
       if (monto>300) {
       pago = monto-(monto*0.20);
         JOptionPane.showMessageDialog(null,"El monto a pagar es de:"+pago);
      
       } else {
           JOptionPane.showMessageDialog(null,"El monto a pagar es de:"+monto);
       }
    }
}
