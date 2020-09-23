/*
Create a class Library with void Bookno(int), void getBookNo() as members. Create another class Book which is a subclass of Library, String author, String title , 
void get_info(String author,String title) are the members of class Book. Define an interface Branch, String sub_name = ”JAVA”, void disp_subname() are members ofinterface.
Create another class Issue which extends Book class and implements the interface (Branch). Write a Test class to demonstrate the above (use classes andinterface).
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Library 
{
	int numberOfBooks;

	void BookNo(int numberOfBooks)
	{
		this.numberOfBooks = numberOfBooks;
		System.out.println("Number of Books are : " + numberOfBooks);
	}

	void getBookNo()
	{
		System.out.println("Book Number here : ######");
	}
}


class Book extends Library
{
	static String author="Herbert Schildt";
	static String title="Java: The Complete Reference";

	void get_info(String author, String title)
	{
		System.out.println("Author of the Book is : " + author);
		System.out.println("Title of the Book is : " + title);
	}
}


interface Branch
{
	static String sub_name = "JAVA";
	void disp_subname(String sub_name);
}


class Issue extends Book implements Branch
{
	public void disp_subname(String sub_name)
	{
		System.out.println("Subject of the Book is : " + sub_name);
	}
}


public class Test  // Solution 3
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println();
		Issue obj = new Issue();
		System.out.print("Enter the number of books : ");
		int numberOfBooks = in.nextInt();
		System.out.println();
		obj.BookNo(numberOfBooks);
		obj.getBookNo();
		obj.get_info(Issue.author,Issue.title);
		obj.disp_subname(Issue.sub_name);
	}
}
