import java.util.*;
class Main 
{
  String name;
  String emp_id;
  
  Main(String name, String emp_id)       // parameterized constructor
  {
    this.name=name;
    this.emp_id=emp_id;
    System.out.println(name+" --- "+emp_id);
  }
  
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    Main obj1=new Main("gvp","1235");
    Main obj2=new Main("abhi","4456");
    Main obj3=new Main("yash","8799");
  }
}
