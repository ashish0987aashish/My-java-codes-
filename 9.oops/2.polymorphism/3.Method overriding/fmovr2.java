// OVERRIDING MEHOD CAN BE FINAL NO WORRIES


class P
{
  void m1(int a)
  {}
}

class C extends P
{
 final void m1(int a)
 {
   System.out.println("The value of local variable a="+a);
 }
 
 public static void main(String[] args)
 {
   C c = new C();
   c.m1(100);
 }

}
