import java.util.*; 
 
class Test
{
 
 public static void main(String[] args)
 {
  
  HashSet<Integer> set1 = new HashSet<Integer> ();
  TreeSet<Integer> set2 = new TreeSet<Integer> ();
 
  int[] arr = {111,222,444,333,555,222};
 
  for(int x : arr)
  {
   set1.add(x);
   set2.add(x);
  }
 
  System.out.println(set1);
  System.out.println(set2);
 
  set2.remove(222);
  System.out.println(set2);
  System.out.println(set1);
 
  System.out.println(set1.size());
  System.out.println(set2.size());
   
 }

}
  