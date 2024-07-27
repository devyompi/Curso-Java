/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_6 {

    public static void main(String[] args) {
        int cont=0, num;
        
       
        
        do {
             num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
                cont+=num;
         
        
        } while (num!=0);
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros es:"+cont);
    }
}
