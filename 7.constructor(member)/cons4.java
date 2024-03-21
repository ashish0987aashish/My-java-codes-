//EXAMPLE OF CONSTRUCTOR OVERLOADING


class Testc4
{
 
    Testc4()//(1)
   {
    System.out.println("Testc4() constructor with 0 args");  
   }
    
    Testc4(int x)//(3)
   {
    System.out.println("Testc4() constructor with 1 args");
   }
 
    Testc4(int x,String s)//(2)
   {
    System.out.println("Testc4() constructor with 2 args");

   }

  public static void main(String [] args)
     {
       new Testc4();
       new Testc4(10,"Raj");
       new Testc4(57);
     }


} 
