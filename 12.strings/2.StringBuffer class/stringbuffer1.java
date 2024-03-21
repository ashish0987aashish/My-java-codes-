class Test
{
  public static void main(String[] args)
  {
 
   String s1= new String("Hello");
   
   System.out.println(s1);
   System.out.println(s1.concat("World"));
   System.out.println(s1);

   System.out.println();

   StringBuffer sb1= new StringBuffer("Hello");
  
   System.out.println(sb1);  
   System.out.println(sb1.append("World"));
   System.out.println(sb1);
 
   }

}
   

   