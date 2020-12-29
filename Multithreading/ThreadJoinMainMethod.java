import java.util.*;
import java.lang.*;

class ThreadJoinMainMethod extends Thread 
{
	static Thread mainThread;
	@Override
	public void run()
	{
		System.out.println("Child Thread");
		
		try
		{
			mainThread.join();
			
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

	public static void main(String[] args)
	{
		mainThread = Thread.currentThread();

		System.out.println("Main Thread");

		ThreadJoinMainMethod object = new ThreadJoinMainMethod();
		object.start();
		
		//object.join();

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