import java.util.*;
 
class Test 
{
  public static void main(String[] args)
  {
  
  ArrayList<Integer> list = new ArrayList<Integer>();
  
  System.out.println(list);
  System.out.println(list.isEmpty());

  list.add(111);
  list.add(0,222);
  list.add(1,333);
  list.add(444);
  list.add(333);
 
  System.out.println(list);
 
  System.out.println();
 
  System.out.println("Treversing using get() method");
  for(int i=0; i<list.size(); i++)
  {
    System.out.print(list.get(i)+" ");
  }

  System.out.println();

  System.out.println();
 
  System.out.println("Traversing using iterator interface"); 
  Iterator<Integer> itr = list.iterator();
   
  while(itr.hasNext())
  {
   System.out.print(itr.next()+" ");
  }

  System.out.println();
  System.out.println();
  
  list.remove(0);
  list.remove(1);
  System.out.println(list);
  
  list.clear();
  System.out.println(list);
  }

}
 
  
 
  