package curs2;

public class WageCalculator {
	
	int nrOfHoursWorked = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj1 = new Tester();
		obj1.setName("Monica");
		//System.out.println(obj1.getName());
		obj1.setRatePerHour(15);
		
		Tester obj2 = new Tester();
		obj2.setName("Bogdan");
		obj2.setRatePerHour(10);
		
		WageCalculator obj = new WageCalculator();
		System.out.println("Salariul pentru" + obj1.getName() + " este:" + obj.calculateSalary(obj1.getRatePerHour()));
		

	}
	
	public int calculateSalary(int rateHourly) {
		int salary = nrOfHoursWorked * rateHourly;
		return salary;
		
	}
	


}
