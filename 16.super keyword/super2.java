//  "super" keyword is used to invoke super class method()

class Parent 
{
  void m1() 
  {
   System.out.println("m1() method of parent class");
  }
   
}

class Child extends Parent
{
  void m1()
  {
   super.m1();
   
   System.out.println("m1() method of child class");
 
  }
 
  public static void main(String[] args)
  {
   Child c = new Child();
   c.m1();
  }  
    
}  
