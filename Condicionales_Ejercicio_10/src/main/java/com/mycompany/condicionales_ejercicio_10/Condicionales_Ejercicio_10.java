/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.condicionales_ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_10 {

    public static void main(String[] args) {
        int dia, mes, año;

        /*dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));/*
        
        */
        //pene de mono pa tio tony
  
  
  
  dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
  
  if (dia>=1 && dia<=31) {
   mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
   if(mes>=1 && mes<=12) {
    año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
    if(año!=0) {
     if(mes==2 && dia<=28) {
      JOptionPane.showMessageDialog(null, "la fecha: "+dia+" - "+mes+" - "+año+" es correcta");
     }else if((mes==4 || mes==6 || mes==9 ||mes==11) && dia<=30) {
      JOptionPane.showMessageDialog(null, "la fecha: "+dia+" - "+mes+" - "+año+" es correcta");
     }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
      JOptionPane.showMessageDialog(null, "la fecha: "+dia+" - "+mes+" - "+año+" es correcta");
     }else {
      JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
     }
    }else {
     JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
    }
   }else {
    JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
   }
  } else {
   JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
  }
  
 }

}

        

    
