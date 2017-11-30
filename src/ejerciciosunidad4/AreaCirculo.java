/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunidad4;

import javax.swing.JOptionPane.*;

/**
 *
 * @author alan
 */
public class AreaCirculo {
     double pi=3.14;
        double  radio = Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio"));
        double perimetro = 2*radio*pi;
        double area = pi*Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"perimetro"+perimetro+"\n"+"area:"+area);
   
}