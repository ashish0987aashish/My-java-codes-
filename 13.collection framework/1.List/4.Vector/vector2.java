  import java.util.*;
 
  class Test
  {
   public static void main(String[] args)
   {
     Vector<String> v1 = new Vector<String> ();
     System.out.println(v1);   
     
     v1.add("A");
     v1.add("B");
     v1.add("C");
     System.out.println(v1);
    
     System.out.println(); 

     Vector<String> v2= new Vector<String> ();
     System.out.println(v2);
    
     v2.add("A");
     v2.add("B");
     v2.add("C");
     System.out.println(v2); 
   
     System.out.println("Vector v1 is equal to vector v2 ? that is "+v1.equals(v2)); 
 
     System.out.println();
  
     Vector<Integer>  v3 = new Vector<Integer> ();
     Vector<Integer>  v4 = new Vector<Integer> ();
   
     v3.add(4);
     v3.add(3);
     v3.add(3);
     v3.add(1);
     System.out.println(v3);
   
     System.out.println(v4);

     v4=(Vector)v3.clone();
     System.out.println(v4);
   
  

 
   
    
     
  
 
  
  
    

  }

}
   
   
     

 
 
 
    
    