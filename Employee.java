// Code by: Sarah Rafiq Shaikh
// Serial No: B20102144
class Employee {
    private String name;
	Employee(){
	}
	Employee(String name)
	{
		this.name = name;
	}
	Employee(Employee any){
		this.name = any.name;
	}
	public String getEmployeeName() //getter
	{
		return this.name;
	}  
}
