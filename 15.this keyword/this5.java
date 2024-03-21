// This keyword is also used as a parameter in constructor calling


class Test
{
  Test(Test obj)
  {
   System.out.println("Test() constructor with 1 argument");
  }

  Test()
  {
   new Test(this);
  }

  public static void main(String[] args)
  {
   new Test();
  }

}
    