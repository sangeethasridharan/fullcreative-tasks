import java.util.*;
import java.io.*;

class FileExample
{
  public static void main(String ar[])throws Exception
  {
    Map<String, HashMap<String,String>> map = new HashMap<String, HashMap<String,String>>();
    map.put("1",new HashMap<String,String>());
    map.get("1").put("san","short");
    map.get("1").put("sangy","long");
    String s = map.get("1").get("sangy");
    System.out.println(s);

    BufferedReader in = new BufferedReader( new FileReader("example.txt"));

      FileOutputStream fos = new FileOutputStream("example.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(map);
      oos.close();

      FileInputStream fis = new FileInputStream("example.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Map<String,HashMap<String,String>> myMap = (Map<String,HashMap<String,String>>) ois.readObject();
      System.out.println("After Retriving: "+myMap);
      ois.close();


  }
}
