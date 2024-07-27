/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales_ejercicio_14;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Condicionales_Ejercicio_14 {

    public static void main(String[] args) {
        int kg,opcion,tn,g,mg;
        kg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de kg"));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la TRANSformacion\n" 
        +"1. Tonelada\n"
        +"2. Gramos\n"
        +"3. Miligramos\n"
        +"4. Salir"        
                ));
    
       switch (opcion){
           case 1: tn = kg/1000;
           JOptionPane.showMessageDialog(null,"La cantidad en toneladas es:"+tn);
           break;
           case 2: g = kg*1000;
           JOptionPane.showMessageDialog(null,"La cantidad en gramos es:"+g);
           break;
           case 3: mg = kg*1000000;
           JOptionPane.showMessageDialog(null,"La cantidad en miligramos es:"+mg);
           break;
           case 4: JOptionPane.showMessageDialog(null,"safa mierda");
           break;
           default: JOptionPane.showMessageDialog(null, "Opcion seleccionada incorrecta"); break;
       
    }
    }
    }