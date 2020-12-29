import java.util.*;

class UserDefinedThreadName extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Task using Thread class");

		// to know current thread name
		System.out.println(Thread.currentThread().getName());

		// to change name of current thread
		Thread.currentThread().setName("GVP-user-defined");

		// to check whether changed or not

		System.out.println(6/0);
		
		// to know current thread name after change
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		UserDefinedThreadName object = new UserDefinedThreadName();
		object.start();

		// to know current thread name
		System.out.println(Thread.currentThread().getName());

		// to change name of current thread
		Thread.currentThread().setName("GVP-main");
		
		// to know current thread name after change
		System.out.println(Thread.currentThread().getName());
	}
}