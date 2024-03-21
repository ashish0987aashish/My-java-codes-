// EXAMPLE OF METHOD HAVING RETURNTYPE // 

class Test
{
  void m1()
  {
  System.out.println("m1() method...");
  return ;
  }
   
  int m2()
  {
  System.out.println("m2() method...");
  return 0;
  }
   
  double m3()
  {
  System.out.println("m3() method...");
  return 1.6;
  }

  char m4()
  {
  System.out.println("m4() method...");
  return 'c';
  }
 
  public static void main(String[] args)
  {
   Test t =new Test();

   t.m1();
   t.m2();
   t.m3();
   t.m4();
  }

} 

    
 












 