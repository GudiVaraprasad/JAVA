import java.util.*;
class Main 
{
    public static int SUM(int[] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] myArray=new int[n];
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=in.nextInt();
        }
        Main obj=new Main();
        System.out.println("Sum of the elements of the array is: " +obj.SUM(myArray));
        
    }
}