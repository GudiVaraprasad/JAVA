import java.util.*;
import java.lang.*;

class ThreadYieldMethod extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Child Thread");
		
		for (int i=0;i<=5;i++) 
		{
			System.out.println(Thread.currentThread().getName() + " :: " + i);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");

		ThreadYieldMethod object = new ThreadYieldMethod();
		object.start();
		
		Thread.yield();
		for (int i=0;i<=5;i++) 
		{
			System.out.println(Thread.currentThread().getName() + " :: " + i);
		}
	}
}