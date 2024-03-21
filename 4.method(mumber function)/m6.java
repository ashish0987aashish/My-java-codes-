// CALLING INSTANCE VARIABLE USING "this" KEYWORD

class Test
{

 int a=18;
 void m1(int a)
 {
  System.out.println("The value of local variable a="+a);
  System.out.println("The value of instance variable a="+this.a);
  }

 public static void main(String[] args)
 {
  Test t = new Test(); 
  t.m1(47);
 }
  
}   