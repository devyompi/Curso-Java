/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_12 {

    public static void main(String[] args) {
        int num=0, fact = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero:"));
        for (int i=1;i<=num;i++ ){
        
        fact *=i;
        }
        
        JOptionPane.showMessageDialog(null,"El factorial ! es:"+fact);
    }
}
