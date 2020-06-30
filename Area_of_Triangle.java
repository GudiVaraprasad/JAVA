import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double n,A,h;
        n=in.nextDouble();
        h=in.nextDouble();
        A=area(n,h);
        System.out.println("Area of Triangle is=" +A);
    }
    public static double area(double W,double H)
    {
        double Area;
        Area=(0.5)*(W)*(H);
        return Area;
    }
}
