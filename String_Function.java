import java.util.*;

public class String_Function 
{
  public static void main(String args[]) 
  {
    String s1 = "Nikhilesh";
    System.out.println("\nExample String is : " + s1);

    // Length Function
    System.out.println("\nLength of String '" + s1 + "' is : " + s1.length());

    // String Concatenation
    String s2=s1.concat(" is my name.");  
    System.out.println("\nConcatenated String is : " + s2);

    // charAt() Function
    char ch1=s1.charAt(3);  
    System.out.println("\nThe character value at 3rd index : " + ch1);

    // getChars() Function
    char[] ch2 = new char[6];
    s2.getChars(0, 5, ch2, 0);
    System.out.println("\nSequence of characters from string - " + s2 + " is : " + ch2);

    // getBytes() Function
    byte[] bytes=s1.getBytes();
    System.out.println("\nSequence of bytes from string - " + s1 + " is : ");  
    for(int i=0;i<bytes.length;i++)
    {  
      System.out.print(bytes[i] + " ");  
    }

    // toCharArray() Function
    char[] ch3=s1.toCharArray();
    System.out.println("\n\nCharacter Array from string - " + s1 + " is : ");  
    for(int i=0;i<ch3.length;i++)
    {  
      System.out.print(ch3[i] + " ");  
    }

    // equals() Function
    System.out.println("\n\nChecking equals ? " + s1.equals(ch3));

    // equalsIgnoreCase() Function
    String s4="nikhilesh";
    System.out.println("\nChecking equalsIgnoreCase ? " + s1 + " and " + s4 + " : " + s1.equalsIgnoreCase(s4));

    // regionMatches() Function
    String chh2 = "khilesh is";
    System.out.println("\nFrom " + s1 + " : " + s1.regionMatches(2, chh2, 0, 10));

    // startsWith() Function
    System.out.println("\nFrom " + s1 + " starts with Nik ? : " + s1.startsWith("Nik"));

    // endsWith() Function
    System.out.println("\nFrom " + s1 + " ends with esh ? : " + s1.endsWith("esh"));

    // compareTo() Function
    String chh3 = "nikhilesh";
    System.out.println("\nComparing " + s1 + " and " + chh3 + " : " + s1.compareTo(chh3));

    // indexOf() Function
    System.out.println("\nIndex of esh in " + s1 + " is : " + s1.indexOf("esh"));

    // lastIndexOf() Function
    System.out.println("\nLast Index of i in " + s1 + " is : " + s1.lastIndexOf("i"));

    // substring() Function
    System.out.println("\nSubstring starting from index 4 : " +s2.substring(4));

    // replace() Function
    System.out.println("\nReplacing n with a : " + s1.replace('n','a'));

    // trim() Function
    System.out.println("\nWithout trim() : " + s1 + "Gunnam");
    System.out.println("\nWith trim() : " + s1.trim()+"is a student");

    // toLowerCase() Function
    String s5 = "NIKHILESH GUNNAM";
    System.out.println("\nLower Case of " + s5 + " is : " + s5.toLowerCase());

    // toUpperCase() Function
    System.out.println("\nUpper Case of " + s4 + " is : " + s4.toUpperCase());

    // join() Function
    System.out.println("\nJoining with $ : " + String.join("$","Nikhilesh","Gunnam"));
  }
}