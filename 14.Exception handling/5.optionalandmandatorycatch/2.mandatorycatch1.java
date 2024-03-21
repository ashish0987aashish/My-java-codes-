class Test2
{

 public static void main(String[] args)
 {
     
  try
  {

   System.out.println("try block");
   int x=10, y=0;
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


// Here catch block is executed because try block has a "exception"//