/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_16;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_16 {

    public static void main(String[] args) {
        int  num, mult, cont;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero:"));
        
        if (num>=0 && num<=10) {
            for (int i=0;i<=12;i++) {
                mult = i*num;
                System.out.println("Tabla:\n"+i+"x"+num+"="+mult);
                
            }
       
        } else {
            JOptionPane.showMessageDialog(null,"El numero no se encuentra entre el 1 y 10");
        }
        
    }
}
