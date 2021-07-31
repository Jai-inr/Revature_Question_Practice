package firstproject1;

public class EmployeeMain {
	public static void main(String[] args) {
		
		
		Employee e1=new Employee(100, "Sachin");
		System.out.println("Printing e1");
		e1.printEmployee();
		
		
		
		
		Employee e2=new Employee(101, "Sourav", 44, "Kolkata");
		System.out.println("\nPrinting e2");
		e2.printEmployee();
	}

}



