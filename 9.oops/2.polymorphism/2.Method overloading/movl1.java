// WITHIN A CLASS MULTIPLE METHODS WITH "SAME NAME" AND "DIFFERENT ARGUMENTS" IS KNOWN AS METHOD OVERLOADING 

class Test
{
 
 void m1()
 {
   System.out.println("m1() method with 0 argument");
 }
 
 void m1(int a)
 {
    System.out.println("m1() method with int...");
 }
  
 void m1(int a,float f)
 {
    System.out.println("m1() method with int,float...");
 }

 public static void main(String [] args)
 {
 
  Test t = new Test();
  t.m1();
  t.m1(24);
  t.m1('c',(float)40.4);
 }

}
 
  
  
 
  
 
   