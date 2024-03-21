import java.util.*;

class Test
{
  public static void main(String[] args)
  {  
  TreeMap<Character,String>  map3 = new TreeMap<Character,String> ();
 
  System.out.println(map3);
  
  map3.put('a',"java");
  map3.put('b',"oracle");
  map3.put('c',"Adv. java");
  map3.put('d',"python");
  map3.put('h',"hybernate");
  
  System.out.println(map3);
 
  System.out.println();

  System.out.println(map3.firstEntry());
  System.out.println(map3.lastEntry());
  System.out.println(map3.keySet());
  System.out.println(map3.entrySet());
  System.out.println(map3.containsKey('d'));
  System.out.println(map3.containsKey('f'));
  System.out.println(map3.remove('h'));
  System.out.println(map3);


 
 
  }

}
  
 