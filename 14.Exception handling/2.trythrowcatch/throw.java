class Test1
{

  void m1(int a,int b)
  {
    System.out.println("m1() method");
    System.out.println("===========");
    System.out.println("Addition="+(a+b));
 
   try
   {
      throw new Exception();
   }

   catch (Exception e)
   {
    
   }
   
 }

    public static void main(String [] args)
   {

     new Test().m1(60,40);
  
   }


}
    
   
   