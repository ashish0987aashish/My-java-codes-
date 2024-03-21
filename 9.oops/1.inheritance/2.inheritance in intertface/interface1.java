interface Test
{
  int x=10;
  public static final int y=20;
 
  static void m1()
  {
    System.out.println("m1() method..");
  }

  void m2();
  
  public static void main(String[] args)
  {
   

// Test t = new Test();// error: Test is abstract; cannot be instantiated


   System.out.println("Directly called x="+x);
   System.out.println("By classname called x="+Test.x);

   System.out.println();
  
   System.out.println("Directly called y="+y);
   System.out.println("By calssname called y="+Test.y);

   System.out.println();
 
   System.out.println("Directly called m1:");
   m1();
   System.out.println("By classname called m1:");
   Test.m1();


  }

}
 
  