import java.util.*;
import java.lang.*;

// Mini Project

class MedicalTest extends Thread
{
	@Override
	public void run()
	{
		System.out.println("------------");
		
		try
		{
			System.out.println("Medical Test started");
			Thread.sleep(3000);
			System.out.println("Medical Test completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class DrivingTest extends Thread
{
	@Override
	public void run()
	{
		System.out.println("------------");
		
		try
		{
			System.out.println("Driving Test started");
			Thread.sleep(5000);
			System.out.println("Driving Test completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class OfficerSign extends Thread
{
	@Override
	public void run()
	{
		System.out.println("------------");
		
		try
		{
			System.out.println("Officer Takes the file");
			Thread.sleep(500);
			System.out.println("Officer checks the file");
			Thread.sleep(1000);
			System.out.println("Officer signs the file");
			Thread.sleep(2500);
			System.out.println("Officer Sign completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class LicenseDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("License Demo progess started");

		MedicalTest mt = new MedicalTest();
		mt.start();

		mt.join();

		DrivingTest dt = new DrivingTest();
		dt.start();

		dt.join();

		OfficerSign os = new OfficerSign();
		os.start();

		os.join();

		System.out.println("You obtained License Successfully");
	}
}
