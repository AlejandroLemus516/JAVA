/**
 * This is the business package which contains the classes of the business class.
 */
package lemus.bcs345.hwk.purchases.business;
/**
 * These are the the imports I used for the Purchase class.
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * 
 * @author Alejandro
 *
 */
public class Purchase {
	//Declare all variables which are private in the Purchase class.
	private Product product;
	private int quantity;
	/**
	 * Purchase constructor used to initialize product, quantity.
	 */
	public Purchase()
	{
		product = new Product();
		quantity = 0;
	}
	/**
	 * 
	 * Parameters passed to the Constructor.
	 * @param p is the parameter for product
	 * @param q is the parameter for quantity
	 */
	public Purchase(Product p, int q)
	{
		product = p;
		quantity = q;
	}
	/**
	 * setProduct method accesses the number variable
	 * @param newProduct is the parameter for product
	 */
	public void setProduct(Product newProduct)
	{
		product = newProduct;
	}
	/**
	 * setQuantity method accesses the number variable
	 * @param newQuantity is the parameter for quantity
	 */
	public void setQuantity(int newQuantity)
	{
		quantity = newQuantity;
	}
	/**
	 *  The getProduct method returns the street variable
	 * @return product
	 */
	public Product getProduct()
	{
		return product;
	}
	/**
	 * The getQuantity method returns the street variable
	 * @return quantity
	 */
	public int getQuantity()
	{
		return quantity;
	}
	/**
	 * Write method used to write to a text file
	 * @param ps  is used to access the PrintStream parameter
	 */
	public void Write(PrintStream ps)
	{
		try {
			ps = new PrintStream("newfilePurchase.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		product.Write(ps);
		ps.printf("%d", quantity);

	}
	/**
	 * Read method used to read to textFile
	 * @param s is used to pass through the Read Method
	 */
	public void Read(Scanner s)
	{
		product.Read(s);
		quantity = s.nextInt();
	}
	/**
	 * JSON method would return as a JSON String
	 * @return jsonText
	 */
	public String GetJSON() 
	{

		String jsonText = "{";
		jsonText += "\"Product\" :";
		jsonText += product.GetJSON();
		jsonText += "\"quantity\" : " +  2;
		jsonText +="}";

		return jsonText;
	}
	/**
	 * toString Method overrides to display in a different format
	 * @return toString
	 */
	@Override
	public String toString()
	{

		String s = quantity+ ", " + product.toString();

		return s;
	}

}
