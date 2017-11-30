/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunidad4;

import java.util.Stack;

/**
 *
 * @author alan
 */
public class Escapar {
    
    Stack<Boolean> pila=new Stack<>();

	public void ParImpar(double n){
		
          if (pila.push((boolean) (n % 2 == 0))){

        	   System.out.println("Es Par");
        	   
           }else{
        	System.out.println("NO es par");
           }
        	         
		// Vaciamos la pila
           while (!pila.empty())
        	   
               }
