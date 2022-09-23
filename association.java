// Code by: Sarah Rafiq Shaikh
// Serial No: B20102144
public class association{
	public static void main(String[] args)
	{
		// Constructors calling
		Bank bank1 = new Bank();
		Employee emp1 = new Employee(); // Null

		// Creating objects of bank and Employee class
		Bank bank2 = new Bank("saleem");
		Employee emp2 = new Employee("kaleem"); // Parametrized
        Bank bank3 = new Bank("HBL");
		Employee emp3 = new Employee("raheem");

		Bank bank4 = new Bank(bank2);
		Employee emp4 = new Employee(emp3); //Copy 

		System.out.println(emp2.getEmployeeName()+ " is employee of "+ bank2.getBankName());
        System.out.println(emp3.getEmployeeName()+ " is employee of "+ bank3.getBankName());
	}
}