import java.util.*;
 
class Test
{
  public static void main(String[] args)
  {
   
   Vector<String> v= new Vector<String> (); 
   System.out.println(v);
 
   v.add("Tiger");
   v.add("Lion");
   v.add("Dog"); 
   v.add("Elephant"); 
   v.add("Lion");
   System.out.println(v); 
  
   v.addElement("Rat");
   v.addElement("Cat");
   v.addElement("Deer");
   v.insertElementAt("Goat",2);
   
   System.out.println(v);

   System.out.println(v.get(1));
   System.out.println(v.lastElement());
   System.out.println(v.isEmpty());
   System.out.println(v.indexOf("Lion"));
   System.out.println(v.lastIndexOf("Lion"));
   
   System.out.println(v.elementAt(3));
   System.out.println(v.contains("Lion"));
   v.clear();
 
   System.out.println(v);
  
   }

}
    
  
  
 
   
  
  
 