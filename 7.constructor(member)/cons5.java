//EXAMPLE OF CONSTRUCTOR CHAINING
 
 class Testc5
 {
  
         Testc5()
         {
             this(34);
             System.out.println("Testc5() constructor with 0 args");
             //this(34);//"this" must be the first inside the constructor
         }

          Testc5(int x)
          {
             this(23,"raj");
             System.out.println("Testc5() constructor with 1 args");
   
          }
 
          Testc5(int x,String s)
          {
   
             System.out.println("Testc5() constructor with 2 args");
    
          }
   
      public static void main(String [] args)
      {
  
        new Testc5();

      }


 }
 
    
     
  