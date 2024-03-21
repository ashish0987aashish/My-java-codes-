// EXAMPLE TO ADD TWO NUMBERS BY USING RETURN VALUE OF METHOD 

class Test
{
 
  int m1()
  {
   System.out.println("m1() method...");
   return 45;
  }

  int m2()
  {
   System.out.println("m2() method...");
   return 55;
  }

  public static void main(String[] args)
  {
    Test t = new Test();

    int x= t.m1();
    System.out.println("m1() method returns value "+x);
    
    System.out.println();
 
    int y=t.m2();
    System.out.println("m2() method returns value "+y);
 
    System.out.println();

    int add=x+y;
    System.out.println("Addition result ="+add);

  }

}
  
    

  
     
    
 