import java.util.*;
 
class Test
{
  
  public static void main(String[] args)
  { 

  HashSet<Integer> set = new HashSet<Integer> (); 
  System.out.println(set); 
 
  int[] arr = {1111,2222,3333,4444};

  for(int x :arr)
  {  
   set.add(x);
  }
  System.out.println(set);
  
  }
}