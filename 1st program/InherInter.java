/* This program will tell us the price and features of the phone  */
/* This program is an example for Interface, Inheritance and abstract */

import java.util.*;
interface Inter // Interface class
{
  abstract void feature(); // abstract method
}

/* Definitions of the algorithms*/

class Baseinher implements Inter
{
  public void feature() // Common Features of the mobiles
  {
    String output;
    System.out.println("Color - White,Black,Red");
    System.out.println("Camera - Front cam  Back cam ");
    System.out.println("Feature - Bluetooth, Wifi");
  }
}

class Derivedinher extends Baseinher // Derived class
{
  Scanner sc = new Scanner(System.in);
  public void process() // This function is used to process
  {
    int price[] = {10000,20000,33000,14000,15000,16000,17687,18987,29000,10987};
    String prod[] = {"samsung","sony","lenovo","apple","xylo","LG","Moto","Micromax","Nokia","Redmi"};
    System.out.println("Mobile Name: ");
    String n = sc.next();
    for(int i=0;i< price.length;i++)
    {
      if(n.equals(prod[i]))
      {
        System.out.println("...Features of the entered mobile...");
        System.out.println("*****"+ n.toUpperCase() +"******");
        System.out.println("Price : "+price[i]);
        feature();
      }
    }
  }
}

class InherInter // Main class
{
  public static void main (String ar[])
  {
    Derivedinher di = new Derivedinher();
    di.process();
  }
}
