/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_10 {

    public static void main(String[] args) {
        int  suma=0, num;
        
        for (int i=1;i<=10;i++){
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        suma+=num;
        }
       
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
        }
    }

