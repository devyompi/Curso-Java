/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_14;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_14 {

    public static void main(String[] args) {
        
        int cont_mayor=0, suma=0, sueldo;
        
        for (int i=0;i<=9;i++){
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite su sueldo:"));
        suma+=sueldo;
        if (sueldo>1000){
        cont_mayor++;
        }
        }
        JOptionPane.showMessageDialog(null,"La suma es:"+suma+"\n La cantidad de sueldas mayor a mil es:"+cont_mayor);
    }
}
