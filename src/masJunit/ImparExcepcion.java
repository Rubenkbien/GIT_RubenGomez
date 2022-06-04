package caja_blanca;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
//Comprobaremos si esta prueba unitaria de excepción de el numero 0 divididos entre cualquier numero
//con una excepción de Object main, no muestra alteracion en el resultado

public class ImparExcepcion {
	private int n1;
	private int n2;
	private int resultado;
	//-------Constructores-----
	public void ImparExcepcio( int n1, int n2, int resultado) {
	this.n1=0;	
	this.n2=4;
	this.resultado = 0;
	}
	 @test
	public static Object main(int n1)  {
		// 0  dividido por cualquier numero no altera resultado. , 
	        try {
	        	boolean result= (0 % 4 == 0); {
	    			return 0 ;
	    		}
	        	// El numero 0 dividido por otro numrero el resultado no se veria alterado. 
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("0 dividido por 0");
	            
	        }
			return null;
	    }
	@Test
	public void test() {
		
	}
}
