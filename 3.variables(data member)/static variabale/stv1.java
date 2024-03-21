class Test
{

  static int x=100;
  static String name;
 
  void m1()
  {

   System.out.println(x+"..."+name); // called directly
   System.out.println(Test.x+"..."+Test.name); // called by classname
   Test t =new Test();
   System.out.println(t.x+"..."+t.name);  // called by object name
  }
 
  public static void main(String [] args)
  {
   Test t = new Test();
   t.m1();
  }

 }
   
  

   