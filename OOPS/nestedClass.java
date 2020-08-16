
// Perfect example for nested classes, objects methods.

import java.util.*;
class C{
    int i;
    static int k;
    void Method()
    {
        B b=new B();
        b.j=10;
        System.out.println(b.j);
}
class B{
    int j;
    void Method(){
        i=10;
        k=15;
        j=12;
        System.out.println(j);
    }
}
}
public class nestedClass
{
    public static void main(String[] args) {
        C c=new C();
        C.B b=c.new B();  // nested class syntax
        b.Method();  // output is 12
        c.Method();  // output is 10 
    }
}
