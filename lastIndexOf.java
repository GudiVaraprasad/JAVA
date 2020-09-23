import java.util.*;
import java.io.*;
import java.lang.*;

class lastIndexOf
{

	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String of 0's and 1's : ");
		String str = in.nextLine();

		int index = str.lastIndexOf("0");  // lastIndexOf() is a method in util.String library..

    System.out.println("Last index of 0 : "+index);

	}

}
