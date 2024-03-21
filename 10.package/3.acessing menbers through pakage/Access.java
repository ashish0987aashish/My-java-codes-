// It is better to call a fully qualified name (like j2se.sbc) instead of using import keyword

package j2me;

 class Access
{  

  public static void main(String [] args)
{
    
   System.out.println("With respect to Sbc");
   j2se.Sbc obj1= new j2se.Sbc();
   obj1.display();

   System.out.println();

   System.out.println("With respect to Ssc");
   j2se.Ssc obj2= new j2se.Ssc();
   obj2.display();

   System.out.println();

   System.out.println("With respect to Sic");
   j2se.Sic obj3= new j2se.Sic();
   obj3.display();

   System.out.println();
  
   System.out.println("With respect to Osc");
   j2ee.Osc obj4= new j2ee.Osc();
   obj4.display();

   System.out.println();

   System.out.println("With respect to Oic");
   j2ee.Oic obj5= new j2ee.Oic();
   obj5.display();
  
}

 }
