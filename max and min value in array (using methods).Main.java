import java.util.*;
class Main 
{
   public int max(int [] array) 
   {
      int max = 0;
      for(int i=0; i<array.length; i++ )
      {
         if(array[i]>max)
        {
            max = array[i];
        }
      }
      return max;
   }

   public int min(int [] array) 
   {
      int min = array[0];
   
      for(int i = 0; i<array.length; i++ )
      {
         if(array[i]<min) 
         {
            min = array[i];
         }
      }
      return min;
   }

   public static void main(String args[]) 
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = in.nextInt();
      int[] myArray = new int[n];
      System.out.println("Enter the elements of the array: ");

      for(int i=0; i<myArray.length; i++)
      {
         myArray[i] = in.nextInt();
      }
      Main obj = new Main();
      System.out.println("Maximum value in the array is: "+obj.max(myArray));
      System.out.println("Minimum value in the array is: "+obj.min(myArray));
   }
}