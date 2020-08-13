
import java.util.*;
import java.io.*;

public class PersonalDetails
{
	String name;
	String id;
	String address;
	String profession;
	String mobileNo;
	static int sno=2021;

	public PersonalDetails(String name, String id, String address, String profession, String mobileNo)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.profession=profession;
		this.mobileNo=mobileNo;
	}

	public void print()
	{
		System.out.println();
		System.out.println("Employee Serial No. : "+sno);
		System.out.println("Name of Employee : "+name);
		System.out.println("Employee ID : "+id);
		System.out.println("Email ID : "+name+"."+id+"@gmail.com");
		System.out.println("Address : "+address);
		System.out.println("Profession : "+profession);
		System.out.println("Mobile No. : "+mobileNo);
		System.out.println();
		sno++;
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
    
		PersonalDetails person1 = new PersonalDetails("Hari","19BCE7618","Hyderabad","Student","9492096954");
    
		PersonalDetails person2 = new PersonalDetails("Suraj","17BCN7247","Bhopal"," Program Director","8521796544");
    
		PersonalDetails person3 = new PersonalDetails("Sneha","18BCE7366","Chennai","Student","6301258841");
    
		PersonalDetails person4 = new PersonalDetails("Paul","19BCD7033","Punjab","CSE Faculty","8809657351");
    
		PersonalDetails person5 = new PersonalDetails("Apoorva","19BCI7513","Delhi","Project Manager","9295899421");
    
		person1.print();
		person2.print();
		person3.print();
		person4.print();
		person5.print();
	}
}
