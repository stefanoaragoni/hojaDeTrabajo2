/**
*@author Stefano Aragoni
*@Nombre testDivisionCalc.java 
*@Lenguaje Java
*@since 29/01/21
*/


import static org.junit.Assert.*;

import org.junit.Test;

//prueba untaria 4
public class testDivisionCalc {

	@Test
	public void test() {
		calculadora1 Calc = new calculadora1();
		int result = Calc.suma(1,0);
		assertEquals(0,result);
	}

}
