// 4. This keyword is used as a parameter of method invokation

class Test
{
  void m1(Test x)
  {
   System.out.println("m1() method...");
  }

  void m2()
  {
   m1(this);
  }

  public static void main(String[] args)
  {
   Test t = new Test();
   t.m2();
  }

}