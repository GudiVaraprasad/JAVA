import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int i,j=0;
        for( i=10;i<50;i=i*2)
        {
          System.out.println("i="+i);
          for( j=i;j>0;j=j/2)
          {
              if(j%2==0)
              {
                  break;
              }
              else
              continue;
          }
        }
        System.out.println("j=" +j);
    }
}