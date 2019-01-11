/**
 *  This is the business package which contains the classes of the business class.
 */
package lemus.bcs345.hwk.purchases.business;
/**
 * These are the the imports I used for the Purchase class.
 */
//import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author Alejandro
 *
 */
public class Address {
	//Declare all variables which are private in the Address class.
	private String number;
	private String street;
	private String city;
	private String state;
	private String zip;
	/**
	 * Initialize the private variables
	 */
	public Address(){
		number = null;
		street = null;
		city = null;
		state = null;
		zip = null;
	}

	/**
	 * Parameters passed to the Constructor
	 * @param num accesses the number variable
	 * @param st accesses the state variable
	 * @param c accesses the city variable
	 * @param sta accesses the state variable
	 * @param z accesses the zip variable
	 */
	public Address(String num, String st, String c, String sta, String z)
	{

		number = num;
		street = st;
		city = c;
		state= sta;
		zip = z;

	}
	/**
	 * setNumber method accesses the number variable
	 * @param newNum is the Accessor for  number
	 */
	public void setNumber(String newNum){

		number = newNum;
	}
	/**
	 * setStreet method accesses the street variable
	 * @param newSt is the Accessor for state
	 */
	public void setStreet(String newSt){

		street = newSt;
	}
	/**
	 * setCity method accesses the ncity variable
	 * @param newC is the Accessor for city
	 */
	public void setCity(String newC){

		city = newC;
	}
	/**
	 * setState method accesses the state variable
	 * @param newSta is the Accessor for state variable
	 */
	public void setState(String newSta){

		state = newSta;
	}
	/**
	 * setZip method accesses the zip variable
	 * @param newZ accesses the zip variable variable
	 */
	public void setZip(String newZ){

		zip = newZ;
	}
	/**
	 * The getNumber method returns the number variable
	 * @return number returns the number variable
	 */
	public String getNumber()
	{

		return number;
	}
	/**
	 * The getStreet method returns the street variable
	 * @return returns the street variable
	 */
	public String getStreet()
	{
		return street;
	}
	/**
	 * The getCity method returns the city variable
	 * @return city returns the city variable
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * The getState method returns the state variable
	 * @return state returns the state variable
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * The getZip method returns the zip variable
	 * @return zip 
	 */
	public String getZip(){
		return zip;
	}
	/**
	 * Write method used to write to a text file
	 * @param ps used to write to a text file
	 */
	public void Write(PrintStream ps)
	{
		/*
		try {
			ps = new PrintStream("newfileAddress.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		 */
		ps.printf("\r\n%s",number);
		ps.printf("\r\n%s",street);
		ps.printf("\r\n%s",city);
		ps.printf("\r\n%s",state);
		ps.printf("\r\n%s",zip);


	}
	/**
	 * Read method used to read to textFile
	 * @param s used to read to textFile
	 */
	public void Read(Scanner s)
	{

		number = s.nextLine();
		street = s.nextLine();
		city = s.nextLine();
		state = s.nextLine();
		zip = s.nextLine();
	}
	/**
	 * Read method used to read to textFile
	 * @return jsonText used to read to GetJSON string
	 */
	public String GetJSON() 
	{
	

		String jsonText = "{";
			   jsonText +="\"number\"" + ":" + "\"10\",";
			   jsonText +="\"street\"" + ":" + "\"BroadWay\",";
			   jsonText += "\"city\"" + ":" + "\"New York\",";
			   jsonText += "\"state\"" + ":" + "\"NY\",";
			   jsonText += "\"zip\"" + ":" + "\"10001\",";
			   jsonText +="}";

		return jsonText;	
	}
	/**
	 * toString Method overrides to display in a different format
	 * @return s display in a different format of toString
	 */
	@Override
	public String toString()
	{
		String s = number + " " + street + "\n" + city + ", " + state + " " + zip;
		return s;
	}
}
