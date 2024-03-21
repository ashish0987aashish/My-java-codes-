class Test
{

   void m1(int d)
   {
    int a = 10;
    int e;
    //System.out.println(Test.a);//error: cannot find symbol

    Test t = new Test();
    //System.out.println(t.a);//error: cannot find symbol

    System.out.println(a);   
    System.out.println(d);
    //System.out.println(e);//error: variable e might not have been initialized
   }


   Test()
   {
    int b = 20;
    System.out.println(b);   
   }

   
   static 
   {
    int c = 30;
    System.out.println(c);
    //System.out.println(a);//error: cannot find symbol 
   } 

}
