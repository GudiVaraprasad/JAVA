import java.util.*;
import java.lang.*;

class ThreadJoinMethod extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Child Thread");
		
		try
		{
			for (int i=0;i<=5;i++) 
			{
				System.out.println(Thread.currentThread().getName() + " :: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main Thread");

		ThreadJoinMethod object = new ThreadJoinMethod();
		object.start();
		
		object.join();

		try
		{
			for (int i=0;i<=5;i++) 
			{
				System.out.println(Thread.currentThread().getName() + " :: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}