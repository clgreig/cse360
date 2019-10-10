package cse360assign2;

/**
 * The AddingMachine class performs adding and subtracting
 * operations on a total. A record of the operations is
 * recorded and is returned by toString().
 * 
 * @author Connor Greig
 */
public class AddingMachine
{
	/**
	 * @value total  	  the running total of the adding and subtracting
	 * @value operations  the String holding a representation of all of
	 * 					  the operations being performed on the total
	 */
	private int total;
	private String operations = "0";
	
	/**
	 * Sets a new AddingMachine object's total value to 0.
	 */
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Fetches the total value of the AddingMachine object.
	 * 
	 * @return the current value of total
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds the parameter value to the total.
	 * 
	 * @param value	 the value to be added to total
	 */
	public void add (int value)
	{
		total += value;
		operations = operations + " + " + value;
	}
	
	/**
	 * Subtracts the parameter value from the total.
	 * 
	 * @param value  the value to be subtracted to total
	 */
	public void subtract (int value)
	{
		total -= value;
		operations = operations + " - " + value;
	}
	
	/**
	 * Returns a string that consists of previous add and subtract
	 * operations so that they may be printed out.
	 * 
	 * @return a String representation of the AddingMachine's operations
	 */
	public String toString ()
	{
		return operations;
	}

	/**
	 * Clears the string of operations of this AddingMachine object.
	 */
	public void clear()
	{
		total = 0;
		operations = "0";
	}
}