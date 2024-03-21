import java.util.*;
 
class Test
{
 public static void main(String[] args)
 {
   LinkedList<Integer> list = new LinkedList<Integer>();
 
   System.out.println(list);
   
    list.add(111);
    list.add(222);
    list.addFirst(333);
    list.add(444);
    list.addLast(555);
    list.add(333);
    System.out.println(list);
    list.add(1,999);
    System.out.println(list);
    Collections.sort(list);
    System.out.println("After sorting the list is :"+list);
    System.out.println();
    System.out.println(list.contains(777));
    System.out.println(list.contains(555));
    System.out.println(list.indexOf(333));
    System.out.println(list.lastIndexOf(333));
    System.out.println(list.get(6));
    System.out.println();
    
    Object[] arr = list.toArray();

    for(Object o:arr)
    {
     System.out.print(o+" ");
    }

    System.out.println();
    System.out.println("......................");
  
    for(Integer x:list)
    {
     System.out.print(x+" ");
    }
    
    System.out.println();
  
    System.out.println("First element:"+list.getFirst()); 
 
    System.out.println("Last  element:"+list.getLast());

 }

}  
    
 
 
     
    



 
     
  
 
 