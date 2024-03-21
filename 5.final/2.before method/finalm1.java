// FINAL METHODS CAN NOT BE OVERRIDDEN

class A
{
 final void m1()
 {
  System.out.println("m1() method...");
 }
}

 
class B extends A    
{
  //  void m1()// error: overridden method is final
  {}
  
 
}
 
 
 