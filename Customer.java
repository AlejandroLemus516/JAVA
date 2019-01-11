/**
 * This is the business package which contains the classes of the business class.
 */
package lemus.bcs345.hwk.purchases.business;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is the Customer class
 * @author Alejandro
 *
 */

public class Customer {
	//Declare all variables which are private in the Customer class.
	private String firstName;
	private String lastName;
	private Address address;
	/**
	 * Initialize the private variables
	 * 
	 */
	public Customer()
	{
		firstName = null;
		lastName = null;
		address = new Address();
	}
	/**
	 * Parameters passed to the Constructor.
	 * @param f is the parameter for firstName
	 * @param l	is the parameter for lastName
	 * @param a is the parameter for address
	 */
	public Customer(String f, String l, Address a)
	{
		firstName = f;
		lastName = l;
		address = a;
	}
	/**
	 * setFirstName method accesses the firstName variable
	 * @param newFName is used to access the firstName variable
	 */
	public void setFirstName(String newFName)
	{
		firstName = newFName;
	}
	/**
	 * setLastName method accesses the lastName variable
	 * @param newLName is used to access the lastName variable
	 */
	public void setFLastName(String newLName)
	{
		lastName = newLName;
	}
	/**
	 * setAddress method accesses the address variable
	 * @param newAdd access the address variable
	 */
	public void setAddress(Address newAdd)
	{
		address = newAdd;
	}
	/**
	 * The getFirstName method returns the firstName variable
	 * @return firstName variable is returned
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * The getLastName method returns the number variable
	 * @return lastName variable is returned
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * The getAddress method returns the number variable
	 * @return address variable is returned
	 */
	public Address getAddress()
	{
		return address;
	}
	/**
	 * Write method used to write to a text file
	 * @param ps parameter passes through to the PrintStream Method
	 */
	public void Write(PrintStream ps)
	{
		try {
			ps = new PrintStream("newfileCustomer.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		ps.printf("%s",firstName);
		ps.printf("\r\n%s",lastName);
		address.Write(ps);

	}
	/**
	 * Read method used to read to textFile
	 * @param s is used to pass through the Read Method
	 */
	public void Read(Scanner s)
	{
		firstName = s.nextLine();
		lastName = s.nextLine();
		address.Read(s);

	}
	/**
	 * GetJSON method used to return JSON string
	 * @return jsonText is returned to see JSON string
	 */
	public String GetJSON()
	{

		String jsonText = "{";
		jsonText += 		 "\"first\":" + "\"Jane\",";
		jsonText += 		"\"last\":" + "\"Doe\",";
		jsonText += 		"address :";
		jsonText +=			address.GetJSON();
		jsonText +="}";
		return jsonText;	
	}
	/**
	 * toString Method overrides to display in a different format
	 * @return s is returned to see the toString
	 */
	@Override
	public String toString()
	{

		String s = firstName + " " + lastName + "\n" + address.toString();
		return s;
	}
}
