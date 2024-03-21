// EXAMPLE OF METHOD RETURNING VARIABLE VALUE(STATIC , NON STATIC , LOCAL)

class Test
{
 
 static int a=10;
 int b=20;

 int m1()
 {
  return a;
 }

 int m2()
 {
  return b;
 }

 int m3()
 {
  int c=30; 
  return c;
 }

 public static void main(String[] args)
 {
   Test t = new Test();

   int x=t.m1();
   System.out.println("m1() method returns value "+x);

   System.out.println();

   int y=t.m2();
   System.out.println("m2() method returns value "+y);
  
   System.out.println();
 
   int z=t.m3();
   System.out.println("m3() method returns value "+z);
 }

}
    

















 
 