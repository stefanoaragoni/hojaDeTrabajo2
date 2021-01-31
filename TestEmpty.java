/**
*@author Stefano Aragoni
*@Nombre TestEmpty.java 
*@Lenguaje Java
*@since 29/01/21
*/

//prueba JUnit 1

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmpty {

	@Test
	public void test() {
		stack Stack = new stack();
		boolean empty = Stack.empty();
		assertEquals(true,empty);
	}

}
