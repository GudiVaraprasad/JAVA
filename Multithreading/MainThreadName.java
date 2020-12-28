import java.util.*;

class MainThreadName
{
	public static void main(String args[])
	{
		System.out.println("This is from Main thread");

		// to know current thread name
		System.out.println(Thread.currentThread().getName());

		// to change name of current thread
		Thread.currentThread().setName("GVP");

		// to check whether changed or not

		System.out.println(10/0);
		
		// to know current thread name after change
		System.out.println(Thread.currentThread().getName());
	}
}