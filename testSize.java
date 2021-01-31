/**
*@author Stefano Aragoni
*@Nombre testSize.java 
*@Lenguaje Java
*@since 29/01/21
*/

//prueba 2 de JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class testSize {

	@Test
	public void test() {
		stack Stack = new stack();
		int size = Stack.size();
		assertEquals(0,size);
	}

}
