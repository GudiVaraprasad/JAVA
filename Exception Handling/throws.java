
import java.util.*;
import java.io.*;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("D:/abc.txt");
		// statements
	}

	void saveFile() throws FileNotFoundException
	{
		String text = "This is written from the code into file";
		FileOutputStream fos = new FileOutputStream("D:/abc.txt");
		// statements
	}
}

class FileCheck
{
	public static void main(String[] args) 
	{
		ReadAndWrite rw = new ReadAndWrite();
		
		try
		{
			rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

		try
		{
			rw.saveFile();
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
	}
}
