// write a program using static variable,non static variable and local variable.

class Test
{
   
   static int a=10;
   int b=20;
   
   void m1(int c)
   {
   
     Test t= new Test();
     int d=40;
      
     System.out.println(a+"..."+Test.a+"..."+t.a);
     System.out.println(b+"..."+t.b);
     System.out.println(c+"..."+d);
   
    }  
   
    public static void main(String[] args)
    {
      Test t = new Test();
    
      System.out.println("Variables called inside main() method");
      System.out.println(a+"..."+Test.a+"..."+t.a);
      System.out.println(t.b);
       
      System.out.println();

      System.out.println("Variables called inside m1() method");
      t.m1(75);
    }

 } 
   
    