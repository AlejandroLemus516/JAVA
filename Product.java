/**
 *  This is the business package which contains the classes of the business class.
 */
package lemus.bcs345.hwk.purchases.business;

import java.io.PrintStream;
import java.util.Scanner;
/**
 * 
 * @author Alejandro
 *
 */
public class Product {
	//Declare all variables which are private in the Product class.
	private String description;
	private double price;
	/**
	 * Initialize the private variable
	 */
	public Product(){
		description = null;
		price = 0;
	}
	/**
	 * Parameters passed to the Constructor
	 * @param d is the parameter for description
	 * @param p is the parameter for price
	 */
	public Product(String d, double p)
	{
		description = d;
		price = p;
	}
	/**
	 * setDescription method accesses the description variable
	 * @param newDescp is used to access the description variable
	 */
	public void setDescription(String newDescp)
	{

		description= newDescp;
	}
	/**
	 * setPrice method accesses the price variable
	 * @param newPrice is used to access the price variable
	 */
	public void setPrice(double newPrice)
	{

		price = newPrice;
	}
	/**
	 * The getDescription method returns the description variable
	 * @return description returns the description variable from the method
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * The getPrice method returns the price variable
	 * @return price returns the price variable from the method
	 */
	public double getPrice()
	{
		return price;
	}
	/**
	 * Write method used to write to a text file
	 * @param ps is used to access the PrintStream parameter
	 */
	public void Write(PrintStream ps)
	{
		/*
		try {
			ps = new PrintStream("newfileProduct.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		 */
		ps.printf("%s",description);
		ps.printf("\r\n%f\r\n",price);
	}
	/**
	 * Read method used to read to textFile
	 * @param s is used to pass through the Read Method
	 */
	public void Read(Scanner s)
	{

		description = s.nextLine();
		price = s.nextDouble();
	}
	/**
	 * JSON method would return as a JSON String
	 * @return jsonText is returned to see JSON string
	 */
	public String GetJSON(){

		
		String jsonText = "{";
			   jsonText += "\"description\" " + ": " + "\"Samsung Galaxy s7\",";
			   jsonText += "\"price\" " + ": " + 199.99;
			   jsonText += "}, ";

		return jsonText;
	}
	/**
	 * toString Method overrides to display in a different format
	 * @return s is returned to see the toString
	 */
	@Override
	public String toString()
	{
		String s = String.format("%s, %.2f", description, price);
		return s;
	}
}
