import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);

      System.out.println ("Enter x coordinate : ");
    double x = in.nextDouble ();
      System.out.println ("Enter y coordinate : ");
    double y = in.nextDouble ();
      System.out.println ("Enter width of rectangle : ");
    double w = in.nextDouble ();
      System.out.println ("Enter height of rectangle : ");
    double h = in.nextDouble ();
    Rectangle obj = new Rectangle (x, y, w, h);
      System.out.println (obj.toString ());
      System.out.println ();
      System.out.println ("Enter translate x-coordinate : ");
    double deltaX = in.nextDouble ();
      System.out.println ("Enter translate y-coordinate : ");
    double deltaY = in.nextDouble ();
      obj.translate (deltaX, deltaY);
      System.out.println ();
      System.out.println ("Enter any x coordinate to check : ");
    double xCoord = in.nextDouble ();
      System.out.println ("Enter any y coordinate to check : ");
    double yCoord = in.nextDouble ();
      System.out.println ();
      System.out.println (obj.checkpoint (xCoord, yCoord));
  }
}

class Rectangle
{
  double x, y;
  double w;
  double h;
  public Rectangle (double x, double y, double w, double h)
  {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }

  public double getWidth ()
  {
    return w;
  }

  public double getHeight ()
  {
    return h;
  }

  public double getX ()
  {
    return x;
  }

  public double getY ()
  {
    return y;
  }

  public void translate (double deltaX, double deltaY)
  {
    x += deltaX;
    y += deltaY;
    System.out.println ("x coordinate new = " + x);
    System.out.println ("y coordinate new = " + y);
  }

  public String toString ()
  {
    return "The Rectangle is [ x = " + getX () + ", y = " + getY () +
      ", width = " + getWidth () + ", height = " + getHeight () + " ] ";
  }

  public boolean checkpoint (double xCoord, double yCoord)
  {

    if (xCoord >= x && xCoord <= x + w && yCoord >= y && yCoord <= y + h)
      {
	System.out.println ("The point (" + xCoord + "," + yCoord +
			    ") lies on the rectangle.");
	return true;
      }
    else
      {
	System.out.println ("The point (" + xCoord + "," + yCoord +
			    ") doesn't lie on the rectangle.");
	return false;
      }
  }
}
