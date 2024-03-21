//EXAMPLE OF WRITING BUSINESS LOGIC INSIDE THE CONSTRUCTOR

class Testc8
{
    void add(int x,int y)
   {
      System.out.println("add() method......");
      System.out.println("Addition="+(x+y));
   }

    Testc8(int m,int n) 
   {
      System.out.println("Test constructor....");
      System.out.println("Subtraction="+(m-n));
   }
   public static void main(String [] args)
    {
     new Testc8(100,10).add(100,10);
    }

 }