public interface calculadora 
{
    public int suma(int x, int y);
    public int resta(int x, int y);
    public int multiplicacion(int x, int y);
    public int division(int x, int y);

  //operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    public int operar(stack x);
    
  //función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
    public String decode(String a);
   
}