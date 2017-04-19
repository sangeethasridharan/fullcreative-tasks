import java.util.*;

class Process
{
public void addNew(Map<String, HashMap<String,String>> hashMap)
{
  System.out.println("Added Successfully....." + hashMap);
}

public void addExisting(String name, String no, Map<String, HashMap<String,String>> map)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Name");
   String nameToSearch = sc.nextLine();
   if(name.equals(nameToSearch))
   {
     System.out.println("Do you want to add another number???? \n1.LandlineNumber \n2.Exit");
     int o;
     o = Integer.parseInt(sc.nextLine());

       switch(o)
       {
       case 1:
       System.out.println("Landline Number");
       String lno = sc.nextLine();
       map.get(name).put("LandlineNumber",lno);
       System.out.println("Added......");
       System.out.println(map);
       break;

       case 2:
       System.exit(0);
       break;

       default:
       System.out.println("Enter Correctly");
       System.exit(0);
       }

   }else
   {
     System.out.println("Please add your contact...");
   }
}

public void showContacts(String name)
{
   System.out.println(name);
}

public void search(String name, Map<String, HashMap<String,String>> map)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Name");
   String nameToSearch = sc.nextLine();
   if(name.equals(nameToSearch))
   {
     System.out.println("****** CONTACTS ******");
     System.out.println("Choose what you want to see ??? \n1. MobileNumber \n2. LandlineNumber \n3. Both");
     System.out.println("Enter the number to proceed : ");
     int option = Integer.parseInt(sc.nextLine());
     if(option == 1)
     {
       String s1 = map.get(name).get("Number");
       System.out.println("Number -> "+s1);
     }
     else if(option == 2)
     {
       String s2 = map.get(name).get("LandlineNumber");
       System.out.println("LandlineNumber -> "+s2);
     }
     else
     {
       String s3 = map.get(name).get("Number");
       System.out.println("Number -> "+s3);
       String s4 = map.get(name).get("LandlineNumber");
       System.out.println("LandlineNumber -> "+s4);
     }
   }
}
}

class Contact
{
public static void main(String ar[])
{
  Process process = new Process();

  Scanner scan = new Scanner(System.in);
  int l;
  Map<String, HashMap<String,String>> map = new HashMap<String, HashMap<String,String>>();
  String name="",no="";


  do
  {
  System.out.println("****** CONTACTS ******");
  System.out.println("1. Add New Contacts \n2. Add Existing Contacts \n3. Show Contacts \n4. Search \n5. Exit \n");
  System.out.println("Enter the number to proceed : ");
  l = Integer.parseInt(scan.nextLine());

  switch(l)
  {
  case 1:
  System.out.println("Name: ");
  name = scan.nextLine();
  System.out.println("Number: ");
  no = scan.nextLine();
  map.put(name,new HashMap<String,String>());
  map.get(name).put("Number",no);
  process.addNew(map);
  break;

  case 2:
  process.addExisting(name,no,map);
  break;

  case 3:
  process.showContacts(name);
  break;

  case 4:
  process.search(name,map);
  break;

  case 5:
  System.exit(0);
  break;

  default:
  System.exit(0);
  }
}while(l!=5);
}
}
