// this keyword acts as an return value of an method

class Test
{
  Test m1()
  {
   System.out.println("m1() method...");
   return this;
  }

  public static void main(String[] args)
  {
   new Test().m1();
  }

}