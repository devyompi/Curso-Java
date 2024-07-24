

package com.mycompany.xd;

import javax.swing.JOptionPane;



/**
 *
 * @author Jhon
 */
public class Xd {

    public static void main(String[] args) {
       
        String cadena;
        int entero;
        double decimal;
        char caracter;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite una entero: "));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
        JOptionPane.showMessageDialog(null,"El caracter es: "+caracter);
       
    }
}
