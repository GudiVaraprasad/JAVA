import java.util.*;

class UsingRunnableInterface implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Task using Runnable Interface");
	}

	public static void main(String[] args) 
	{
		UsingRunnableInterface object = new UsingRunnableInterface();
		Thread t = new Thread(object);
		t.start();
	}
}