// this keyword is used to invoke current class constructor

class Test
{
  Test()
  {
   this(34,15);
   System.out.println("Test() constructor with o arguments");
  }

  Test(int a)
  {
   System.out.println("Test() constructor with 1 arguments");
  }
   
  Test(int a,int b)
  {
   this(40);
   System.out.println("Test() constructor with 2 arguments");
  }
 
  public static void main(String[] args)
  {
    new Test();
  }

}
