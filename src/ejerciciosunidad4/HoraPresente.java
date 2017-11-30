/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunidad4;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class HoraPresente {
    Stack<Integer> pila=new Stack<>();
	
    public void HoraT(int hora,int cantidad){
   	 
			pila.push((int) (hora + cantidad) % 24); 

		// Vaciamos la pila
		while (!pila.empty())
			
		JOptionPane.showMessageDialog(null,pila.pop());	
	}
    
}
