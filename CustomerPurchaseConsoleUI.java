/**
 * This is the package that holds the Classes for presentation package.
 * 
 */
package lemus.bcs345.hwk.purchases.presentation;
/**
 * These are all the imports I used for the CustomerPurchaseConsoleUI class.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import lemus.bcs345.hwk.purchases.business.Customer;
import lemus.bcs345.hwk.purchases.business.Purchase;

/**
 * 
 * @author Alejandro
 *
 *This class will run a Menu asking the user to input a number from 1-9
 *Then from the menu what ever input it was the program will do an output.
 */
public class CustomerPurchaseConsoleUI {

	public void UI() throws FileNotFoundException
	{

		//Declared variables 
		boolean console = false;
		int input = 0;
		//Declared a scanner class to read input from the keyboard 
		Scanner keyboard = new Scanner(System.in);
		//Created instances of the Customer and Purchase class to pass variables from CustomerPurchaseConsoleUI
		Customer c1 = new Customer();
		Purchase p1 = new Purchase();

		//Will loop used to create the menu loop will iterate until condition is met displaying the menu until console = true;
		while(!console)
		{
			if(input <= 0 || input > 9)
			{
				System.out.printf("Please Enter a number from the menu option 1-9\n");
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");

				input = keyboard.nextInt();
			}
			else if(input == 1)
			{
				Scanner customerScanner = new Scanner(new File("SampleCustomer.txt"));
				System.out.printf("You have chosen to Read Customer from a file\n");
				c1.Read(customerScanner);
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 2)
			{
				System.out.printf("You have chosen to Write Customer to a file \n");
				PrintStream customerStream = null;
				c1.Write(customerStream);
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 3)
			{
				System.out.printf("You have chosen to Show Customer info on screen \n");
				System.out.println(c1.toString());
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 4)
			{
				System.out.printf("You have chosen to Show Customer JSON on screen\n");
				System.out.println(c1.GetJSON());
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();

			}
			else if(input == 5)
			{

				System.out.printf("You have chosen to Read Purchase from file\n");
				Scanner purchaseScanner = new Scanner(new File("SamplePurchase.txt"));
				p1.Read(purchaseScanner);
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 6)
			{
				System.out.printf("You have chosen to Write Purchase to file\n");
				PrintStream purchaseStream = null;
				p1.Write(purchaseStream);
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 7)
			{
				System.out.printf("You have chosen to Show Purchase info on screen\n");
				System.out.println(p1.toString());
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 8)
			{
				System.out.printf("You have chosen to Show purchase JSON on screen\n");
				System.out.println(p1.GetJSON());
				System.out.printf("Please select another one of the options on the Menu\n");
				System.out.printf("1 - Read Customer from file\n"
						+ "2 - Write Customer from file\n"
						+ "3 - Show customer info on screen\n"
						+ "4 - Show customer JSON on screen\n"
						+ "5 - Read purchase from file\n"
						+ "6 - Write purchase to file\n"
						+ "7 - Show purchase info on screen\n"
						+ "8 - Show purchase JSON on screen\n"
						+ "9 - Exit \n");
				input = keyboard.nextInt();
			}
			else if(input == 9)
			{
				System.out.printf("Thank you for using the program. Have a nice Day");
				console = true;
			}
		}
	}

}
