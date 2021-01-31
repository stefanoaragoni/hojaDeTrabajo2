/**
*@author Stefano Aragoni
*@Nombre testSumaCalc.java 
*@Lenguaje Java
*@since 29/01/21
*/

import static org.junit.Assert.*;

import org.junit.Test;

//prueba 3 JUnit
public class testSumaCalc {

	@Test
	public void test() {
		calculadora1 Calc = new calculadora1();
		int result = Calc.suma(1,2);
		assertEquals(3,result);
	}

}
