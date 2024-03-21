class Test 
{

 int x=101;
 int y;

 void m1()
 {
  System.out.println(x);//101
  //System.out.println(Test.x);//error: non-static variable x cannot be referenced from a static context
  Test t = new Test();
  System.out.println(t.x);//101
  System.out.println(y+"..."+t.y);//0...0 
 }

 public static void main(String[] args)
 {
  //System.out.println(x);// error: non-static variable x cannot be referenced from a static context
  Test t = new Test();
  System.out.println(t.x);//101
  System.out.println(t.y);//0
  t.m1();  
 }

}