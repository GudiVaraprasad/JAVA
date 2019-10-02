import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();                  //no. of elements in an array a
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();                //enter elements of array a
        }
        int k=in.nextInt();                  //enter kth smallest element to find in an array a
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1)
            {
                System.out.println(k+" smallest element is "+a[a.length-i]);                 //x element from begining is (n-x) element from end 
            }
        }
        
    }
}