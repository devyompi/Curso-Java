/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclos_ejercicio_22;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ciclos_Ejercicio_22 {

    public static void main(String[] args) {
        
        int calificacion;
        boolean suspenso = false;
        
        for (int i=1;i<=5;i++){
        
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion"));
        
        if (calificacion <4){
            suspenso = true;
        }
        
        }
       if (suspenso = true){
           JOptionPane.showMessageDialog(null,"Existe alumnos en suspenso");   
       } else { JOptionPane.showMessageDialog(null,"No existen alumnos en suspenso"); }
    }
}
