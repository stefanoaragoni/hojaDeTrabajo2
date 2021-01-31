/**
*@author Stefano Aragoni
*@name stackInterface.java 
*@language Java
*@since 29/01/21
*/

//interface que predetermina los metodos del stack
public interface stackInterface<E> 
{
  
   /**
   *This method is responsible for storing an abstract data type into the Vector
   *
   *@return Doesnt return a value.
   *
   */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
   *This method is responsible for returning a certain ADT from the Vector and then deleting it
   *
   *@return Returns generic type object.
   *
   */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
   *This method is responsible for returning a certain ADT from the Vector
   *
   *@return Returns generic type object.
   *
   */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
   *This method is responsible for checking if the Vector is empty
   *
   *@return Returns a boolean indicating if the vector is empty or not.
   *
   */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
   *This method is responsible for indicating the total amount of objects in a Vector
   *
   *@return Returns an integer that represents the amount of objects currently stored.
   *
   */
   public int size();
   // post: returns the number of elements in the stack

}