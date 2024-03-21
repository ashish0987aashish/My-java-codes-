class Test
{


    public static void main(String [] args)
    {
        String s1= new String("Varun");
        String s2= new String("Varun");
        
        System.out.println(s1==s2);

        System.out.println();
 
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Varun"));
        
        System.out.println();
    
        int a=17;
        int b=18;
        System.out.println(a==b);
   
        System.out.println();
   
        //System.out.println(a.equals(b));//error it is only for string
      
        
        
   }
 
  

}