import java.util.*;

class ArmstrongException
{
   public static void main(String args[])
   {
  try{

  int num, number, temp, total = 0;
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
          throw new ArmstrongNotFoundException();
  }
 catch(ArmstrongNotFoundException e){
    System.out.println(e) ;
 }
}
}

class ArmstrongNotFoundException extends Exception
{
   public String toString()
   {
     return "Armstrong Not Found Exception" ;
  }
}
