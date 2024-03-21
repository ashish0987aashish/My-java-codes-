class Test
{
 
  {
   System.out.println("non static 1");
  }
 
  {
   System.out.println("non static 2");
  } 
  
  Test()
  {
   System.out.println("constructor() execution");
  }
 
 
  public static void main(String[] args) 
  {
   System.out.println("main method");
   Test t1= new Test();
   Test t2 = new Test();
  
  }
     

}
 
