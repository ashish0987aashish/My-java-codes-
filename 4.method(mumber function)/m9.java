// METHOD HAVING RETURNTYPE  , HOLDING THE RETURN VALUE AND DISPLAYING IT 

class Message 
{

   void m1()
   {
    System.out.println("m1() method...");
    System.out.println("m1() method returns nothing");
   }

   static int m2()
   {
    System.out.println("m2() method...");
    return 0;
   }

   double m3()
   {
    System.out.println("m3() method...");
    return 3.4;
   }

   static boolean m4()
   {
    System.out.println("m4() method...");
    return true;
   }
 
   public static void main(String[] args)
   {

    Message m= new Message();
    
    m.m1();

    System.out.println();
    
    int i=Message.m2();
    System.out.println("m2() method returns value "+i);

    System.out.println();
   
    double d=m.m3();
    System.out.println("m3() method returns value "+d);

    System.out.println();
  
    boolean r=Message.m4();
    System.out.println("m4() method returns value "+r);

   }  

}    


    
     

    

 
    


  
   




