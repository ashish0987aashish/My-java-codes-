// EXAMPLE OF IMPLEMENTATION OF ABSTRACT METHOD USING INHERITANCE 

abstract class Test
{

 abstract void m1();
 void m2()
 {
   System.out.println("m2() method is already complete...");
 }

}

 class Demo extends Test
{
  void m1()
  {
    System.out.println("abstract mathod m1()  got completed in the child class...");
  }
 
  public static void main(String[] args)
  {
   Demo d = new Demo();
   d.m2();
   d.m1();
  }

}
   
    
 

