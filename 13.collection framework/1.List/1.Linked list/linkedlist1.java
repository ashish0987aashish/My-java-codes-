import java.util.*;
 
class Test
{
   public static void main(String[] args)
   { 
     
    LinkedList list = new LinkedList();
    System.out.println(list);
    System.out.println(list.isEmpty());
    System.out.println(list.size());
   
    System.out.println();
 

    list.add("Chandra");
    list.add("101");
    list.add('c');
    list.add(8.9);
    list.add(true);
    list.add(100);
    list.add("java"); 
    list.add(123);
    list.add("tiger");
    list.add("lion");
    
    System.out.println(list);

   }

}

   