import java.util.*;
 
class Test
{
 public static void main(String[] args)
 {
  Queue<Integer> q= new LinkedList();
   
  System.out.println(q);
  
  q.add(111);
  q.add(222);
  q.add(333);
  q.add(555);
  q.add(444);
  q.add(333);
  
  System.out.println(q);
 
  System.out.println();
  
  Deque<Integer> dq = new LinkedList<Integer> ();
  System.out.println(dq);
 
  dq.add(111);
  dq.add(222);
  dq.add(333);
  dq.add(555);
  dq.add(444);
  dq.add(333);

  System.out.println(dq);
  
  System.out.println();
  

  dq.removeFirst();
  System.out.println(dq);
 
  dq.removeLast();
  System.out.println(dq);
  
 }

} 
  
 
  
 
 