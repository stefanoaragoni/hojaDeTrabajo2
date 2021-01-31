/**
*@author Stefano Aragoni
*@name stack.java 
*@language Java
*@since 29/01/21
*/

//A esta clase no se le agrego javadoc a los métodos ya que fueron implementados a traves de la interfaz Interface.  

import java.util.Vector;

public class stack<E> implements stackInterface<E>
{
	protected Vector<E> data;

	/**
   *Constructor method of stack class.
   *
   *@return Doesnt return a value.
   *
   */
	public stack()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		E temp = data.get(size() - 1);
		data.remove(size()-1);
		return temp;
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}