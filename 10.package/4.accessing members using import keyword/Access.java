// It is better to call a fully qualified name (like j2se.sbc) instead of using import keyword



package j2me;

import j2se.*;
import j2ee.*;


 class Access
{  

  public static void main(String [] args)
{
    
   System.out.println("With respect to Sbc");
   Sbc obj1= new Sbc();
   obj1.display();

   System.out.println();

   System.out.println("With respect to Ssc");
   Ssc obj2= new Ssc();
   obj2.display();

   System.out.println();

   System.out.println("With respect to Sic");
   Sic obj3= new Sic();
   obj3.display();

   System.out.println();
  
   System.out.println("With respect to Osc");
   Osc obj4= new Osc();
   obj4.display();

   System.out.println();

   System.out.println("With respect to Oic");
   Oic obj5= new Oic();
   obj5.display();
  
}

 }