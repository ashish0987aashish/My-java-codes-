// 2. this keyword is used to invoke current class non-static method()

class Test
{
  void m1()
  {
   System.out.println(10);
   this.m2();
   this.m3();
  }
   
  void m2()
  {
   System.out.println(20);
  }
   
  void m3()
  {
   System.out.println(30);
  }
 
  public static void main(String[] args)    
  {
   Test t = new Test();
   t.m1();
  }
 
 
} 
    
    