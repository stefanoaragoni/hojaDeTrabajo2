public class Main {

	public static void main(String[] args) {
		
		calculadora1 Calc = new calculadora1();
		
		//la dirección del archivo. Debe de cambiarse cuando otras personas lo prueben en otros dispositivos.
		String registro = Calc.decode("/Users/stefanoaragoni/Desktop/HojaTrabajo2/archivosJava/postFix.txt");
		
		System.out.println(registro);

	}

}
