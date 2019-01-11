package lab2;

public class Driver {

	public static void main(String[] args) {
		Employee e1;
		
		e1 = new employee();
		
		String name;
		int hw;
		double hr;
		double pay;
		
		name = e1.getName();
		hw = e1.getHoursWorked();
		hr = e1.gethourlyRate();
		pay = e1.GetPaid();
		
		System.out.printf("Name %s\n", name);
		System.out.printf("Name %s\n", name);
		System.out.printf("Name %s\n", name);
		System.out.printf("Name %s\n", name);
	}

}
