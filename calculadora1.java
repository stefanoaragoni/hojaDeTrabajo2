import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class calculadora1 implements calculadora
{
	stack<String> stackCodificado = new stack<String>();
	
	stack<Integer> stackInt = new stack<Integer>();
	
	String registro = "\nBienvenidx a la Calculadora Postfix\n\n";
	 
    public int suma(int x, int y){
    	int Result = x+y;
    	return Result;
    }
    
    public int resta(int x, int y){
    	int Result = x-y;
    	return Result;
    }
    public int multiplicacion(int x, int y){
    	int Result = x*y;
    	return Result;
    }
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
            if( operation[i].equals("+") || operation[i].equals("-") || operation[i].equals("*") || operation[i].equals("/") ) {

                operand2 = stackInt.pop();
				operand1 = stackInt.pop();
				
                switch(operation[i]) {
                    case "+": {
                        int tempOperandResult = suma(operand1,operand2);
						stackInt.push(tempOperandResult);
						registro = registro + (operation[i])+ "\tSumar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "-": {
                        int tempOperandResult = resta(operand1,operand2);
						stackInt.push(tempOperandResult);
						registro = registro + (operation[i])+ "\tRestar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "*": {
                        int tempOperandResult = multiplicacion(operand1,operand2);
						stackInt.push(tempOperandResult);
						registro = registro + (operation[i])+ "\tMultiplicar: pop, pop y push del resultado\n";
                        break;
                    }

                    case "/": {
                        int tempOperandResult = division(operand1,operand2);
						stackInt.push(tempOperandResult);
						registro = registro + (operation[i])+ "\tDividir: pop, pop y push del resultado\n";
                        break;
                    }
                }
            } else {
				stackInt.push(Integer.parseInt(operation[i]));
				registro = registro + (operation[i])+ "\tpush operando\n";
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
		

    	
    	while(stackCodificado.empty() == false){
    		String temp = stackCodificado.peek();
    		registro = registro + "\nExpresión: "+temp+"\n\nEntrada\tOperacion\n";
    	
			int tempResult = operar(stackCodificado);
			String tempResult2 = String.valueOf(tempResult);

			registro = registro + "\nResultado Final: "+tempResult2+"\n--------------------\n";

    	}	
    	
    	
    	
    	return registro;
    }
   
   
}