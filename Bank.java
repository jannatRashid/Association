// Code by: Sarah Rafiq Shaikh
// Serial No: B20102144
class Bank {
    private String name;
    Bank(){
        
    }
	Bank(String name)
	{
		this.name = name;
	}
    Bank(Bank b){
      this.name = b.name;  
    }
	public String getBankName() //getter
	{
		return this.name;
	}  
}
