
// throw keyword in exception handling

import java.util.*;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String message)
	{
		super(message);
	}
}

class Vote
{
	public static void main(String[] args) 
	{
		// System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter your age : ");
		int age = in.nextInt();

		if(age<18)
		{
			throw new YoungerAgeException(" You are below 18 years, you cannot vote !!");
		}
		else
		{
			System.out.println(" Please Vote !! ");
		}
	}
}
