import java.util.*;
 
class Test
{
 
 public static void main(String[] args)
 {
  
  ArrayList<Character> list = new ArrayList<Character> ();

  System.out.println(list); 
  
  list.add('A');
  list.add('B');
  list.add('C');
  list.add('D');
  list.add('E');
  System.out.println(list);
 
  ListIterator <Character> litr = list.listIterator();
  System.out.println("Traversing by using listIterator method (forward)"); 
  while(litr.hasNext())
  {
   System.out.print(litr.next()+" ");
  }

  System.out.println();

  System.out.println();
 
  System.out.println("Traversing by using listIterator method (backward)");
  while(litr.hasPrevious())
  {
   System.out.print(litr.previous()+" ");
  }
   
 }

}
  
   
   
 
 