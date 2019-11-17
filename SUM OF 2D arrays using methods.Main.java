import java.util.*;
class Main 
{
    public static int SUM(int[][] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                 sum=sum+array[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        System.out.println("Enter the array elements: ");
        int[][] myArray=new int[i][j];
        for(i=0;i<myArray.length;i++)
        {
            for(j=0;j<myArray.length;j++)
            {
               myArray[i][j]=in.nextInt();
            }
        }
        Main obj=new Main();
        System.out.println("Sum of the elements of the array is: " +obj.SUM(myArray));
        
    }
}