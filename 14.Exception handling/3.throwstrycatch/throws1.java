class Test1
{
  
   void show(int a,int b)throws Exception
   {

    System.out.println("show() method");
    System.out.println("*************");
    System.out.println("Multiplication="+(a*b));
    throw new Exception();

   }

  public static void main(String [] args)
  {
     Test1 t = new Test1();
    
     t.show(10,19);

  }

}
  
 //   Here in this program called show() method throws exception towards caller object (t)  ,since caller (t) present in main() method, it  throws exception towards the jvm, and jvm handles the Exception  //



 class Test2
{
  
   void show(int a,int b)throws Exception
   {

    System.out.println("show() method");
    System.out.println("*************");
    System.out.println("Multiplication="+(a*b));
    throw new Exception();

   }

  public static void main(String [] args)
  {
     Test1 t = new Test1();
    try
     {
     t.show(10,20);
     }

    catch(Exception e)
    {}
  }

}
   

// Here in this program  called show() method throws exception towards caller object (t) , we handled the exception using "try and catch" keyword in main() method//


