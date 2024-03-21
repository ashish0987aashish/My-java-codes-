// EXAMPLE OF METHOD() HAVING RETURNTYPE OF CURRENT CLASS 

 class Test
 {
 
  Test m1()
  {
    System.out.println("m1() method...");
    Test t = new Test();
    return t;
  }

  Test m2()
  {
    System.out.println("m2() method...");
    return new Test();
  }
 
  Test m3()
  {
    System.out.println("m3() method...");
    return this;
  }

  public static void main(String[] args)
  {
 
   Test t = new Test();
   
   Test t1= t.m1();
   System.out.println("m1() method returns value "+t1);
 
   System.out.println();

   Test t2= t.m2();
   System.out.println("m2() method returns value "+t2);

   System.out.println();

   Test t3= t.m3();
   System.out.println("m3() method returns value "+t3);
  
  }

}

   















    
  
 
    
   