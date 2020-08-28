
// Encapsulation in java || Data Hiding in Java 

class Employee 
{
	private int employeeID;

	public void setEmployeeID(int employeeID1)
	{
		employeeID=employeeID1;
	}

	public int getEmployeeID()
	{
		return employeeID;
	}

}
class Company
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.employeeID=10101221;
		System.out.prinln(e.getEmployeeID);
	}
}

/*
output :
10101221
*/
