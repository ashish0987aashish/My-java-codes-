// EXAMPLE OF SINGLETON CLASS(ALLOW TO CREATE ONLY ONE OBJECT)

class Test
{

 private static Test obj;
 private Test()
 {}
 public static Test mtest()
 {
   if(obj==null)
   {
     obj=new Test();
   }
   
   else
   {
    System.out.println("Object is already created");
   }

    return obj;
  }

}

class Main
{
 
  public static void main(String[] args)
  {
   
   //Test t = new Test();// error: Test() has private access in Test

    Test t1= Test.mtest();
    Test t2= Test.mtest();
  
    System.out.println(t1+"................."+t2);

  }


}   
   













      

  
   
 