   // EXAMPLE OF PARAMETEERIZED METHOD

class Test
{
 
   void show()
   {
     System.out.println("show() method...");
   }

   static void display(int a)
   {
     System.out.println("void() method...");
   }
   
   void fun(String s,double d)
   {
    System.out.println("fun() method");
   }

   public static void main(String [] args)
   {
     Test t = new Test();  
     t.show();
     t.display(34);
     t.fun("raja",4.3);
   }
     
 }     
   
   
    
  
