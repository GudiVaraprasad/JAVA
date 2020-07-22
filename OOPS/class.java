import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
	  Box obj=new Box();
	  obj.width=100;
	  obj.length=200;
	  obj.height=50;
	  double volume = obj.width*obj.length*obj.height;
	  System.out.println("Volume is : "+ volume);
	}
}
class Box 
  {
	  double width;
	  double length;
	  double height;
	}
