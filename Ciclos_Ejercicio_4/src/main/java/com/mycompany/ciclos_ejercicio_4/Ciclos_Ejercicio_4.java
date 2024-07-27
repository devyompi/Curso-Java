/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_4 {

    public static void main(String[] args) {
        int cont = 0, num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
        
        while (num>=0) {
           cont++;
          num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero:"));
        }              
        JOptionPane.showMessageDialog(null,"Ingresaste"+cont+"numeros");
    }
}
