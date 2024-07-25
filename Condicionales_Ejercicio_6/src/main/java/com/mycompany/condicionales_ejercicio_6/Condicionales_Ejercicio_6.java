/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_6 {

    public static void main(String[] args) {
      int a, b;
      a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
      
      
      
     if (a%2==0&&b%2==0) {
         JOptionPane.showMessageDialog(null,"Ambos numeros son pares!");
     } else {
         if (a%2!=0&&b%2!=0){
             JOptionPane.showMessageDialog(null, "Ambos numeros son impares!");
     } else{
             if (a%2==0&&b%2!=0) {
             JOptionPane.showMessageDialog(null, "El primer numero es par, el segundo numero es impar");
             }  else {
                             if (a%2!=0&&b%2==0) {
                                 JOptionPane.showMessageDialog(null,"El primero numero es impar, el segundo numero es par");
                             
                             }
                             }    
             }
                     
         }
     } 
      
    }

