/**
*@author Stefano Aragoni
*@name calculadora.java 
*@language Java
*@since 29/01/21
*/

//interface que determina las acciones predefinidas de la calculadora
public interface calculadora 
{
    /**
    *Suma is responsible for adding two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */
    public int suma(int x, int y);

    /**
    *Resta is responsible for substracting two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */
    public int resta(int x, int y);

    /**
    *Multiplicacion is responsible for multiplying two values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */
    public int multiplicacion(int x, int y);

    /**
    *Division is responsible for adding dividing values and returning the result
    *@param Precondition No precondition
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the operation.
    *
    */
    public int division(int x, int y);

    /**
    *Operar is responsible for decoding a postfix string, splitting the string to analize each character, and later using another Stack in order to carry out the postfix operation.
    *@param Precondition The stack is not empty and it stores strings
    *@param Postcondition Returns resultant value of the operation
    *@return Value of the postfix operation.
    *
    */
    public int operar(stack x);
    //operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación

    /**
    *decode is responsible for opening and reading a .txt file. It goes on to store each line in the document into a unique String stack; each line is a push. 
    *@param Precondition The .txt has text; the text represents a postfix operation
    *@param Postcondition Returns a string with the procedure
    *@return String with the procedure of the operations done and the result.
    *
    */
    public String decode(String a);
    //función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}