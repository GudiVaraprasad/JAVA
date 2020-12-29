import java.util.*;

class SleepMethod extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread");
		
		for (int i=0;i<=5;i++) 
		{
			try
			{
				Thread.sleep(2000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		try
			{
				System.out.println("Main Thread sleeping.....");
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		SleepMethod object = new SleepMethod();
		object.start();
	}
}