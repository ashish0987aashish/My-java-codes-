// EXAMPLE OF COPY CONSTRUCTOR

class Test
{
  int a=10;
  int b=20;
  
  Test()
  {
   System.out.println("Test() constructor with no arguments");
  }
  
  Test(Test obj)// copy constructor
  {
   System.out.println("Test() constructor with 1 arguments");
   this.a= obj.a;
   this.b= obj.b;
   
  }

  public static void main(String[] args)
  {  
   Test t1 = new Test();
   System.out.println("Memory adress of t1="+t1);
   System.out.println(t1.a);
   System.out.println(t1.b);
 
   t1.a=111;
   t1.b=222;
   System.out.println("After updating the value of a&b");
   System.out.println(t1.a);
   System.out.println(t1.b);

   System.out.println("---------------------------------");

   Test t2 = new Test(t1);
   System.out.println("Memory adress of t2="+t2);
   System.out.println(t2.a);
   System.out.println(t2.b);
  }

     
 }