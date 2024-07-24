/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
       double salario, horas, sal_h;
       horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus horas trabajadas en la semana: "));
       sal_h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario por horas: "));
       
       salario = horas*sal_h;
               
      JOptionPane.showMessageDialog(null, "Su salario semanal es de: "+salario );
       
       
    }
}
