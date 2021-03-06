/**
 * This is the package that holds the Classes for presentation package.
 */
package lemus.bcs345.hwk.purchases.presentation;
/**
 * 
 */

import java.io.FileNotFoundException;
/**
 * Project Designed to test Data from information if in both cases pass or fail through Automated testing also understanding the uses of JSON
 * We created a project to hold a menu that would read User input from 1-9 and will do specific actions depending on the number pressed.
 * 
 * @author Alejandro Lemus
 *  10/20/2016
 */
public class Main {


	public static void main(String[] args) throws FileNotFoundException{

		/*

		//Calls instances of each class.
		Address a1 = new Address();
		Product p1 = new Product();

		//Declare and initialize variables for testing.
			double inValidPrice = 20.31, validPrice = 199.99;  
		String inValidNumber = "20", inValidAddress = "Chimmy Lane", inValidtCity = "Los Angeles", inValidState = "CA", inValidZip = "10230", inValidDescp = "Iphone 6s";
			String validNum = "10", validAddress = "Broadway", validCity = "New York", validState = "NY", validZip ="10001", validDescp = "Samsung Galaxy s7";
		//Scanner method used to read for the Address class.
		Scanner addressScanner = new Scanner(new File("SampleAdress.txt"));
		//Creates a printStream.
		PrintStream addressStream = null;

		System.out.println("============================================ These are Tests for the Adress Class ============================================");

		//Reads Data from Scanner to pass data through SET/GET as parameters for the Address class.
		a1.Read(addressScanner);
		System.out.println("This is a1 during the initial read");
		//Use the toString method to call the Data to console in a different format for the Address class.
		System.out.println(a1.toString());
		//Writes to the write method which Generates a new text file for the Address class.
		a1.Write(addressStream);
		System.out.println("This is a1 being read after write");
		//Use the toString method to call the Data to console in a different format for the Address class after the Write.
		System.out.println(a1.toString());
		//Created a new scanner for the newly generated text file for the Address Class.
		Scanner newAddressScanner = new Scanner(new File("newfileAddress.txt"));
		//Reads data from a auto generated text file for the Address class. 
		a1.Read(newAddressScanner);
		System.out.println("This is a1 being read after 2nd read from the newly generated file");
		//Prints out a toString using the Data from the newly generated File.
			System.out.println(a1.toString());

		System.out.println("This test the getJSON method");
		//Will print a JSON string format.
		System.out.println(a1.GetJSON());

		//send new data to test data from SET/GET method for the Address class.

		a1.setNumber(validNum);  
		a1.setStreet(validAddress);
		a1.setCity(validCity);
		a1.setState(validState);
		a1.setZip(validZip);


		System.out.println("========== These are Tests to the GET/SET Methods in the Address class that Passed ==========");
		//Test if data from SET/GET methods MATCH if they do result output would be PASS for the Address class.
		if(validNum == a1.getNumber())
		{

			System.out.println("number Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("number Get/Set, Valid Value: Fail");
		}

		if(validAddress == a1.getStreet())
		{

			System.out.println("street Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("street Get/Set, Valid Value: Fail");
		}

		if(validCity == a1.getCity())
		{

			System.out.println("city Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("city Get/Set, Valid Value: Fail");
		}

		if(validState == a1.getState())
		{

			System.out.println("state Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("state Get/Set, Valid Value: Fail");
		}
		if(validZip == a1.getZip())
		{

			System.out.println("zip Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("zip Get/Set, Valid Value: Fail");
		}


		System.out.println("========== These are Tests to the GET/SET Methods in the Address class that Failed ==========");
		//Test if data from SET/GET methods DIFFER if they do result output would be FAIL for the Address class.
		if(inValidNumber == a1.getNumber())
		{
			System.out.println("street Get/Set, Valid Value: Pass");
		}
		else
		{
			System.out.println("street Get/Set, Valid Value: Fail");
		}

		if(inValidAddress == a1.getStreet())
		{

			System.out.println("street Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("street Get/Set, Valid Value: Fail");
		}
		if(inValidtCity == a1.getCity())
		{

			System.out.println("city Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("city Get/Set, Valid Value: Fail");
		}
		if(inValidState == a1.getState())
		{

			System.out.println("state Get/Set, Valid Value: Pass");
 07-
		}
		else
		{
			System.out.println("state Get/Set, Valid Value: Fail");
		}
		if(inValidZip == a1.getZip())
		{

			System.out.println("zip Get/Set, Valid Value: Pass");

		}
		else
		{
			System.out.println("zip Get/Set, Valid Value: Fail");
		}


		System.out.println("============================================ These are Tests for the Product Class ============================================");
		//Scanner method used to read for the Product class.
		Scanner productScanner = new Scanner(new File("SampleProduct.txt"));
		//Creates a printStream.
		PrintStream productStream = null;
		//Reads Data from Scanner to pass data through SET/GET as parameters for the Product class.
		p1.Read(productScanner);
		System.out.println("This is p1 during the initial read");
		//Use the toString method to call the Data to console in a different format for the Product class.
		System.out.println(p1.toString());
		//Writes to the write method which Generates a new text file for the Product class.
		p1.Write(productStream);
		System.out.println("This is p1  being read after write");
		//Use the toString method to call the Data to console in a different format for the Product class after the Write.
		System.out.println(p1.toString());
		//Created a new scanner for the newly generated text file for the Product Class.
		Scanner newProductScanner = new Scanner(new File("newfileProduct.txt"));
		//Reads data from a auto generated text file for the Product class. 
		p1.Read(newProductScanner);
		System.out.println("This test the getJSON method");
		//Will print a JSON string format.
		System.out.println(p1.GetJSON());

		//send new data to test data from SET/GET method for the Address class.
			p1.setDescription(validDescp);
		p1.setPrice(validPrice);

		System.out.println("========== These are Tests to the GET/SET Methods in the Product class that Passed ==========");
		//Test if data from SET/GET methods DIFFER if they do result output would be PASS for the Product class.
		if(validDescp == p1.getDescription()){
			System.out.println("description Get/Set, Valid Value: Pass");
		}
		else
		{
			System.out.println("description Get/Set, Valid Value: Fail");
		}

		if(validPrice == p1.getPrice()){
			System.out.println("price Get/Set, Valid Value: Pass");
		}
		else
		{
			System.out.println("price Get/Set, Valid Value: Fail");
		}

		System.out.println("========== These are Tests to the GET/SET Methods in the Product class that Failed ==========");
		//Test if data from SET/GET methods DIFFER if they do result output would be FAIL for the Product class.
		if(inValidDescp == p1.getDescription())
		{
			System.out.println("description Get/Set, Valid Value: Pass");
		}
		else
		{
			System.out.println("description Get/Set, Valid Value: Fail");
		}

		if(inValidPrice == p1.getPrice())
		{
			System.out.println("description Get/Set, Valid Value: Pass");
		}
		else
		{
			System.out.println("description Get/Set, Valid Value: Fail");
		}

		 */
		//Create a new instance for the CustomerPurchaseConsoleUI
		CustomerPurchaseConsoleUI console = new CustomerPurchaseConsoleUI();


		//Calls the UI class in CustomerPurchaseConsoleUI
		console.UI();


	}
}

