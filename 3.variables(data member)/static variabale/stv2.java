class Test 
{
  static int x=10;
  static int y;
 
  void show()
  {
   System.out.println(x+"..."+y);// 10...0
   System.out.println(Test.x+"..."+Test.y);// 10...0
   Test t = new Test();
   System.out.println(t.x+"..."+t.y);// 10...0
  } 
  static void display()
  {
   System.out.println(x+"..."+y);// 10...0
   System.out.println(Test.x+"..."+Test.y);// 10...0
   Test t = new Test();   
   System.out.println(t.x+"..."+t.y);// 10...0
  }
   
  public static void main(String[] args)
  {
   Test t = new Test();
   t.show();
   System.out.println("............");
   Test.display();
  }
   
}