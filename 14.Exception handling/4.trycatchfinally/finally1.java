class Test1
{
 
  public static void main(String[] args)throws Exception
  {
 
   System.out.println("Hello");
    

    try
    {
    System.out.println("try block");
    throw new Exception();
    }



    finally
    {    
    System.out.println("finally block");
    System.out.println("End part of the program");
    }

    //System.out.println("Chalo");//unreachable statement

   }

}
  
    //unreachable statements are not supported in java so we write them in "finally" block;






class Test2
{
 
  public static void main(String[] args)
  {
 
   System.out.println("Hello");
    

    try
    {
    System.out.println("try block");
    throw new Exception();
    }
    
    catch(Exception e)
    {
      System.out.println("catch block");
    }



    finally
    {    
    System.out.println("finally block");
    System.out.println("End part of the program");
    }

    //System.out.println("Chalo");//unreachable statement

   }

}






 
 
  