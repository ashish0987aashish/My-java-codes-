class Test
{
 
   static void m1()
   {
    System.out.println("m1() method... ");
   }

   void m2()
   {
    System.out.println("m2() method...");
   }

 public static void main(String [] args)
 {

  Test t = new Test(); 
  
  System.out.println("Calling of m1() method");
  m1();
  Test.m1();
  t.m1();

  System.out.println();
 
  System.out.println("Calling of m2() method");
  // m2(); // error: non-static method m2() cannot be referenced from a static context m2();
  t.m2();
  
 }

}
  
  
  
 
    
    
  