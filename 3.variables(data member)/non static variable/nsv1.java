

class Test
{
  int x=10;
  int b;



   void m1()
   {
 
   System.out.println("Non-static variable can be called directly in nonstatic area");
   System.out.println(x+"*************"+b);

   System.out.println();

   System.out.println("Non-static variable can also be callled by object name in non-static area");
   Test t = new Test();
   System.out.println(t.x+"***********"+t.b);

   }

   public static void main(String[ ] args)
   {

   Test t= new Test();
   t.m1();

   System.out.println("Non static variable can't be directly called in static area");    
   //System.out.println(x+"*********"+b);// error: non-static variable b cannot be referenced from a static context
   
   System.out.println();

   System.out.println("Non static variable can be called by object name in static area");
   System.out.println(t.x+"***********"+t.b);

   }



}