// MULTIPLE INHERITANCE IN JAVA USING INTERFACE 

interface A
{
  void m1();
}
 

interface B
{
  void m1();
}


class C implements B,A
{

 public void m1()
 {
   System.out.println("m1() method");
 }

 public static void main(String[] args)
 {
   A obj1= new C();
   System.out.println("m1() method through  object of A class");
   obj1.m1(); 
  
   System.out.println();
 
   B obj2 = new C();
   System.out.println("m2() method through  object of B class");
   obj2.m1();

 }


}
     





