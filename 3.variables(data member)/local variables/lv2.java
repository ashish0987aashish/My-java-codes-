class Test
{
 
   void m1(int b)  // method with function parameter
   {

     int a=10;
     b=111;
     int c;
     System.out.println(a);//10
     System.out.println(b);//111
     //System.out.println(c);// error: variable c might not have been initialized

    }


   public static void main(String[] x)
   {
    Test t = new Test();
    t.m1(39);
   }


}  

   
      
  