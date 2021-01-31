/**
*@author Stefano Aragoni
*@name calculadora1.java 
*@language Java
*@since 29/01/21
*/

//A esta clase no se le agrego javadoc a los métodos ya que fueron implementados a traves de la interfaz Interface.  

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class calculadora1 implements calculadora
{
	//stack que almacena la info del .txt
	stack<String> stackCodificado = new stack<String>();
	
	//stack que guarda temporalmente los numeros de las operaciones postfix
	stack<Integer> stackInt = new stack<Integer>();
	
	//string que guarda el procedimiento realizado
	String register = "\nBienvenidx a la Calculadora Postfix\n\n";
	
	//metodo que suma dos parametros y retorna el resultado
    public int suma(int x, int y){
    	int Result = x+y;
    	return Result;
    }

	//metodo que resta dos parametros y retorna el resultado
    public int resta(int x, int y){
    	int Result = x-y;
    	return Result;
	}
	
	//metodo que multiplica dos parametros y retorna el resultado
    public int multiplicacion(int x, int y){
    	int Result = x*y;
    	return Result;
	}
	
	//metodo que divide dos parametros y retorna el resultado
    public int division(int x, int y){
    	int Result = x/y;
    	return Result;
    }

    //operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    public int operar(stack x) {
		int operand1, operand2;

    	int tempResult = 0;
		
		String temp = stackCodificado.pop();
		String[] operation = temp.split(" ");
		
		for(int i = 0; i < operation.length; i++) {
			//de ser que sea un operador, se hace el calculo
            if( operation[i].equals("+") || operation[i].equals("-") || operation[i].equals("*") || operation[i].equals("/") ) {

                operand2 = stackInt.pop();
				operand1 = stackInt.pop();
				
                switch(operation[i]) {
                    case "+": {
                        int tempOperandResult = suma(operand1,operand2);
						stackInt.push(tempOperandResult);
						register = register + (operation[i])+ "\tSumar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "-": {
                        int tempOperandResult = resta(operand1,operand2);
						stackInt.push(tempOperandResult);
						register = register + (operation[i])+ "\tRestar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "*": {
                        int tempOperandResult = multiplicacion(operand1,operand2);
						stackInt.push(tempOperandResult);
						register = register + (operation[i])+ "\tMultiplicar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "/": {
                        int tempOperandResult = division(operand1,operand2);
						stackInt.push(tempOperandResult);
						register = register + (operation[i])+ "\tDividir: pop, pop y push del resultado\n";
                        break;
                    }
                }
            } else {
				//de ser un numero, se guarda en un stack
				stackInt.push(Integer.parseInt(operation[i]));
				register = register + (operation[i])+ "\tpush operando\n";
            }
		}
		
    	return stackInt.pop();
    }
    
    //función que se encarga de leer operation archivo y decodificar cada línea para realizar las operaciones de cada una
    public String decode(String a) {

    	File file = new File(a);
    	Scanner scan = null;
    	
    	try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {

		}
    	
    	while(scan.hasNextLine()){
			stackCodificado.push(scan.nextLine());
		
		}
		

    	//realiza todas las operaciones dentro del .txt. Almacena los resultados y el procedimiento en una variable
    	while(stackCodificado.empty() == false){
    		String temp = stackCodificado.peek();
    		register = register + "\nExpresión: "+temp+"\n\nEntrada\tOperacion\n";
    	
			int tempResult = operar(stackCodificado);
			String tempResult2 = String.valueOf(tempResult);

			register = register + "\nResultado Final: "+tempResult2+"\n--------------------\n";

    	}	
    	
    	
    	//retorna el procedimiento completo
    	return register;
    }
   
   
}