/**
*@author Stefano Aragoni
*@name Main.java 
*@language Java
*@since 29/01/21
*/


public class Main {
	/**
  	*Main program is responsible for simulating the PostFix Calculator. 
  	*/
	public static void main(String[] args) {
		
		//se instancia el objeto de la calculadora
		calculadora1 Calc = new calculadora1();
		
		//la dirección del archivo. Debe de cambiarse cuando otras personas lo prueben en otros dispositivos.
		String registro = Calc.decode("/Users/stefanoaragoni/Desktop/HojaTrabajo2/archivosJava/postFix.txt");
		
		//se imorime el procedimiento y todo.
		System.out.println(registro);

	}

}
