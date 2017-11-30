/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunidad4;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alan
 */
class Invertir {
    public void invertir(int n){
    List<Integer> lista = new LinkedList<Integer>();

		int a,b;
		int c = 0;
		
		while(n>0){
			
			a = (int) (n/10);
			b=n%10;
			n=a;
			lista.add((c*10)+b);	
		}
		
		// Vaciamos a pila
		
			for(int i=0;i<lista.size();i++){		
		System.out.print( lista.get(i) );
			}

}
}