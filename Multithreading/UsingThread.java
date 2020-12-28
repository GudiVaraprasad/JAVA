import java.util.*;

class UsingThread extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Task using Thread class");
	}

	public static void main(String[] args) 
	{
		UsingThread object = new UsingThread();
		object.start();
	}
}