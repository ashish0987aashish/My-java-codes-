import java.util.*;
  
class Test 
{
 public static void main(String[] args)
 {
  Stack<Integer> st = new Stack<Integer>();

  System.out.println(st);
 
  st.push(111); 
  st.push(222);
  st.push(333);
  st.push(111);
  st.push(555);
  st.push(444); 
  System.out.println(st);

  System.out.println();
  
  System.out.println(st.peek());

  st.pop();
  System.out.println(st);
  
  System.out.println();

  System.out.println(st.search(555));

  System.out.println(st.search(444));
 
  System.out.println(st.empty());

  System.out.println(st.size());

  st.clear();
  
  System.out.println(st);

  

 }

}