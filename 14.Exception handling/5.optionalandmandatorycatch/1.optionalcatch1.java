class Test1
{

 public static void main(String[] args)
 {
     
  try
  {

   System.out.println("try block");
   int x=10, y=2;
   System.out.println(x/y);

  }
   
  catch(Exception e)
  {
 
   System.out.println("catch block");
  
  }
 
   finally
  {

   System.out.println("finally block");
  
  }




 }

}

// here catch block did not get executed because try block did not have any "exception"//