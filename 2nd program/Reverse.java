/* This program is used to reverse the string */

import java.util.*;
import java.io.*;

class Process // without using builtin and without builtin
{
  public void revrse() // Program process without builtin
  {
      Scanner sc = new Scanner(System.in);
      String s="",rev=" ";
      int len,i;
      System.out.println("***** Reversing the String without BUILTIN function *****");
      System.out.println("Enter the String :");
      s = sc.nextLine();
      len = s.length();
      for(i=len-1;i>=0;i--)
      {
        rev += s.charAt(i);
      }
      System.out.println("\n ******* Reversed String *******");
      System.out.println(rev);
  }

  public void revrse1() // program process with builtin
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("***** Reversing the String with BUILTIN function *****");
    System.out.println("Enter the String :");
    String s1="";
    try
    {
    s1 = br.readLine();
    StringBuffer sb = new StringBuffer(s1);
    sb.reverse();

    System.out.println("\n ******* Reversed String *******");
    System.out.println(sb);
    }
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    }
  }
}

class Reverse // Main class
{
  public static void main(String ar[])
  {
    Process p = new Process();
    p.revrse();
    p.revrse1();
  }
}
